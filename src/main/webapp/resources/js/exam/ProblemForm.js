/**
 * Created by OvO on 2017/5/2.
 */
function beginButton() {
    $('#countDown').show();
    setInterval(countDown,1000);
    $('#beginButton').remove();
    $('#selectPage').show();
    $('.menu').remove();
    $('#page').removeClass().addClass("col-xs-12 span8")
    blankPage();
    var totalCount = (getCountPage(1)).count;
    for (var i = 1; i <= 10; i++) {
        var data = getById(1, parseInt(Math.random() * totalCount) + 1);
        if (data == "false") {
            i--;
            continue;
        }
        $('#selectPage').append($('<div class="selectBox" id="selectProblem' + i + '"><p>题目'
            + i + '</p><div class="controls"> <p id="selectDetail">' +
            data[0].selectDetail + '</p><div><input id="A" name="A" type="checkbox" value="8"/>A:' +
            data[0].selectA + '</div><div><input id="B" name="B" type="checkbox" value="4"/>B:' +
            data[0].selectB + '</div><div><input id="C" name="C" type="checkbox" value="2"/>C:' +
            data[0].selectC + '</div><div><input id="D" name="D" type="checkbox" value="1"/>D:' +
            data[0].selectD + '</div></div></div>'));
        $('#selectProblem'+i).data("id",data[0].id);//绑定数据
    }

    //button要设置类型，否则浏览器会给button默认类型，如果在表单中就是submit了
    $('#selectPage').append($('<div><button type="button" id="next">下一页</button></div>'));
    $('#selectPage #next').on('click', function () {
        // alert("???")
        $('#blankPage').show();
        $('#selectPage').hide();
    });
}

function blankPage() {
    unProgrammePage();
    var div = $('<div><button type="button" id="back">上一页</button>' +
        '<button type="button" id="next">下一页</button></div>');
    var totalCount = getCountPage(2).count;
    for (var i = 1; i <= 5; i++) {
        var data = getById(2, parseInt(Math.random() * totalCount) + 1);
        if (data == "false") {
            i--;
            continue;
        }
        var answerList = (data[0].keyWord).split(",");
        for (var y = 0; y < answerList.length; y++) {
            var strings = new RegExp(answerList[y], "g");
            data[0].blankDetail = (data[0].blankDetail).replace(strings, "__(" + (y + 1) + ")__");
        }
        $('#blankPage').append($('<div class="selectBox" id="blankProblem' + i + '"><div><p>题目' +
            i + ':' + data[0].blankDetail + '</p></div></div>'));
        $('#blankProblem'+i).data("id",data[0].id);
        $('#blankProblem'+i).data("blankNum",answerList.length);
        for (var y = 1; y <= answerList.length; y++) {
            $('#blankProblem' + i).append($('<div>' + y + '.<input type="text" id="' + y + '"name="' + y + '" /></div>'));
        }
    }
    $('#blankPage').append(div);
    div.find('#back').on("click", function () {
        $('#blankPage').hide();
        $('#selectPage').show();
    });
    div.find('#next').on("click", function () {
        $('#unProgrammePage').show();
        $('#blankPage').hide();
    });
}
function unProgrammePage() {
    programmePage();
    var div = $('<div><button type="button" id="back">上一页</button>' +
        '<button type="button" id="next">下一页</button></div></div>');
    var totalCount = getCountPage(4).page;
    for (var i = 1; i <= 5; i++) {
        var data = getById(4, parseInt(Math.random() * totalCount) + 1);
        if (data == "false") {
            i--;
            continue;
        }
        $('#unProgrammePage').append($('<div class="selectBox" id="unProgrammeProblem' + i + '"><div><p>题目' +
            i + ':' + data[0].detail + '</p></div><textarea cols="50" id="answer" name="' + data[0].id + '" rows="5"></textarea></div>'));
        $('#unProgrammeProblem'+i).data("id",data[0].id);
    }
    $('#unProgrammePage').append(div);
    div.find('#back').on("click", function () {
        $('#unProgrammePage').hide();
        $('#blankPage').show();
    });
    div.find('#next').on("click", function () {
        $('#programmePage').show();
        $('#unProgrammePage').hide();
    });
}
function programmePage() {
    var div = $('<div><button type="button" id="back">上一页</button>' +
        '<button type="submit" id="submit">提交</button></div></div>');
    var totalCount = getCountPage(3).page;
    for (var i = 1; i <= 3; i++) {
        var data = getById(3, parseInt(Math.random() * totalCount) + 1);
        if (data == "false") {
            i--;
            continue;
        }
        $('#programmePage').append($('<div class="selectBox" id="programmeProblem' + i + '"><div><p>题目' +
            i + ':' + data[0].detail + '</p><br><p>时间限制：'+data[0].timeLimit
            +'</p></div><textarea cols="50" id="answerCode"  name="' + data[0].id + '" rows="5"></textarea></div>'));
        $('#programmeProblem'+i).data("id",data[0].id);
        $('#programmeProblem'+i).data("timeLimit",data[0].timeLimit);

    }
    $('#programmePage').append(div);
    div.find('#back').on("click", function () {
        $('#programmePage').hide();
        $('#unProgrammePage').show();
    });
}
/**
 * Created by OvO on 2017/4/17.
 */
window.tableLine = new Array("success", "error", "warning", "info");//表格的样式


/**
 *
 * @param ProblemId
 */
function getPage(ProblemId) {
    $.ajax(
        {
            type: 'get',
            url: '/select/pageCount/' + ProblemId,
            contentType: 'application/json',
            success: function (data) {
                $('.pageButton').empty();
                problemPageFunction = problemPage[ProblemId - 1];
                problemPageFunction(1);
                for (var i = 1; i <= data.page; i++
                ) {
                    $('.pageButton').append("<li><button class='" + i + "' onclick='problemPageFunction(" + i + ")'>" + i + "</button></li>");
                }
                //TODO 下一页功能未实现
                if (data > 1) {
                    $('.pageButton').append("<li><button class='nextPage'>下一页</button></li>");

                }
            },
            error: function () {
                alert("出错了");
            }
        });
}
/**
 * 修改功能
 * @param id
 */
function update(id) {
    $.ajax({
        type: 'post',
        url: "/select/getId/" + $('#problemSelect').val() + "/" + id,
        contentType: 'application/json',
        success: function (data) {//返回的是json数组
            var i = parseInt($('#problemSelect').val());
            switch (i) {
                case 1: {
                    var $selectForm = $('#selectForm').clone();
                    $('#problemId').html(data[0].id);
                    $selectForm.find('#selectDetail').val(data[0].selectDetail);
                    $selectForm.find('#selectA').val(data[0].selectA);//不支持innerHTML
                    $selectForm.find('#selectB').val(data[0].selectB);
                    $selectForm.find('#selectC').val(data[0].selectC);
                    $selectForm.find('#selectD').val(data[0].selectD);
                    $('#table').hide();
                    $('#panel-956299').append($selectForm);
                }
                    return;
                case 2:
                    var $blankForm = $('#blankForm').clone();
                    $('#problemId').html(data[0].id);
                    $blankForm.find('#blankDetail').val(data[0].blankDetail);
                    $blankForm.find('#keyWord').val(data[0].keyWord);
                    $('#table').hide();
                    $('#panel-956299').append($blankForm);
                    return;
                case 3:
                    var $programmeForm = $('#programmeForm').clone();
                    $('#problemId').html(data[0].id);
                    $programmeForm.find('#programmeDetail').val(data[0].detail);
                    $programmeForm.find('#output').val(data[0].output);
                    $programmeForm.find('#inputLimitTime').val(data[0].timeLimit);
                    $('#table').hide();
                    $('#panel-956299').append($programmeForm);
                    return;
                case 4:
                    var $unProgrammeForm = $('#unProgrammeForm').clone();
                    $('#problemId').html(data[0].id);
                    $unProgrammeForm.find('#unProgrammeDetail').val(data[0].detail);
                    $unProgrammeForm.find('#unProgrammeAnswer').val(data[0].answer);
                    $('#table').hide();
                    $('#panel-956299').append($unProgrammeForm);
                    return;
            }
        }
    });
}
/**
 * 查询指定ID的题目
 * @param id
 */
function createFromProblem(id) {
            var i = parseInt($('#problemSelect').val());
            var data = getById(i,id);
            console.log(data);
            switch (i) {
                case 1: {
                    var selectHtml = $('#selectDiv').clone();
                    selectHtml.find('#selectDetail').remove();//直接remove并不能删除
                    selectHtml.find('input').remove();
                    selectHtml.find('label').removeAttr("for");
                    selectHtml.find(".controls")[0].append(createDivProblem(data[0].selectDetail));
                    selectHtml.find(".controls")[1].append(createDivProblem(data[0].selectA));
                    selectHtml.find(".controls")[2].append(createDivProblem(data[0].selectB));
                    selectHtml.find(".controls")[3].append(createDivProblem(data[0].selectC));
                    selectHtml.find(".controls")[4].append(createDivProblem(data[0].selectD));
                    var $backButton = $('<button>返回</button>');//要注意jQuery与原生的区别
                    $backButton.on("click", function () {
                        $('#panel-956299 #selectDiv').remove();
                        $('#table').show();
                    });
                    $backButton.attr("class", "btn btn-inverse");
                    $backButton.find("button").wrap("<div />");
                    selectHtml.find(".controls")[5].append($backButton[0]);//[0]是讲jq对象转换成dom节点
                    $('#table').hide();//隐藏起来，要回退
                    $('#panel-956299').append(selectHtml);
                }
                    return;
                case 2:
                    var blankHtml = $('#blankDiv').clone();
                    blankHtml.find('input').remove();
                    blankHtml.find('label').removeAttr("for");
                    blankHtml.find('button').remove();
                    blankHtml.find('p').remove();
                    blankHtml.find('#blankDetail').remove();
                    blankHtml.find(".controls")[0].append(createDivProblem(data[0].blankDetail));
                    blankHtml.find(".controls")[1].append(createDivProblem(data[0].keyWord));
                    var $backButton = $('<button>返回</button>');//要注意jQuery与原生的区别
                    $backButton.on("click", function () {
                        $('#panel-956299 #blankDiv').remove();
                        $('#table').show();
                    });
                    $backButton.attr("class", "btn btn-inverse");
                    $backButton.find("button").wrap("<div />");
                    blankHtml.find(".controls")[2].append($backButton[0]);//[0]是讲jq对象转换成dom节点
                    $('#table').hide();//隐藏起来，要回退
                    $('#panel-956299').append(blankHtml);
                    return;
                case 3:
                    var programmeHtml = $('#programmeDiv').clone();
                    programmeHtml.find('input').remove();
                    programmeHtml.find('label').removeAttr("for");
                    programmeHtml.find('button').remove();
                    programmeHtml.find('p').remove();
                    programmeHtml.find('textarea').remove();
                    programmeHtml.find(".controls")[0].append(createDivProblem(data[0].detail));
                    programmeHtml.find(".controls")[1].append(createDivProblem(data[0].output));
                    programmeHtml.find(".controls")[2].append(createDivProblem(data[0].timeLimit));
                    var $backButton = $('<button>返回</button>');//要注意jQuery与原生的区别
                    $backButton.on("click", function () {
                        $('#panel-956299 #programmeDiv').remove();
                        $('#table').show();
                    });
                    $backButton.attr("class", "btn btn-inverse");
                    $backButton.find("button").wrap("<div />");//没有生效
                    programmeHtml.find(".controls")[3].append($backButton[0]);//[0]是讲jq对象转换成dom节点
                    $('#table').hide();//隐藏起来，要回退
                    $('#panel-956299').append(programmeHtml);
                    return;
                case 4:
                    var unProgrammeHtml = $('#unProgrammeDiv').clone();
                    unProgrammeHtml.find('input').remove();
                    unProgrammeHtml.find('label').removeAttr("for");
                    unProgrammeHtml.find('button').remove();
                    unProgrammeHtml.find('p').remove();
                    unProgrammeHtml.find('textarea').remove();
                    unProgrammeHtml.find(".controls")[0].append(createDivProblem(data[0].detail));
                    unProgrammeHtml.find(".controls")[1].append(createDivProblem(data[0].answer));
                    var $backButton = $('<button>返回</button>');//要注意jQuery与原生的区别
                    $backButton.on("click", function () {
                        $('#panel-956299 #unProgrammeDiv').remove();
                        $('#table').show();
                    });
                    $backButton.attr("class", "btn btn-inverse");
                    $backButton.find("button").wrap("<div />");//没有生效
                    unProgrammeHtml.find(".controls")[2].append($backButton[0]);//[0]是讲jq对象转换成dom节点
                    $('#table').hide();//隐藏起来，要回退
                    $('#panel-956299').append(unProgrammeHtml);
                    return;
            }
}
/**
 *可获得的信息：题型、
 * 删除功能
 * @param obj
 */
function deleteByid(id) {
    $.ajax({
        type: 'post',
        url: "/delete/" + $('#problemSelect').val() + "/" + id,
        contentType: 'application/json',
        success: function (data) {
            if (data.result == "success") {
                getPage($('#problemSelect').val());
            }
            else {
                alert("error");
                window.location.reload(true);
            }
        }
    });
}

/**
 * 创建结点
 * @param msg
 * @returns {Element}
 */
function createDivProblem(msg) {
    var returnDiv = document.createElement("label");
    if (arguments[1] != "")
        returnDiv.className = arguments[1];
    if (arguments[2] != "")
        returnDiv.id = arguments[2];
    returnDiv.innerHTML = msg;
    return returnDiv;
}
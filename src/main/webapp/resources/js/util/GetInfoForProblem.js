/**
 * 查询公用函数
 * Created by OvO on 2017/5/2.
 */

/**
 * 获取指定类型指定id的题目
 * @param problemId
 * @param id
 */
function getById(problemId, id) {
    var jsonData;
    $.ajax({
        type: 'post',
        url: "/select/getId/" + problemId + "/" + id,
        async: false,
        contentType: 'application/json',
        success: function (data) {
            jsonData = data;
        },
        error: function () {
            jsonData = "false";
        }
    });
    return jsonData;
}
/**
 * 获取指定类型题目的题数和页数
 * @param problemId
 */
function getCountPage(problemId) {
    var jsonData;
    $.ajax({
        type: 'get',
        url: '/select/pageCount/' + problemId,
        async: false,
        contentType: 'application/json',
        success: function (data) {
            jsonData = data;
        },
        error: function () {
            jsonData = "false";
        }
    });
    return jsonData;
}

window.problemPage = new Array();
problemPage[0] = getSelectPage;
problemPage[1] = getBlankPage;
problemPage[2] = getProgrammePage;
problemPage[3] = getUnProgrammePage;
/**
 * 获取填空题指定页数的数据
 * @param page
 */
function getBlankPage(page) {
    $.ajax({
        type: 'post',
        url: 'select/blank/' + page,
        contentType: 'application/json',
        success: function (data) {
            var num = 0;
            $('.problemTable').empty();
            $('#pageNum').html(page);
            for (var i in data) {//这里的i不是整数而是json对象
                $('.problemTable').append("<tr class=\"" + tableLine[num % 4] + "\"><td class='" + data[i].id + "'>" + data[i].id + "</td>" + "<td><a href='javascript:createFromProblem(" + data[i].id + ")'>" + data[i].detail + "</a></td><td><a href='javascript:update(" + data[i].id + ")'>修改</a></td><td><a href='javascript:deleteByid(" + data[i].id + ")'>删除</a></td></tr>");
                num++;
            }
        }
    });
}
/**
 * 获取选择题指定页数的数据
 * @param page
 */
function getSelectPage(page) {
    $.ajax({
        type: 'post',
        url: 'select/select/' + page,
        contentType: 'application/json',
        success: function (data) {
            var num = 0;
            $('.problemTable').empty();
            $('#pageNum').html(page);
            console.log(data[0].id);
            for (var i in data) {//这里的i不是整数而是json对象
                $('.problemTable').append("<tr class=\"" + tableLine[num % 4] + "\"><td class='" + data[i].id + "'>" + data[i].id + "</td>" + "<td><a href='javascript:createFromProblem(" + data[i].id + ")'>" + data[i].detail + "</a></td><td><a href='javascript:update(" + data[i].id + ")'>修改</a></td><td><a href='javascript:deleteByid(" + data[i].id + ")'>删除</a></td></tr>");
                num++;
            }
        }
    });
}
/**
 * 获取编程题指定页数的数据
 * @param page
 */
function getProgrammePage(page) {
    $.ajax({
        type: 'post',
        url: 'select/programme/' + page,
        contentType: 'application/json',
        success: function (data) {
            var num = 0;
            $('.problemTable').empty();
            $('#pageNum').html(page);
            for (var i in data) {//这里的i不是整数而是json对象
                console.log(tableLine[num % 4]);
                $('.problemTable').append("<tr class=\"" + tableLine[num % 4] + "\"><td class='" + data[i].id + "'>" + data[i].id + "</td>" + "<td><a href='javascript:createFromProblem(" + data[i].id + ")'>" + data[i].detail + "</a></td><td><a href='javascript:update(" + data[i].id + ")'>修改</a></td><td><a href='javascript:deleteByid(" + data[i].id + ")'>删除</a></td></tr>");
                num++;
            }
        }
    });
}
/**
 * 获取非编程题指定页数的数据
 * @param page
 */
function getUnProgrammePage(page) {
    $.ajax({
        type: 'post',
        url: 'select/unprogramme/' + page,
        contentType: 'application/json',
        success: function (data) {
            var num = 0;
            $('.problemTable').empty();
            $('#pageNum').html(page);
            for (var i in data) {//这里的i不是整数而是json对象
                console.log(tableLine[num % 4]);
                $('.problemTable').append("<tr class=\"" + tableLine[num % 4] + "\"><td class='" + data[i].id + "'>" + data[i].id + "</td>" + "<td><a href='javascript:createFromProblem(" + data[i].id + ")'>" + data[i].detail + "</a></td><td><a href='javascript:update(" + data[i].id + ")'>修改</a></td><td><a href='javascript:deleteByid(" + data[i].id + ")'>删除</a></td></tr>");
                num++;
            }
        }
    });
}
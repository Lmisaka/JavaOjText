/**
 * Created by OvO on 2017/4/17.
 */
function selectSubmit() {
    if (!$('#A').is(':checked') && !$('#B').is(':checked') && !$('#C').is(':checked') && !$('#D').is(':checked')) {
        alert("请勾选答案");
        return false;
    }
    if ("" == $('#selectDetail').val()) {
        alert("请输入问题描述");
        return false;
    }
    if ("" == $('#selectA').val() || "" == $('#selectB').val() || "" == $('#selectC').val() || "" == $('#selectD').val()) {
        alert("请输入选项");
        return false;
    }
    var correct = 0;
    if ($('#A').is(':checked'))
        correct += 8;
    if ($('#B').is(':checked'))
        correct += 4;
    if ($('#C').is(':checked'))
        correct += 2;
    if ($('#D').is(':checked'))
        correct += 1;
    var data = {
        "selectDetail": $('#selectDetail').val(),
        "selectA": $('#selectA').val(),
        "selectB": $('#selectB').val(),
        "selectC": $('#selectC').val(),
        "selectD": $('#selectD').val(),
        correct: correct
    };
    if ($('#problemId').html() != "")
        data.id = $('#problemId').html();
    $.ajax({
        type: 'post',
        url: '/add/select',
        contentType: 'application/json;charset=UTF-8',
        dataType: 'json',
        async: false,
        data: JSON.stringify(data),
        success: function (data) {
            if (data.result == "success") {
                alert("success");
                window.location.reload(true);
            } else if (data.update == "success") {
                $('#panel-956299 #selectForm').remove();
                $('#table').show();
            }
            else {
                alert("error");
            }
        },
        error: function () {
            alert("提交失败");
        }
    });
}
function blankSubmit() {
    if ("" == $('#blankDetail').val()) {
        alert("请输入问题描述");
        return false;
    }
    if ("" == $('#keyWord').val()) {
        alert("请输入关键字");
        return false;
    }
    var data = {
        "blankDetail": $('#blankDetail').val(),
        "keyWord": $('#keyWord').val()
    };
    if ($('#problemId').html() != "")
        data.id = $('#problemId').html();
    $.ajax({
        type: 'post',
        url: '/add/blank',
        contentType: 'application/json;charset=UTF-8',
        dataType: 'json',
        async: false,
        data: JSON.stringify(data),
        success: function (data) {
            if (data.result == "success") {
                alert("success");
                window.location.reload(true);
            } else if (data.update == "success") {
                $('#panel-956299 #blankForm').remove();
                $('#table').show();
            } else {
                alert("error");
            }
        },
        error: function () {
            alert("提交失败");
        }
    });
}
function programmeSubmit() {
    if ("" == $('#programmeDetail').val()) {
        alert("请输入问题描述");
        return false;
    }
    if ("" == $('#output').val()) {
        alert("请输入预期输出");
        return false;
    }
    if ("" == $('#textCase').val()) {
        alert("请输入预期输出");
        return false;
    }
    if ("" == $('#inputLimitTime').val()) {
        alert("请输入时间限制");
        return false;
    }

    var data = {
        "detail": $('#programmeDetail').val(),
        "output": $('#output').val(),
        "textCase":$('#textCase').val(),
        timeLimit: $('#inputLimitTime').val()
    };
    alert(JSON.stringify(data));
    if ($('#problemId').html() != "")
        data.id = $('#problemId').html();
    $.ajax({
        type: 'post',
        url: '/add/programme',
        contentType: 'application/json;charset=UTF-8',
        dataType: 'json',
        async: false,
        data: JSON.stringify(data),
        success: function (data) {
            if (data.result == "success") {
                alert("success");
                window.location.reload(true);
            } else if (data.update == "success") {
                $('#panel-956299 #programmeForm').remove();
                $('#table').show();
            } else {
                alert("error");
            }
        },
        error: function () {
            alert("提交失败");
        }
    });
}
function unprogrammeSubmit() {
    if ("" == $('#unProgrammeDetail').val()) {
        alert("请输入问题描述");
        return false;
    }
    if ("" == $('#unProgrammeAnswer').val()) {
        alert("请输入关键字");
        return false;
    }
    var data = {
        "detail": $('#unProgrammeDetail').val(),
        "answer": $('#unProgrammeAnswer').val()
    };
    if ($('#problemId').html() != "")
        data.id = $('#problemId').html();
    $.ajax({
        type: 'post',
        url: '/add/unprogramme',
        contentType: 'application/json;charset=UTF-8',
        dataType: 'json',
        async: false,
        data: JSON.stringify(data),
        success: function (data) {
            if (data.result == "success") {
                alert("success");
                window.location.reload(true);
            } else if (data.update == "success") {
                $('#panel-956299 #unProgrammeForm').remove();
                $('#table').show();
            } else {
                alert("error");
            }
        },
        error: function () {
            alert("提交失败");
        }
    });
}
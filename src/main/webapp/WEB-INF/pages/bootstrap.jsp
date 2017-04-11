<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="../../resources/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <script src="../../resources/js/jquery-1.9.0.min.js" type="text/javascript"></script>
    <script src="../../resources/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
<script language="JavaScript">
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
                } else {
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
        if ("" == $('#inputLimitTime').val()) {
            alert("请输入时间限制");
            return false;
        }
        var data = {
            "detail": $('#programmeDetail').val(),
            "output": $('#output').val(),
            timeLimit:$('#inputLimitTime').val()
        };
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
                } else {
                    alert("error");
                }
            },
            error: function () {
                alert("提交失败");
            }
        });
    }
</script>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <div class="navbar navbar-inverse">
                <div class="navbar-inner">
                    <div class="container-fluid">
                        <a class="btn btn-navbar" data-target=".navbar-responsive-collapse" data-toggle="collapse"></a>
                        <a class="brand" href="#">网站名</a>
                        <div class="nav-collapse collapse navbar-responsive-collapse">
                            <ul class="nav">
                                <li class="active">
                                    <a href="#">主页</a>
                                </li>
                                <li>
                                    <a href="#">链接</a>
                                </li>
                                <li>
                                    <a href="#">链接</a>
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">下拉菜单</a>
                                    <ul class="dropdown-menu">
                                        <li>
                                            <a href="#">下拉导航1</a>
                                        </li>
                                        <li>
                                            <a href="#">下拉导航2</a>
                                        </li>
                                        <li>
                                            <a href="#">其他</a>
                                        </li>
                                        <li class="divider">
                                        </li>
                                        <li class="nav-header">
                                            标签
                                        </li>
                                        <li>
                                            <a href="#">链接1</a>
                                        </li>
                                        <li>
                                            <a href="#">链接2</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                            <ul class="nav pull-right">
                                <li>
                                    <a href="#">右边链接</a>
                                </li>
                                <li class="divider-vertical">
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">下拉菜单</a>
                                    <ul class="dropdown-menu">
                                        <li>
                                            <a href="#">下拉导航1</a>
                                        </li>
                                        <li>
                                            <a href="#">下拉导航2</a>
                                        </li>
                                        <li>
                                            <a href="#">其他</a>
                                        </li>
                                        <li class="divider">
                                        </li>
                                        <li>
                                            <a href="#">链接3</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="tabbable tabs-left" id="tabs-483381">
                <ul class="nav nav-tabs">
                    <li>
                        <a data-toggle="tab" href="#panel-956299">查看</a>
                    </li>
                    <li class="active">
                        <a data-toggle="tab" href="#panel-802227">选择题</a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#panel-123456">编程题</a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#panel-654321">非编程题</a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#panel-985314">填空题</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <%--选择题--%>
                    <div class="tab-pane active" id="panel-802227">
                        <form class="form-horizontal" onsubmit="return selectSubmit()" action="" method="post">
                            <div class="control-group">
                                <label class="control-label" for="selectDetail">题目描述：</label>
                                <div class="controls">
                                    <textarea cols="50" id="selectDetail" name="selectDetail" rows="5"></textarea>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="selectA">A</label>
                                <div class="controls">
                                    <input id="A" name="answer" type="checkbox" value="8"/>
                                    <input id="selectA" name="selectA" type="text"/>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="selectB">B</label>
                                <div class="controls">
                                    <input id="B" name="answer" type="checkbox" value="4"/>
                                    <input id="selectB" name="selectB" type="text"/>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="selectC">C</label>
                                <div class="controls">
                                    <input id="C" name="answer" type="checkbox" value="2"/>
                                    <input id="selectC" name="selectC" type="text"/>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="selectD">D</label>
                                <div class="controls">
                                    <input id="D" name="answer" type="checkbox" value="1"/>
                                    <input id="selectD" name="selectD" type="text"/>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="controls">
                                    <label class="checkbox">
                                        <input class="btn" type="submit"/>
                                    </label>
                                </div>
                            </div>
                        </form>
                    </div>
                    <%--查看--%>
                    <div class="tab-pane" id="panel-956299">
                        <p>
                            查看
                        </p>
                    </div>
                    <%--编程题--%>
                    <div class="tab-pane" id="panel-123456">
                        <form class="form-horizontal" method="post" action="" onsubmit="return programmeSubmit()">
                            <div class="control-group">
                                <label class="control-label" for="programmeDetail">题目描述：</label>
                                <div class="controls">
                                    <textarea cols="50" id="programmeDetail" rows="5"></textarea>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="output">预期输出：</label>
                                <div class="controls">
                                    <textarea cols="50" id="output" rows="5"></textarea>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="inputLimitTime">时间限制</label>
                                <div class="controls">
                                    <input id="inputLimitTime" type="text"
                                           ōnkeyup="this.value=this.value.replace(/\D/g,'''')"
                                           ōnafterpaste="this.value=this.value.replace(/\D/g,'''')"/>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="controls">
                                    <label class="checkbox">
                                        <button class="btn" type="submit">提交</button>
                                    </label>
                                </div>
                            </div>
                        </form>
                    </div>
                    <%--填空题--%>
                    <div class="tab-pane" id="panel-985314">
                        <form class="form-horizontal" method="post" action="" onsubmit="return blankSubmit()">
                            <div class="control-group">
                                <label class="control-label" for="blankDetail">题目描述：</label>
                                <div class="controls">
                                    <textarea cols="50" id="blankDetail" rows="5"></textarea>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="keyWord">关键词</label>
                                <div class="controls">
                                    <p>关键字请用,(英文字符)隔开</p>
                                    <input id="keyWord" type="text"/>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="controls">
                                    <label class="checkbox">
                                        <button class="btn" type="submit">提交</button>
                                    </label>
                                </div>
                            </div>
                        </form>
                    </div>
                    <%--非编程题--%>
                    <div class="tab-pane" id="panel-654321">
                        <form class="form-horizontal" method="post" action="" onsubmit="return unprogrammeSubmit()">
                            <div class="control-group">
                                <label class="control-label" for="unProgrammeDetail">题目描述：</label>
                                <div class="controls">
                                    <textarea cols="50" id="unProgrammeDetail" rows="5"></textarea>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="unProgrammeAnswer">答案：</label>
                                <div class="controls">
                                    <textarea cols="50" id="unProgrammeAnswer" rows="5"></textarea>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="controls">
                                    <label class="checkbox">
                                        <button class="btn" type="submit">提交</button>
                                    </label>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
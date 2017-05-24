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
    <script src="../../resources/js/exam/add.js" type="text/javascript"></script>
    <script src="../../resources/js/exam/select.js" type="text/javascript"></script>
    <script src="../../resources/js/util/GetInfoForProblem.js" type="text/javascript"></script>

</head>
<body>
<script language="JavaScript">
    $(document).ready(function () {
        getPage(1);
        getSelectPage(1);
        $('#problemSelect').on("change", function () {
            getPage($('#problemSelect').val());
        });
    });
</script>
<script type="pageNum" id="pageNum"></script>
<script type="getId" id="problemId"></script>
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
                    <li class="active">
                        <a data-toggle="tab" href="#panel-956299">查看</a>
                    </li>
                    <li>
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
                    <%--查看--%>
                    <div class="tab-pane active" id="panel-956299">
                        <div id="table">
                            <table class="table table-hover">
                                <thead>
                                <tr>
                                    <th>题号</th>
                                    <th>
                                        <div class="form-group">
                                            <select id="problemSelect">
                                                <option selected="selected" value="1" id="1">选择题</option>
                                                <option value="2" id="2">填空题</option>
                                                <option value="3" id="3">编程题</option>
                                                <option value="4" id="4">非编程题</option>
                                            </select>
                                        </div>
                                    </th>
                                    <th>修改</th>
                                    <th>删除</th>
                                </tr>
                                </thead>
                                <tbody class="problemTable">
                                </tbody>
                            </table>
                            <div class="pagination pagination-centered">
                                <%--分页按钮--%>
                                <ul class="pageButton">
                                </ul>
                            </div>
                        </div>
                    </div>
                    <%--选择题--%>
                    <div class="tab-pane" id="panel-802227">
                        <form class="form-horizontal" id="selectForm" onsubmit="return selectSubmit()" action=""
                              method="post">
                            <div id="selectDiv">
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
                            </div>
                        </form>
                    </div>
                    <%--编程题--%>
                        <%--TODO 测试用例未完成--%>
                    <div class="tab-pane" id="panel-123456">
                        <form class="form-horizontal" id="programmeForm" method="post" action=""
                              onsubmit="return programmeSubmit()">
                            <div id="programmeDiv">
                                <div class="control-group">
                                    <label class="control-label" for="programmeDetail">题目描述：</label>
                                    <div class="controls">
                                        <textarea cols="50" id="programmeDetail" rows="5"></textarea>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="textCase">输入</label>
                                    <div class="controls">
                                        <textarea cols="50" id="textCase" rows="5"></textarea>
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
                                        <input id="inputLimitTime" type="text"/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <div class="controls">
                                        <label class="checkbox">
                                            <button class="btn" type="submit">提交</button>
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    <%--填空题--%>
                    <div class="tab-pane" id="panel-985314">
                        <form class="form-horizontal" id="blankForm" method="post" action=""
                              onsubmit="return blankSubmit()">
                            <div id="blankDiv">
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
                            </div>
                        </form>
                    </div>
                    <%--非编程题--%>
                    <div class="tab-pane" id="panel-654321">
                        <form class="form-horizontal" id="unProgrammeForm" method="post" action=""
                              onsubmit="return unprogrammeSubmit()">
                            <div id="unProgrammeDiv">
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
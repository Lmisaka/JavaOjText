<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="span12">
            <div class="navbar navbar-inverse">
                <div class="navbar-inner">
                    <div class="container-fluid">
                        <a class="btn btn-navbar" data-target=".navbar-responsive-collapse" data-toggle="collapse"></a> <a class="brand" href="#">网站名</a>
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
                        <a data-toggle="tab" href="#panel-802227">选择题</a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#panel-956299">编程题</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="panel-802227">
                        <form class="form-horizontal">
                            <div class="control-group">
                                <label class="control-label" for="inputEmail">题目描述：</label>
                                <div class="controls">
									<textarea cols="25" id="inputEmail" rows="5">
									</textarea>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="inputA">A</label>
                                <div class="controls">
                                    <input id="inputA" type="text" />
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="inputB">B</label>
                                <div class="controls">
                                    <input id="inputB" type="text" />
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="inputC">C</label>
                                <div class="controls">
                                    <input id="inputC" type="text" />
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="inputD">D</label>
                                <div class="controls">
                                    <input id="inputD" type="text" />
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="controls">
                                    <label class="checkbox"><input type="checkbox" /> Remember me</label> <button class="btn" type="submit">提交</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="tab-pane" id="panel-956299">
                        <p>
                            第二部分内容.
                        </p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="span8">
                </div>
                <div class="span4">
                </div>
            </div>
        </div>
    </div>
</div>
<script src="resources/js/jquery-3.2.0.js" type="text/javascript"></script>
<script src="resources/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>
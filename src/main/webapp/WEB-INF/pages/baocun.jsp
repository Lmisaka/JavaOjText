<%--
  Created by IntelliJ IDEA.
  User: OvO
  Date: 2017/4/26
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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
            <div class="hero-unit well">
                <h1>
                    Hello, world!
                </h1>
                <p>
                    这是一个可视化布局模板, 你可以点击模板里的文字进行修改, 也可以通过点击弹出的编辑框进行富文本修改. 拖动区块能实现排序.
                </p> <select id="mySelect">
                <option value="1">成功1</option>
                <option value="2">成功2</option>
                <option selected="selected" value="3">成功3</option>
                <option value="4">成功4</option>
                <option value="5">失败5</option>
                <option value="6">失败6</option>
                <option value="7">失败7</option>
                <option value="8">失败8</option>
                <option value="9">失败9</option>
                <option value="10">失败10</option>
                <option value="11">失败11</option>
                <option value="12">失败12</option>
            </select>
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
                        <a data-toggle="tab" href="#panel-123456">填空题</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane" id="panel-802227">
                        <form class="form-horizontal">
                            <div class="control-group">
                                <label class="control-label" for="inputEmail">题目描述：</label>
                                <div class="controls">
									<textarea cols="50" id="inputEmail" rows="5">
									</textarea>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="inputA">A</label>
                                <div class="controls">
                                    <input id="inputA" type="text"/>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="inputB">B</label>
                                <div class="controls">
                                    <input id="inputB" type="text"/>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="inputC">C</label>
                                <div class="controls">
                                    <input id="inputC" type="text"/>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="inputD">D</label>
                                <div class="controls">
                                    <input id="inputD" type="text"/>
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
                    <div class="tab-pane active" id="panel-956299">
                        <table class="table table-hover">
                            <thead>
                            <tr>
                                <th>
                                    题号
                                </th>
                                <th>
                                    <select id="problemSelect">
                                        <option value="1">选择题</option>
                                        <option value="2">填空题</option>
                                        <option selected="selected" value="3">编程题</option>
                                        <option value="4">非编程题</option>
                                    </select>
                                </th>
                                <th>
                                    查看
                                </th>
                                <th>
                                    删除
                                </th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>
                                    1
                                </td>
                                <td>
                                    TB - Monthly
                                </td>
                                <td>
                                    01/04/2012
                                </td>
                                <td>
                                    Default
                                </td>
                            </tr>
                            <tr class="success">
                                <td>
                                    1
                                </td>
                                <td>
                                    TB - Monthly
                                </td>
                                <td>
                                    01/04/2012
                                </td>
                                <td>
                                    Approved
                                </td>
                            </tr>
                            <tr class="error">
                                <td>
                                    2
                                </td>
                                <td>
                                    TB - Monthly
                                </td>
                                <td>
                                    02/04/2012
                                </td>
                                <td>
                                    Declined
                                </td>
                            </tr>
                            <tr class="warning">
                                <td>
                                    3
                                </td>
                                <td>
                                    TB - Monthly
                                </td>
                                <td>
                                    03/04/2012
                                </td>
                                <td>
                                    Pending
                                </td>
                            </tr>
                            <tr class="info">
                                <td>
                                    4
                                </td>
                                <td>
                                    TB - Monthly
                                </td>
                                <td>
                                    04/04/2012
                                </td>
                                <td>
                                    Call in to confirm
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        <div class="pagination pagination-centered">
                            <ul>
                                <li>
                                    <a href="#">上一页</a>
                                </li>
                                <li>
                                    <a href="#">1</a>
                                </li>
                                <li>
                                    <a href="#">2</a>
                                </li>
                                <li>
                                    <a href="#">3</a>
                                </li>
                                <li>
                                    <a href="#">4</a>
                                </li>
                                <li>
                                    <a href="#">5</a>
                                </li>
                                <li>
                                    <a href="#">下一页</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="tab-pane" id="panel-123456">
                        <form class="form-horizontal">
                            <div class="control-group">
                                <label class="control-label" for="inputEmail">题目描述：</label>
                                <div class="controls">
									<textarea cols="50" id="inputEmail" rows="5">
									</textarea>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="inputLimitTime">关键词</label>
                                <div class="controls">
                                    <input id="inputLimitTime" type="textarea"/>
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
                    <div class="tab-pane" id="panel-654321">
                        <form class="form-horizontal">
                            <div class="control-group">
                                <label class="control-label" for="inputEmail">题目描述：</label>
                                <div class="controls">
									<textarea cols="50" id="inputEmail" rows="5">
									</textarea>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="inputEmail">答案：</label>
                                <div class="controls">
									<textarea cols="50" id="inputEmail" rows="5">
									</textarea>
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

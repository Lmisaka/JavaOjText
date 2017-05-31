<%--
  Created by IntelliJ IDEA.
  User: OvO
  Date: 2017/5/2
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title>在线笔试答题</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="../../resources/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="../../resources/css/AnswerPage.css" rel="stylesheet" type="text/css"/>

    <script src="../../resources/js/jquery-1.9.0.min.js" type="text/javascript"></script>
    <script src="../../resources/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="../../resources/js/exam/ProblemForm.js" type="text/javascript"></script>
    <script src="../../resources/js/util/GetInfoForProblem.js" type="text/javascript"></script>
    <script src="../../resources/js/exam/match.js" type="text/javascript"></script>
    <script src="../../resources/js/exam/examPage.js" type="text/javascript"></script>
</head>
<body>
<script language="JavaScript">
    $(document).ready(function () {
        $('#selectPage').hide();
        $('#blankPage').hide();
        $('#unProgrammePage').hide();
        $('#programmePage').hide();
        setInterval("countDown()", 1000);
    })
</script>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <ul class="breadcrumb">
                <li>
                    <a rel="nofollow" href="#">主页</a> <span class="divider">/</span>
                </li>
                <li>
                    <a rel="nofollow" href="#">类目</a> <span class="divider">/</span>
                </li>
                <li class="active">
                    主题
                </li>
            </ul>
        </div>
    </div>
    <div class="row-fluid">
        <div class="col-xs-6 span4 menu">
            <ul class="nav nav-list">
                <li class="nav-header">
                    列表标题
                </li>
                <li class="active">
                    <a rel="nofollow" href="#">首页</a>
                </li>
                <li>
                    <a rel="nofollow" href="#">库</a>
                </li>
                <li>
                    <a rel="nofollow" href="#">应用</a>
                </li>
                <li class="nav-header">
                    功能列表
                </li>
                <li>
                    <a rel="nofollow" href="#">资料</a>
                </li>
                <li>
                    <a rel="nofollow" href="#">设置</a>
                </li>
                <li class="divider">
                </li>
                <li>
                    <a rel="nofollow" href="#">帮助</a>
                </li>
            </ul>
        </div>
        <%--开始答题--%>
        <div class="col-xs-6 span4" id="page">
            <div id="beginButton">
                <button class="btn btn-primary" id="begin" onclick="beginButton()">开始答题</button>
            </div>
            <div class="control-group" id="formPage">
                <form id="examForm" action="" onsubmit="examSubmit()" method="post">
                    <div class="control-group" id="selectPage">
                        <strong>一、选择题</strong><br>
                    </div>
                    <div class="control-group" id="blankPage">
                        <strong>二、填空题</strong><br>
                    </div>
                    <div class="control-group" id="unProgrammePage">
                        <strong>三、非编程题</strong><br>
                    </div>
                    <div class="control-group" id="programmePage">
                        <strong>四、编程题</strong><br>
                    </div>
                </form>
            </div>
        </div>
        <div class="col-xs-6 span4">
            <div id="countDown">
                <p style="float: left;">剩余时间 </p>
                <p style="float: left;" id="min">120<span id="">:</span><span>
                <p style="float: left;">:</p>
                <p id="sec">0</p></span></p>
            </div>
            <div style="float: none;">
            <object type="application/x-shockwave-flash" style="outline:none;"
                    data="http://cdn.abowman.com/widgets/hamster/hamster.swf?" width="300" height="225">
                <param name="movie" value="http://cdn.abowman.com/widgets/hamster/hamster.swf?"></param>
                <param name="AllowScriptAccess" value="always"></param>
                <param name="wmode" value="opaque"></param>
            </object>
            </div>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span12">
            <%--<address><strong></strong><br/> 795 Folsom Ave, Suite 600<br/> San Francisco, CA 94107<br/>--%>
                <%--<abbr title="Phone">P:</abbr> (123) 456-7890--%>
            <%--</address>--%>
        </div>
    </div>
</div>
</body>
</html>

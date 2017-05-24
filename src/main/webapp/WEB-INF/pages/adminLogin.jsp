<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>在线笔试答题网站后台管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="../../resources/js/jquery-1.9.0.min.js"></script>
    <link href="../../resources/css/login2.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<h1>管理员登陆</h1>
<div class="login" style="margin-top:50px;">
    <div class="header">
        <div class="switch" id="switch"><a class="switch_btn_focus" id="switch_qlogin"
                                           tabindex="7">管理员登陆</a>
            <div class="switch_bottom" id="switch_bottom" style="position: absolute; width: 64px; left: 0px;"></div>
        </div>
    </div>

    <div class="web_qr_login" id="web_qr_login" style="display: block; height: 235px;">

        <!--登录-->
        <div class="web_login" id="web_login">
            <div class="login-box">
                <div class="login_form">
                    <form action="" name="loginform" accept-charset="utf-8" id="login_form"
                          class="loginForm" onsubmit="admin_login();return false"
                          method="post"><input type="hidden" name="did" value="0"/>
                        <input type="hidden" name="to" value="log"/>
                        <div class="uinArea" id="uinArea">
                            <label class="input-tips" for="adUsername">帐号：</label>
                            <div class="inputOuter" id="uArea">
                                <input type="text" id="adUsername" name="adUsername" class="inputstyle"/>
                            </div>
                        </div>
                        <div class="pwdArea" id="pwdArea">
                            <label class="input-tips" for="adPassword">密码：</label>
                            <div class="inputOuter" id="pArea">

                                <input type="password" id="adPassword" name="adPassword" class="inputstyle"/>
                            </div>
                        </div>

                        <div style="padding-left:50px;margin-top:20px;"><input type="submit" id="submit" value="登 录"
                                                                               style="width:150px;"
                                                                               class="button_blue"/></div>
                    </form>
                </div>

            </div>

        </div>
        <!--登录end-->
    </div>
</div>
<script language="JavaScript">
    function admin_login() {
        //登陆ajax
        if ("" == $("#adUsername").val()) {
            alert("用户名不能为空");
            window.location.reload(true);
            return false;
        }
        if ("" == $("#adPassword").val()) {
            alert("密码不能为空");
            window.location.reload(true);
            return false;
        }
        var data = {
            "adUsername": $("#adUsername").val(),
            "adPassword": md5($("#adPassword").val())
        };
        alert(JSON.stringify(data));
        $("#adPassword").val(md5($("#adPassword").val()));
        $.ajax({
            type: 'POST',
            url: '/admin/login.do',
            contentType: 'application/json;charset=UTF-8',
            dataType: 'json',
            data: JSON.stringify(data),
            success: function (data) {
                login_result(data);
            },
            error: function () {
                alert("登陆失败");
                window.location.reload(true);
            }
        });
    };
    function login_result(data) {
        if (data["isSuccess"]) {
            alert("success");
            window.location.href = "/admin/index";
        } else {
            alert("密码错误或该用户不存在");
        }
    }
</script>
<script type="text/javascript" src="../../resources/js/md5.min.js"></script>
</div>
<div class="jianyi">*推荐使用ie8或以上版本ie浏览器或Chrome内核浏览器访问本站</div>
</body>
</html>
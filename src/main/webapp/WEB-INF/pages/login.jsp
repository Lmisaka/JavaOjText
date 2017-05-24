﻿<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>在线笔试答题</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <link href="../../resources/css/login2.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<h1>在线笔试答题</h1>
<div class="login" style="margin-top:50px;">

    <div class="header">
        <div class="switch" id="switch"><a class="switch_btn_focus" id="switch_qlogin" href="javascript:void(0);"
                                           tabindex="7">快速登录</a>
            <a class="switch_btn" id="switch_login" href="javascript:void(0);" tabindex="8">快速注册</a>
            <div class="switch_bottom" id="switch_bottom" style="position: absolute; width: 64px; left: 0px;"></div>
        </div>
    </div>


    <div class="web_qr_login" id="web_qr_login" style="display: block; height: 235px;">

        <!--登录-->
        <div class="web_login" id="web_login">


            <div class="login-box">


                <div class="login_form">
                    <form action="" name="loginform" accept-charset="utf-8" id="login_form"
                          onsubmit="login();return false;" class="loginForm"
                          method="post"><input type="hidden" name="did" value="0"/>
                        <input type="hidden" name="to" value="log"/>
                        <div class="uinArea" id="uinArea">
                            <label class="input-tips" for="username">帐号：</label>
                            <div class="inputOuter" id="uArea">
                                <input type="text" id="username" name="username" class="inputstyle"/>
                            </div>
                        </div>
                        <div class="pwdArea" id="pwdArea">
                            <label class="input-tips" for="password">密码：</label>
                            <div class="inputOuter" id="pArea">

                                <input type="password" id="password" name="password" class="inputstyle"/>
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
    <script type="text/javascript">
        function login() {
            //登陆ajax
            var data = {
                "username": $("#username").val(),
                "password": md5($('#password').val()),
                statis: 1
            };
            $('#password').val(md5($('#password').val()));
            $.ajax({
                type: 'POST',
                url: '/user/login.do',
                contentType: 'application/json;charset=UTF-8',
                dataType: 'json',
                data: JSON.stringify(data),
                success: function (data) {
                    return loginResult(data);
                },
                error: function () {
                    alert("error");
                }
            });
        }
        ;
        function loginResult(result) {
            if (result["isSuccessful"]) {
                window.location.href = '/user/exam';
            }
            else {
                alert("没有该用户");
                window.location.reload(true);
            }
        }
    </script>
    <!--注册-->
    <div class="qlogin" id="qlogin" style="display: none; ">

        <div class="web_login">
            <form name="form2" id="regUser" accept-charset="utf-8" action="" method="post" onsubmit="">
                <input type="hidden" name="to" value="reg"/>
                <input type="hidden" name="did" value="0"/>
                <ul class="reg_form" id="reg-ul">
                    <div id="userCue" class="cue">快速注册请注意格式</div>
                    <li>
                        <label for="user" class="input-tips2">用户名：</label>
                        <div class="inputOuter2">
                            <input type="text" id="user" name="user" maxlength="16" class="inputstyle2"/>
                        </div>

                    </li>

                    <li>
                        <label for="passwd" class="input-tips2">密码：</label>
                        <div class="inputOuter2">
                            <input type="password" id="passwd" name="passwd" maxlength="16" class="inputstyle2"/>
                        </div>

                    </li>
                    <li>
                        <label for="passwd2" class="input-tips2">确认密码：</label>
                        <div class="inputOuter2">
                            <input type="password" id="passwd2" name="" maxlength="16" class="inputstyle2"/>
                        </div>

                    </li>

                    <li>
                        <label for="qq" class="input-tips2">QQ：</label>
                        <div class="inputOuter2">

                            <input type="text" id="qq" name="qq" maxlength="10" class="inputstyle2"/>
                        </div>

                    </li>
                    <li>
                        <label for="tel" class="input-tips2">tel：</label>
                        <div class="inputOuter2">

                            <input type="text" id="tel" name="tel" maxlength="10" class="inputstyle2"/>
                        </div>

                    </li>
                    <li>
                        <label for="email" class="input-tips2">email：</label>
                        <div class="inputOuter2">
                            <input type="text" id="email" name="email" maxlength="10" class="inputstyle2"/>
                        </div>

                    </li>
                    <li>
                        <div class="inputArea">
                            <input type="submit" id="reg" style="margin-top:10px;margin-left:85px;" class="button_blue"
                                   value="同意协议并注册"/> <a href="#" class="zcxy" target="_blank">注册协议</a>
                        </div>

                    </li>
                    <div class="cl"></div>
                </ul>
            </form>


        </div>


    </div>
    <!--注册end-->
</div>
<script type="text/javascript" src="../../resources/js/md5.min.js"></script>
<script type="text/javascript" src="../../resources/js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="../../resources/js/login.js"></script>
</body>
</html>
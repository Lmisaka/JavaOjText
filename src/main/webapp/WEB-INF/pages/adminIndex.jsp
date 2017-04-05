<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>管理界面</title>
    <link href="../../resources/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="../../resources/js/js.js"></script>
</head>

<body id="index">
<h1>XXXXXXXXXXXXXXXX系统管理界面</h1>
<div id="userInfo">你好，管理员<%=session.getAttribute("username")%>，今天是2007年8月11日，农历九月初三</div>
<ul id="globalNav">
    <h2>管理菜单</h2>
    <li><a href="#" target="frameBord">单选题</a></li>
    <li><a href="#" target="frameBord">多选题</a></li>
    <li><a href="#" target="frameBord">编程题</a></li>
    <li><a href="#" target="frameBord">非编程题</a></li>
    <li><a href="login.jsp">安全退出</a></li>
</ul>
<iframe id="frameBord" name="frameBord" frameborder="0" width="100%" height="100%" src="siteInfo.jsp"></iframe>
</body>
</html>

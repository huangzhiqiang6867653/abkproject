<%--
  Created by IntelliJ IDEA.
  User: huangzhiqiang
  Date: 2018/8/10
  Time: 下午9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>${message}</h2>
<form method="post" action="/testPermissions.html"><input type="submit" value="测试Permissions"></form>
<form method="post" action="/testRoles.html"><input type="submit" value="测试注解配置Roles"></form>
<form method="post" action="/adminRoles.html"><input type="submit" value="测试XML配置Roles"></form>
</body>
</html>

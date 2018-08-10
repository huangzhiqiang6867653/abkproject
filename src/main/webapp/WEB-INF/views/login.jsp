<%--
  Created by IntelliJ IDEA.
  User: huangzhiqiang
  Date: 2018/8/10
  Time: 下午8:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="loginUser">
    <p align="center">用户登录</p>
    <table width="296" border="1" align="center">
        <tr>
            <td width="98" height="34">用户名：</td>
            <td width="182"><label><input name="userName" type="text" id="userName"/></label></td>
        </tr>

        <tr>
            <td height="36">密码：</td>
            <td><label> <input name="passwd" type="password" id="passwd"/></label></td>
        </tr>
        <tr>
            <td height="35" colspan="2"><label>
                <input type="submit" name="Submit" value="提交"/>
            </label> <label> <input type="reset" name="Submit2" value="重置"/>
            </label>${message}</td>
        </tr>
    </table>
</form>
</body>
</html>

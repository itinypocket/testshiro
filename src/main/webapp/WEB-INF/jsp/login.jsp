<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <title>登录</title>
</head>
<body>
<div>${message}</div>
<form action="/login" method="post">
    <input name="loginName"><br>
    <input name="password"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>

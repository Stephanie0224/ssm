<%@include file="common/head.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑页面</title>
</head>
<body>
<form action="user/${user.id}/update" method="post" >
    <input type="hidden" name="id" value="${user.id}"/>
    电话号码：  <input type="text" name="phoneNum" value="${user.phoneNum}"/>
    密码：    <input type="text" name="password" value="${user.password}"/>
    <input type="submit" name="register" value="更新"/>
    <a href="javascript:history.go(-1)">返回</a>
</form>
</body>
</html>

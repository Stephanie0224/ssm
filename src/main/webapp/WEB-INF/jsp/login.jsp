<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/4 0004
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/head.jsp"%>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="user/login" method="post" >
    手机号码：  <input type="text" name="phoneNum" value=""/><br/>
    密码：    <input type="text" name="password" value=""/><br/>
    <input type="submit" name="login" value="登录"/>
    <a href="${pageContext.request.contextPath}/user/registPage" name="register">注册</a>
 </form>
</body>
</html>

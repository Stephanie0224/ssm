<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/6 0006
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@include file="common/head.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>详情页面</title>
</head>
<body>
                详情页面
                <input type="hidden" name="id" value="${user.id}"/>
    电话号码：  <input type="text" readonly name="phoneNum" value="${user.phoneNum}"/>
    密码：      <input type="text" readonly name="password" value="${user.password}"/>
                <a href="user/list">返回列表</a>

</body>
</html>

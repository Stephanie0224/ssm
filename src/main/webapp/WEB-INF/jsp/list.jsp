<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/4 0004
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/head.jsp"%>
<html>
<head>
    <title>列表</title>
</head>
<body>
  <table border="1px">
    <tr> <td>序号</td> <td>电话号码</td>  <td> 密码</td><td> 操作</td></tr>
    <c:forEach var="user" items="${list}">
        <tr><td>${user.id}</td> <td>${user.phoneNum}</td> <td> ${user.password}</td>
            <td> <a onclick="return confirm('确认删除?')" href="user/${user.id}/delete">删除</a>
                <a href="user/${user.id}/edit">修改</a></td> </tr>
    </c:forEach>
  </table>
<a href="/ssm">退出</a>
</body>
</html>

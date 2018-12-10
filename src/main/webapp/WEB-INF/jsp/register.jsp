<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/6 0006
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/head.jsp"%>
<html>
<script src="static/jquery-1.11.2.min.js"></script>
<head>
    <title>注册页面</title>
    <script type="text/javascript">
        $(function () {
            $(".register").click(function () {
                var phoneNum=$("phoneNum").val();
                var password=$("password").val();
               if(phoneNum==="" || password===""){
                   alert("电话号码或者密码为空");
                   return false;
               }
                $(".registPhone").submit();
            });
        });


     function sendMesage() {
         $(".catpcha").val("发送中...");
         setTimeout(function(){ $(".catpcha").val("345676") }, 3000);
     }
    </script>
</head>
<body>
<form action="user/save" class="registPhone" method="post">
    电话号码：  <input type="text" class="phoneNum" name="phoneNum" value=""/><br/>
    手机短信：  <input type="text" class="catpcha" value=""/> <input type="button" value="发送短信" onclick="sendMesage();"/><br/>
    密码：    <input type="text" class="password" name="password" value=""/><br/>
    <input type="button" class="register" value="注册"/><a href="javascript:history.go(-1)">返回</a>
</form>
</body>
</html>

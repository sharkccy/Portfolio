<%-- 
    Document   : HTML_FormProcess
    Created on : 2018/12/23, 上午 10:14:18
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>處理表單資料</h1>
        <h2>您輸入的資訊如下</h2>
        <hr>
        姓名:  <%= request.getParameter("username")  %> <Br/>
        年齡:  <%= request.getParameter("age") %><Br/>
        性別:  <%= request.getParameter("gender") %><br/>
        電子郵件: <%= request.getParameter("email")  %><Br/>
        行動電話: <%= request.getParameter("mobile") %><Br/>
        密碼設定: <%= request.getParameter("passwd") %><Br/>
    </body>
</html>

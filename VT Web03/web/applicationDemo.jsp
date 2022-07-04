<%-- 
    Document   : applicationDemo
    Created on : 2019/1/6, 下午 01:35:37
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
        <h1>application 共享物件</h1>
        <% 
          application.setAttribute("message", "application share object");
          application.setAttribute("database", "mariadb");          
        %>
        
        <a href="application_display.jsp"> 顯示 application 變數</a>
    </body>
</html>

<%-- 
    Document   : application_display
    Created on : 2019/1/6, 下午 01:37:34
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
        <h1>存放在 application 公用區域的變數</h1>
        
        message:  <%= application.getAttribute("message") %> <br/>
        資料庫:  <%= application.getAttribute("database") %> <br/>
        
                
                
    </body>
</html>

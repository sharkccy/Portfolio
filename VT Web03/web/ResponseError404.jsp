<%-- 
    Document   : ResponseError404
    Created on : 2018/12/16, 下午 04:23:15
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
        <h1>現在可以看到</h1>
        <%
            response.sendError(500);
        %>
    </body>
</html>

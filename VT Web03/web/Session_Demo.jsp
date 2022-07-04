<%-- 
    Document   : Session_Demo
    Created on : 2019/1/6, 上午 09:42:55
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
        <h1>Session 示範</h1>
        當瀏覽器連回 Web Server 的時候 , Web Server會產生一組Session 物件與ID <br/>
        瀏覽器會收到 session id 資訊 , 下一次連回 web server時會將 id 回傳給 server <br/>
        我的 id是: <%= session.getId() %>
        
        
        
        
    </body>
</html>

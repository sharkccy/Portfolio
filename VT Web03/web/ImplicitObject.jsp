<%-- 
    Document   : ImplicitObject
    Created on : 2018/12/16, 下午 02:22:31
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
        <h1>JSP Implicit object 操作</h1>
        
        <% out.println("使用 out物件輸出訊息到瀏覽器畫面"); %>
        <hr>
        這是直接在網頁內提供靜態訊息
        <hr>
        使用 request 取得使用者的連線方式(GET/POST) 其中是: <%= request.getMethod() %>
        <br>
        使用者(瀏覽器) 來自於 <%= request.getRemoteAddr() %>
        <hr>
        <h2>瀏覽器表頭資訊取得 </h2>
        Accept-Language:  <%= request.getHeader("Accept-Language") %>
    </body>
</html>

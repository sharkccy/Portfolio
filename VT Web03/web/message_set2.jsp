<%-- 
    Document   : message_set2
    Created on : 2019/1/6, 下午 01:43:53
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
       <% 
           String msg1 = request.getParameter("msg1");
           application.setAttribute("msg1", msg1);           
       %>
       <h3>公告訊息設定完畢</h3>
       <a href="index.jsp">返回首頁<a/>
           
    </body>
</html>

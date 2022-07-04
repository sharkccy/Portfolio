<%-- 
    Document   : JSP_Include_Subpage
    Created on : 2018/12/23, 下午 03:28:46
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        String message = request.getParameter("mesg");
        String x = request.getParameter("x");
        String y = request.getParameter("y");
    %>
    <body>
        <h4>這是第二頁內容 JSP_Include_Subpage.jsp </h4>
        此處應該顯示由主頁傳送過來的訊息:  <%= message %><br/>
        x= <%= x %><BR>
        y= <%= y %><br>
        
    </body>
</html>

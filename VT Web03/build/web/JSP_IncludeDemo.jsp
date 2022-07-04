<%-- 
    Document   : JSP_IncludeDemo
    Created on : 2018/12/23, 下午 03:27:32
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
        <h1> 使用 jsp:include 將其他頁面內容嵌入本頁面 </h1>
        <hr>
        <h4>這是主頁資料</h4>
        <hr/>        
        <jsp:include page="JSP_Include_Subpage.jsp">
            <jsp:param name="mesg" value="Hello from Main Page"/>
            <jsp:param name="x" value="22"/>
            <jsp:param name="y" value="35"/>
        </jsp:include>
        
        
    </body>
</html>

<%-- 
    Document   : ScriptletDemo
    Created on : 2018/12/16, 下午 12:17:43
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
        <h1>JSP Scriptlet 示範</h1>
        <!-- <h2> 這一行 不應該顯示 </h2> -->
        <hr>
        <%
        int i=10;
        int x=40900;
        String title = "產品售價";
        out.println("i+5=" + (i+5));
        %>
        <hr>
        <%--  --%>
        <%--
            for(int j=1;j<=10;j++) {
                out.println("<h3>Loop j" + j +"<h3>");
            } 

            for(int k=1;k<=10;k++) {
                out.println("<h3>Loop k" + k +"<h3>");
            } 
        --%>
            
        <h1><%= title %></h1>
        <h5> iphone ipx 售價 <% out.print(x); %> </h5>
        <h5> iphone ipx 售價 <%= x %> </h5>
    </body>
</html>

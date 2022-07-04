<%-- 
    Document   : index
    Created on : 2018/12/16, 上午 11:53:25
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
            String msg =(String) application.getAttribute("msg1");
            if( msg != null ) {
                out.println("<h1>系統快訊:  " + msg + " </h1>");
            }
        %>
        <h1> Java Web課程範例</h1>
        
        <a href="ScriptletDemo.jsp">Scriptlet示範</a>
        <a href="ImplicitObject.jsp">ImplicitObject示範</a>
        <a href="message_form.jsp">設定系統公告</a>
        
        <h3> application 初始化參數 </h3>
        資料庫路徑: <%= application.getInitParameter("DBURL") %> <br/>
        連線帳號: <%= application.getInitParameter("DBAccount") %> <br/>
        連線密碼: <%= application.getInitParameter("DBPasswd") %> <br/>
    </body>
</html>

<%-- 
    Document   : messege_form
    Created on : 2019/1/6, 下午 01:51:52
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
        <h1>系統快訊設定</h1>
        <form action="messege_set2.jsp" method="POST">
            快訊內容: <input type="text" name="msg1" value="" />
            <input type="submit" value="公告" />
        </form>
    </body>
</html>

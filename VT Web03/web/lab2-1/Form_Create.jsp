<%-- 
    Document   : Form_Create
    Created on : 2018/12/23, 下午 01:37:24
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
        <h1>動態表格製作表單</h1>
        <form method="GET" action="Form_gen.jsp">
            表格列: <input type="number" name="n"/><br/>
            表格欄: <input type="number" name="m"/><br/> 
            <input type="submit" value="製作"/>            
        </form>
    </body>
</html>

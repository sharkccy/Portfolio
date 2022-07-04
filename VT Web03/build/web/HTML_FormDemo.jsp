<%-- 
    Document   : HTML_FormDemo
    Created on : 2018/12/23, 上午 09:40:55
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
        <h1>表單示範</h1>
        <br>
        <br/>
        <form method="GET" action="HTML_FormProcess.jsp">
            姓名: <input type="text" name="username" /> <br/>
            EMAIL:<input type="text" name="email" /> <br>
            手機: <input type="text" name="mobile" /> <br>
            性別: 男<input type="radio" name="gender" value="1" /> 女<input type="radio"  name="gender" value="2"/> <br/>
            年齡: <input type="number" name="age" /> <br/>
            密碼: <input type="password" name="passwd"> <br>
            <input type="submit" value="送出"><input type="reset" value="清除">
        </form>
        
    </body>
</html>

<%-- 
    Document   : Product_form
    Created on : 2019/1/6, 上午 10:40:17
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
        <h1>程式開發技能調查</h1>
        <h4>請勾選擅長技術</h4>
        <form action="SkillInvest.jsp">
            Java <input type="checkbox"        name="skills" value="java" /><br/>
            C# <input type="checkbox"          name="skills" value="c#" /><br/>
            PHP <input type="checkbox"         name="skills" value="php" /><br/> 
            HTML <input type="checkbox"        name="skills" value="html" /><br/>
            JavaScript <input type="checkbox"  name="skills" value="JavaScript" /><br/>
            Type Script <input type="checkbox" name="skills" value="type script" /><br/>
            MySQL <input type="checkbox"       name="skills" value="mysql" /><br/>
            MSSQL <input type="checkbox"       name="skills" value="mssql" /><br/>
            <input type="submit" value="送出" />
        </form>
    </body>
</html>

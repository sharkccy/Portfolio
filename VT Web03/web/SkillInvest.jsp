<%-- 
    Document   : SkillInvest
    Created on : 2019/1/6, 上午 11:35:36
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
            //取出表單勾選的項目
            String [] skills = request.getParameterValues("skills");
            for( String skill : skills ) {
                out.println("技能選擇: " + skill + "<br>");
            }
        %>
    </body>
</html>

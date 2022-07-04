<%-- 
    Document   : ScriptDeclaration
    Created on : 2018/12/16, 下午 01:53:54
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
        <%!
          int x = 55688;
          public int sum(int x , int y ) {
            return x+y;
          }  
        %>
        <%  int x = 12345; %>
        
        
        <h1>Script Declaration 示範</h1>
        <h3> 3+3 = <%= 3+3 %> </h3>
        x = <%= x %>
        
        
        <h3> 132+579 = <%= sum(132,579) %> </h3>
    </body>
</html>

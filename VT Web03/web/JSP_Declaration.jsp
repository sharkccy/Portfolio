<%-- 
    Document   : JSP_Declaration
    Created on : 2018/12/23, 下午 03:50:34
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
            int total = 0;
            public void sum(int x , int y ) {
                total = x+y;
            }
        %>
        
        <%  int x = 5; %>
        <jsp:scriptlet>
            int y = 5;
        </jsp:scriptlet>
        <jsp:declaration>
            public void m2() {

            }
        </jsp:declaration>
      
    </body>
</html>

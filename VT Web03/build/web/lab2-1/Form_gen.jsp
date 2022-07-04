<%-- 
    Document   : Form_gen
    Created on : 2018/12/23, 下午 01:37:37
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        int n = Integer.valueOf(request.getParameter("n"));
        int m = Integer.valueOf(request.getParameter("m"));
    %>
    <body>
        <h1>動態表格製作( <%= n %> x <%= m %> )</h1>
        
        <table border="1" width="90%">
            <caption> 動態table </caption>
            <tbody>
                <% for(int i=1; i<=n ; i++) {  
                    out.println("<tr>");
                    for(int j=1; j<=m ; j++ ) {
                        out.println("<td>" + i*j + "</td>");
                    }                    
                    out.println("</tr>");
                   }
                %>
            </tbody>
        </table>
            
            <h2>適合美工協同作業的風格</h2>
             <table border="1" width="90%">
            <caption> 動態table </caption>
            <tbody>
                <% for(int i=1; i<=n ; i++) {  %>
                  <tr>
                    <% for(int j=1;j<=m ;j++) { %>
                    <td>   <%= i*j %>  </td>
                    <% } %>
                  </tr>                    
                <% } %>
            </tbody>
        </table>
    </body>
</html>

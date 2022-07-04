<%-- 
    Document   : ResponseDemo
    Created on : 2018/12/16, 下午 04:14:19
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
            java.util.Date now = new java.util.Date();
          // 例如: 當使用者超過晚上 16:00 以後來訪  將系統轉向 其他網頁            
          int hour = now.getHours();
          if( hour > 15) {
              //將使用者轉到 DenyAccess.jsp 頁面
              response.sendRedirect("DenyAccess.jsp");
          }
        %>
        目前時間:  <%= now %>
    </body>
</html>

<%-- 
    Document   : BrowserType
    Created on : 2018/12/16, 下午 03:43:21
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
      String browser = null , lang = null;
      String encoding = request.getHeader("Accept-Language").toLowerCase();
      String agent = request.getHeader("User-Agent").toLowerCase();
      if( agent.contains("wow64")) {
          browser = "IE瀏覽器"; 
      } else if(agent.contains("chrome")) {
          browser = "Chrome 瀏覽器"; 
      } else if(agent.contains("firefox")) {
          browser = "Firefox 瀏覽器"; 
      }
      if(encoding.contains("zh-tw") ) {
          lang = "繁體中文版";
      } else if (encoding.contains("zh-cn") ) {
          lang = "簡體中文版";
      }
      
    %>
    <body>
        <h1>瀏覽器版本: <%= browser %></h1>
        <h2>瀏覽器語系: <%= lang %> </h2>
    </body>
</html>

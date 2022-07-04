<%-- 
    Document   : JSP_TagDemo
    Created on : 2018/12/23, 下午 02:20:32
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
        <h1>程式碼標籤化</h1>
        
        <% // response.sendRedirect("index.jsp"); %>
      <%--
                pojo.Calc calc = new pojo.Calc();
                calc.setX(45);
                calc.setY(30);
                calc.calcTotal();
                out.println("result: " + calc.getSum());
        --%>
        <jsp
        <jsp:useBean class="pojo.Calc" id="calc"/>
        <jsp:setProperty name="calc" property="x" value="45"/>        
        <jsp:setProperty name="calc" property="y" value="30"/>
        <jsp:scriptlet>
            calc.calcTotal();
        </jsp:scriptlet>
        Result: <jsp:getProperty name="calc" property="sum"/>
    </body>
</html>

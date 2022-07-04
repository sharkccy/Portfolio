<%-- 
    Document   : ShoppingList
    Created on : 2019/1/6, 上午 10:50:55
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
        <h1>您的購物車內容如下</h1>
         <!-- 將商品從購物車內取出 顯示在下列畫面 -->
         <%
           java.util.ArrayList<String> shoppingCart = (java.util.ArrayList<String>) session.getAttribute("cart");
           for(String item : shoppingCart) {
               out.println("商品: " + item +"<br/>");
           }
         %>
        
    </body>
</html>

<%-- 
    Document   : ShoppingCart
    Created on : 2019/1/6, 上午 10:40:41
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
        <h1>Hello World!</h1>
        <%
          String ipx = request.getParameter("iphoneX");
          String ipad = request.getParameter("ipadPro");
          String mate = request.getParameter("mate");
          String usb128 = request.getParameter("usb128");
          
          //將商品放入購物車
          java.util.ArrayList<String> shoppingCart = new java.util.ArrayList();
          if( ipx != null ) {
              shoppingCart.add("iphone x");
          }
          if( ipad != null ) {
              shoppingCart.add("ipad pro");
          }
          if( mate != null ) {
              shoppingCart.add("mate pro");
          }
          if( usb128 != null ) {
              shoppingCart.add("USB 128G");
          }
          session.setAttribute("cart", shoppingCart);
          //--------------------------------------------------------------------
          java.util.ArrayList<String> shoppingCart2 = new java.util.ArrayList();          
        %>
        商品以放入購物出, 檢視<a href="ShoppingList.jsp">購物車</a>內容
        <hr/>
        <%
          java.util.Enumeration<String> ptr = request.getParameterNames();
          while(ptr.hasMoreElements()) {
              String item = ptr.nextElement();
              out.println("項目; " + item +"<br/>" );
          }  
        %>
    </body>
</html>

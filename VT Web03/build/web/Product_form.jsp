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
        <h1>商品選購表</h1>
        
        <form action="ShoppingCart.jsp">
            iphone x: <input type="checkbox" name="iphoneX" value="iPhone X" /><br/>
            ipad pro: <input type="checkbox" name="ipadPro" value="iPad Pro" /><br/>
            mate pro: <input type="checkbox" name="mate" value="HuaWei Mate Pro" /><br/>
            USB 128G: <input type="checkbox" name="usb128" value="USB 128G" /><br/>
            <input type="submit" value="加入購物車" />
        </form>
    </body>
</html>

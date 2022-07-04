<%-- 
    Document   : QueryProducts
    Created on : 2019/1/13, 下午 12:06:43
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
           java.sql.Connection con;
            java.sql.Statement stmt;
            java.sql.ResultSet rs1,rs2;
            
            Class.forName("org.mariadb.jdbc.Driver");            
            con = java.sql.DriverManager.getConnection("jdbc:mariadb://127.0.0.1/classicmodels", "root", "123456"); //替換 root            
            stmt = con.createStatement();           
            rs1 = stmt.executeQuery("SELECT distinct productLine from products");
            rs2 = stmt.executeQuery("SELECT distinct productScale from products");
        %>
    <body>
        <h1>依產品類型與比例查詢</h1>
         <form action="ShowCustomer2.jsp">
            請選擇產品類型(下拉選單):
            <select name="line">
             <% while(rs1.next() ) { %>
             <option value="<%= rs1.getString(1) %>"><%= rs1.getString(1) %></option>
             <% } %>    
            </select>            
            <select name="scale">
             <% while(rs2.next() ) { %>
             <option value="<%= rs2.getString(1) %>"><%= rs2.getString(1) %></option>
             <% } %>    
            </select>
            
            <input type="submit" value="查詢" />
        </form>
    </body>
</html>

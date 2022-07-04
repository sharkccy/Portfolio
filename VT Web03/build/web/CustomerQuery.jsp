<%-- 
    Document   : CustomerQuery
    Created on : 2019/1/13, 上午 11:00:17
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
        <h1>客戶查詢</h1>
        <form action="ShowCustomer.jsp">
            請輸入客戶名稱(模糊查詢): <input type="text" name="companyName" value="" /><br>
            <input type="submit" value="查詢" />
        </form>
        <hr/>
        
        <%
           java.sql.Connection con;
            java.sql.Statement stmt;
            java.sql.ResultSet rs;
            
            String cname = request.getParameter("country");
            String sql = "SELECT DISTINCT COUNTRY FROM CUSTOMERS";
            System.out.println("SQL: " + sql);
            Class.forName("org.mariadb.jdbc.Driver");            
            con = java.sql.DriverManager.getConnection("jdbc:mariadb://127.0.0.1/classicmodels", "root", "123456"); //替換 root            
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);                               
        %>
        
        <h2>使用國家別查詢</h2>
        <form action="ShowCustomer2.jsp">
            請選擇指定國家客戶(下拉選單):
            <select name="country">
             <% while(rs.next() ) { %>
             <option value="<%= rs.getString(1) %>"><%= rs.getString(1) %></option>
             <% } %>    
            </select>
            <input type="submit" value="查詢" />
        </form>
          
    </body>
</html>

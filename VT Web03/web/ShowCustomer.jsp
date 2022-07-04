<%-- 
    Document   : ShowCustomer
    Created on : 2019/1/13, 上午 09:42:19
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
        <h1>客戶報表</h1>
        
        <%
            java.sql.Connection con;
            java.sql.Statement stmt;
            java.sql.ResultSet rs;
            
            String cname = request.getParameter("companyName");
            String sql = "SELECT * FROM CUSTOMERS where customerName like '%" + cname + "%'";
            System.out.println("SQL: " + sql);
                    
            
            
            // 步驟0
            Class.forName("org.mariadb.jdbc.Driver");
            // 步驟 1 取得連線
            con = java.sql.DriverManager.getConnection("jdbc:mariadb://127.0.0.1/classicmodels", "root", "123456"); //替換 root
            // 建立  SQL 代表物件
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);            
        %>
        <table border="1px"> 
            <caption>客戶資料查詢結果</caption>
            <tr>
                <th>客戶編號</th>
                <th>公司名稱</th>
                <th>連路電話</th>
                <th>所在都市</th>
                <th>所在國家</th>                
            </tr>
            <%
              while( rs.next() ) {
            %>
            <tr>
                <td><%= rs.getInt("customerNumber") %></td>
                <td><%= rs.getString(2) %></td>
                <td><%= rs.getString("phone") %></td>
                <td><%= rs.getString("city") %></td>
                <td><%= rs.getString("country") %></td>                
            </tr>
            <%
              }  
              //釋放所有資源
              rs.close();
              stmt.close();
              con.close();
            %>
        </table>
        
        
    </body>
</html>

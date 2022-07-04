<%-- 
    Document   : ShowProducts
    Created on : 2019/1/6, 下午 04:04:45
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
        <h1>模型公司所有商品清單 </h1>
        <hr/>
        <%  //資料擷取過程
        java.sql.Connection con = null;
        java.sql.Statement sqlStmt = null;
        java.sql.ResultSet rs = null;
        
        // 步驟 0 
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            out.println("步驟0 完成<br/>");
        }catch(java.lang.ClassNotFoundException e) {
            out.println("無法載入驅動程式,請確認名稱或 jar檔有放入專案");
        }
        // 步驟 1
        try {
            con = java.sql.DriverManager.getConnection("jdbc:mariadb://127.0.0.1/classicmodels", "root", "123456");
            out.println("步驟1 完成<br/>");
        } catch( java.sql.SQLException e) {
            out.println("連線失敗, 請確認帳密或連線網址正確<br/>");
        }
        // 步驟 2
            sqlStmt = con.createStatement();
            out.println("步驟2 完成<br/>");
        // 步驟 3
        try {
            rs = sqlStmt.executeQuery("select * from products");
            out.println("步驟3 完成<br/>");
        }catch(java.sql.SQLException e) {
            out.println("sql 語法錯誤 請檢查: " + e.getMessage() +"<br/>");
        }

    %>
        
        <%
          // 步驟 4
          while( rs.next() ) {
              out.println("產品名稱: " +rs.getString(2)) ;
              out.println("比例尺吋: " +rs.getString("productScale") );
              out.print("<hr>");
          }
          // 步驟 5
          rs.close();
          sqlStmt.close();
          con.close();
        %>
        
    </body>
</html>

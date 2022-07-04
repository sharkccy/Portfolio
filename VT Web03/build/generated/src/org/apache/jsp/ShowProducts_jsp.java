package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShowProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1>模型公司所有商品清單 </h1>\n");
      out.write("        <hr/>\n");
      out.write("        ");
  //資料擷取過程
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

    
      out.write("\n");
      out.write("        \n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

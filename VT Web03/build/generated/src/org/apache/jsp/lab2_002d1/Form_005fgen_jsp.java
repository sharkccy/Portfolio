package org.apache.jsp.lab2_002d1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Form_005fgen_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");

        int n = Integer.valueOf(request.getParameter("n"));
        int m = Integer.valueOf(request.getParameter("m"));
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h1>動態表格製作(");
      out.print( n);
      out.write(" x ");
      out.print( m);
      out.write(")</h1>        \n");
      out.write("\n");
      out.write("        <table width=\"90%\" border=\"1\">\n");
      out.write("            <caption>動態Table</caption>                                        \n");
      out.write("            <tbody>\n");
      out.write("                ");

                    for (int i = 1; i <= n; i++) {
                        out.println("<tr>");
                        for (int j = 1; j <= m; j++) {
                            out.println("<td>" + i * j + "</td>");
                        }
                        out.println("</tr>");
                    }
                
      out.write("\n");
      out.write("            </tbody>                  \n");
      out.write("        </table>\n");
      out.write("        <h2>適合美工協同作業的風格</h2>\n");
      out.write("        <table width=\"90%\" border=\"1\">\n");
      out.write("            <caption>動態Table</caption>                                        \n");
      out.write("            <tbody>\n");
      out.write("                ");
for (int i = 1; i <= n; i++) {
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        ");
 for (int j = 1; j <= m; j++) {
      out.write("\n");
      out.write("                        <td> ");
      out.print( i * j);
      out.write(" </td>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                ");
 }
      out.write("                                                                   \n");
      out.write("            </tbody>                  \n");
      out.write("        </table>\n");
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

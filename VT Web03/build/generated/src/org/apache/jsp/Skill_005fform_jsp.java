package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Skill_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("        <h1>程式開發技能調查</h1>\n");
      out.write("        <h4>請勾選擅長技術</h4>\n");
      out.write("        <form action=\"SkillInvest.jsp\">\n");
      out.write("            Java <input type=\"checkbox\"        name=\"skills\" value=\"java\" /><br/>\n");
      out.write("            C# <input type=\"checkbox\"          name=\"skills\" value=\"c#\" /><br/>\n");
      out.write("            PHP <input type=\"checkbox\"         name=\"skills\" value=\"php\" /><br/> \n");
      out.write("            HTML <input type=\"checkbox\"        name=\"skills\" value=\"html\" /><br/>\n");
      out.write("            JavaScript <input type=\"checkbox\"  name=\"skills\" value=\"JavaScript\" /><br/>\n");
      out.write("            Type Script <input type=\"checkbox\" name=\"skills\" value=\"type script\" /><br/>\n");
      out.write("            MySQL <input type=\"checkbox\"       name=\"skills\" value=\"mysql\" /><br/>\n");
      out.write("            MSSQL <input type=\"checkbox\"       name=\"skills\" value=\"mssql\" /><br/>\n");
      out.write("            <input type=\"submit\" value=\"送出\" />\n");
      out.write("        </form>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Enumeration;
import java.util.ArrayList;

public final class ShoppingCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");
 
          String ipadPro = request.getParameter("ipadPro");
          String iphoneX = request.getParameter("iphoneX");
          String MacPro = request.getParameter("MacPro");
          String appleWatch = request.getParameter("appleWatch");
          //????????????????????????
          ArrayList<String> shoppingcart= new ArrayList();
          if(ipadPro != null){
              shoppingcart.add("ipadPro");
          }
          if(iphoneX != null){
              shoppingcart.add("ipadPro");
          }
          if(MacPro != null){
              shoppingcart.add("ipadPro");
          }
          if(appleWatch != null){
              shoppingcart.add("ipadPro");
          } 
          session.setAttribute("cart", shoppingcart);
          //------------------------------------------
          java.util.ArrayList<String> shoppingcart2= new java.util.ArrayList();
        
      out.write("\n");
      out.write("        ????????????????????????<a href=\"ShoppingLIst.jsp\">???????????????</a><br/>\n");
      out.write("        ");

            java.util.Enumeration<String> ptr = request.getParameterNames();
            while(ptr.hasMoreElements()){
                String item = ptr.nextElement();
                out.print("??????" + item + "<br/>");
            }
        
      out.write("\n");
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

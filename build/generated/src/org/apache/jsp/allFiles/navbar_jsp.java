package org.apache.jsp.allFiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\n");
      out.write("\t<a class=\"navbar-brand\" href=\"index.jsp\"><i class=\"fa-solid fa-phone\"></i> PhoneBook</a>\n");
      out.write("\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("\t\tdata-target=\"#navbarSupportedContent\"\n");
      out.write("\t\taria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("\t\taria-label=\"Toggle navigation\">\n");
      out.write("\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t</button>\n");
      out.write("\n");
      out.write("\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\t\t<ul class=\"navbar-nav mr-auto\">\n");
      out.write("\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"index.jsp\"><i class=\"fa-solid fa-house\"></i> Home\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">(current)</span>\n");
      out.write("\t\t\t</a></li>\n");
      out.write("\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"addContact.jsp\"><i class=\"fa-solid fa-circle-plus\"></i> AddPhoneNo</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"viewContact.jsp\"><i class=\"fa-solid fa-eye\"></i> ViewContact</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("\n");
      out.write("\t\t\t<a class=\"btn btn-primary\" href=\"login.jsp\"><i class=\"fa-solid fa-user\"></i> Login</a> <a\n");
      out.write("\t\t\t\tclass=\"btn btn-primary ml-2\" href=\"register.jsp\"><i class=\"fa-solid fa-address-card\"></i> Register</a>\n");
      out.write("\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</nav>");
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

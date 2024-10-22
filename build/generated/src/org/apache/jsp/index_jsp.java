package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import com.connection.DbConnect;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/allFiles/allCss.jsp");
    _jspx_dependants.add("/allFiles/navbar.jsp");
    _jspx_dependants.add("/allFiles/footer.jsp");
  }

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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>PhonebookProject</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\n");
      out.write("\tintegrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n");
      out.write("\tintegrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\n");
      out.write("\tintegrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\n");
      out.write("\tintegrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\"\n");
      out.write("\tintegrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\"\n");
      out.write("\tcrossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\"> ");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".back-img\n");
      out.write("{\n");
      out.write("\n");
      out.write(" background: url(\"img/black.png\");\n");
      out.write(" width: 100%;\n");
      out.write(" height: 80vh;\n");
      out.write(" background-repeat: no-repeat;\n");
      out.write(" background-size: cover;\n");
      out.write("\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"background: url(img/black.png); background-size: cover;background-attachment: fixed;\">\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"back-img text-center text-white mt-5\">\n");
      out.write("\n");
      out.write("<h1>Welcome to Phonebook App</h1>\n");


  Connection con =  DbConnect.getConnection();


   out.println(con);


   out.println("<h1>/nikal le</h1>");

      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"bg-primary p-5\">\n");
      out.write("\n");
      out.write("<h5 class=\"text-white text-center\">Developed And Designed By Vinit Solanki</h5>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"bg-primary p-5\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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

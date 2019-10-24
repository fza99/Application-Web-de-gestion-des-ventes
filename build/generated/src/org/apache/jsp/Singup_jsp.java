package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Singup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write(" \n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Concept - Bootstrap 4 Admin Dashboard Template</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"../assets/vendor/fonts/circular-std/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/libs/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/vendor/fonts/fontawesome/css/fontawesome-all.css\">\n");
      out.write("    <style>\n");
      out.write("    html,\n");
      out.write("    body {\n");
      out.write("        height: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    body {\n");
      out.write("        display: -ms-flexbox;\n");
      out.write("        display: flex;\n");
      out.write("        -ms-flex-align: center;\n");
      out.write("        align-items: center;\n");
      out.write("        padding-top: 40px;\n");
      out.write("        padding-bottom: 40px;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<!-- ============================================================== -->\n");
      out.write("<!-- signup form  -->\n");
      out.write("<!-- ============================================================== -->\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- signup form  -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <form class=\"splash-container\" action=\"Singup\" method=\"post\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"card-header\">\n");
      out.write("                <h3 class=\"mb-1\">Registrations Form</h3>\n");
      out.write("                <p>Please enter your user information.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control form-control-lg\" type=\"text\" name=\"username\" required=\"\" placeholder=\"Username\" autocomplete=\"off\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control form-control-lg\" type=\"email\" name=\"email\" required=\"\" placeholder=\"E-mail\" autocomplete=\"off\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control form-control-lg\" type=\"text\" name=\"prenom\" required=\"\" placeholder=\"Prenom\" autocomplete=\"off\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control form-control-lg\" type=\"text\" name=\"nom\" required=\"\" placeholder=\"Nom\" autocomplete=\"off\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control form-control-lg\" name=\"pass\" type=\"password\" required=\"\" placeholder=\"Password\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control form-control-lg\" required=\"\" placeholder=\"Confirm\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group pt-2\">\n");
      out.write("                    <button class=\"btn btn-block btn-primary\" type=\"submit\">Register My Account</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"custom-control custom-checkbox\">\n");
      out.write("                        <input class=\"custom-control-input\" type=\"checkbox\"><span class=\"custom-control-label\">By creating an account, you agree the <a href=\"#\">terms and conditions</a></span>\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-footer bg-white\">\n");
      out.write("                <p>Already member? <a href=\"#\" class=\"text-secondary\">Login Here.</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write(" \n");
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

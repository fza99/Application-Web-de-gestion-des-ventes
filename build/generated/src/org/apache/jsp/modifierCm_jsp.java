package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modifierCm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_setDataSource_var_user_url_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_query_var_dataSource;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_s_setDataSource_var_user_url_password_driver_nobody.release();
    _jspx_tagPool_s_query_var_dataSource.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Concept - Bootstrap 4 Admin Dashboard Template</title>\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"../assets/vendor/fonts/circular-std/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/libs/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/vendor/fonts/fontawesome/css/fontawesome-all.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"dashboard-main-wrapper\">\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- navbar -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <div class=\"dashboard-header\">\n");
      out.write("                <nav class=\"navbar navbar-expand-lg bg-white fixed-top\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"home.jsp\">home</a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav ml-auto navbar-right-top\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <div id=\"custom-search\" class=\"top-search-bar\">\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Search..\">\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown notification\">\n");
      out.write("                                <a class=\"nav-link nav-icons\" href=\"#\" id=\"navbarDropdownMenuLink1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><i class=\"fas fa-fw fa-bell\"></i> <span class=\"indicator\"></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu dropdown-menu-right notification-dropdown\">\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown connection\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"fas fa-fw fa-th\"></i> </a>\n");
      out.write("                                <ul class=\"dropdown-menu dropdown-menu-right connection-dropdown\">\n");
      out.write("\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"conntection-footer\"><a href=\"#\">More</a></div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown nav-user\">\n");
      out.write("                                <a class=\"nav-link nav-user-img\" href=\"#\" id=\"navbarDropdownMenuLink2\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><img src=\"../assets/images/avatar-1.jpg\" alt=\"\" class=\"user-avatar-md rounded-circle\"></a>\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right nav-user-dropdown\" aria-labelledby=\"navbarDropdownMenuLink2\">\n");
      out.write("                                    <div class=\"nav-user-info\">\n");
      out.write("                                        <h5 class=\"mb-0 text-white nav-user-name\">John Abraham </h5>\n");
      out.write("                                        <span class=\"status\"></span><span class=\"ml-2\">en ligne</span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-user mr-2\"></i>Sing in </a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-power-off mr-2\"></i>Logout</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- main wrapper -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <div class=\"dashboard-main-wrapper\">\n");
      out.write("                <div class=\"nav-left-sidebar sidebar-dark\">\n");
      out.write("                    <div class=\"menu-list\">\n");
      out.write("                        <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                            \n");
      out.write("                            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                                <ul class=\"navbar-nav flex-column\">\n");
      out.write("                                    <li class=\"nav-divider\">\n");
      out.write("                                        Menu\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item \">\n");
      out.write("                                        \n");
      out.write("                                        <div id=\"submenu-1\" class=\"collapse submenu\" style=\"\">\n");
      out.write("                                            <ul class=\"nav flex-column\">\n");
      out.write("                                                <li class=\"nav-item\">\n");
      out.write("                                                    <div id=\"submenu-1-2\" class=\"collapse submenu\" style=\"\">\n");
      out.write("                                                        <ul class=\"nav flex-column\">\n");
      out.write("                                                            <li class=\"nav-item\">\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li class=\"nav-item\">\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li class=\"nav-item\">\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li class=\"nav-item\">\n");
      out.write("                                                            </li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </li>\n");
      out.write("                                               \n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                    \n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a class=\"nav-link\" href=\"#\"  aria-expanded=\"false\" data-target=\"#submenu-6\" aria-controls=\"submenu-6\"><i class=\"fas fa-fw fa-file\"></i>Catalogue</a>\n");
      out.write("                                        \n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item \">\n");
      out.write("                                        <a class=\"nav-link\" href=\"#\"  aria-expanded=\"false\" data-target=\"#submenu-4\" aria-controls=\"submenu-4\"><i class=\"fab fa-fw fa-wpforms\"></i>NOS PRODUITS </a>\n");
      out.write("                                        \n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a class=\"nav-link\" href=\"#\" aria-expanded=\"false\" data-target=\"#submenu-5\" aria-controls=\"submenu-5\"><i class=\"fas fa-fw fa-table\"></i>Faire votre commande</a>\n");
      out.write("                                   \n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a class=\"nav-link\" href=\"#\" aria-expanded=\"false\" data-target=\"#submenu-10\" aria-controls=\"submenu-10\"><i class=\"fas fa-f fa-folder\"></i>Ma commande</a>\n");
      out.write("                                        \n");
      out.write("                                                \n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                <div class=\"dashboard-wrapper\">\n");
      out.write("                    <div class=\"container-fluid dashboard-content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12\">\n");
      out.write("                                <div class=\"page-header\">\n");
      out.write("                                    <h2 class=\"pageheader-title\">Votre commande</h2>\n");
      out.write("                                    <div class=\"page-breadcrumb\">\n");
      out.write("                                        <nav aria-label=\"breadcrumb\">\n");
      out.write("                                            <ol class=\"breadcrumb\">\n");
      out.write("                                        </nav>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    <div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h5 class=\"card-header\">catalogue</h5>\n");
      out.write("                              \n");
      out.write("                                        \n");
      out.write("                                            \n");
      out.write("                                                <thead class=\"bg-light\">\n");
      out.write("                                                    <tr class=\"border-0\">\n");
      out.write("                                                        <th class=\"border-0\">Produit Achheté</th>\n");
      out.write("                                                        \n");
      out.write("                                                    </tr>\n");
      out.write("                                                </thead>\n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                ");
      if (_jspx_meth_s_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_s_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                <tbody>\n");
      out.write("                                                  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </tbody>\n");
      out.write("                                        \n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        <script src=\"../assets/vendor/jquery/jquery-3.3.1.min.js\"></script>\n");
      out.write("                        <script src=\"../assets/vendor/bootstrap/js/bootstrap.bundle.js\"></script>\n");
      out.write("                        <script src=\"../assets/vendor/slimscroll/jquery.slimscroll.js\"></script>\n");
      out.write("                        <script src=\"../assets/libs/js/main-js.js\"></script>\n");
      out.write("                        <script src=\"../assets/vendor/shortable-nestable/Sortable.min.js\"></script>\n");
      out.write("                        <script src=\"../assets/vendor/shortable-nestable/sort-nest.js\"></script>\n");
      out.write("                        <script src=\"../assets/vendor/shortable-nestable/jquery.nestable.js\"></script>\n");
      out.write("\n");
      out.write("                        </body>\n");
      out.write("                                \n");
      out.write("                        </html>");
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

  private boolean _jspx_meth_s_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_s_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_s_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_s_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_s_setDataSource_0.setParent(null);
    _jspx_th_s_setDataSource_0.setVar("dbSource");
    _jspx_th_s_setDataSource_0.setDriver("org.apache.derby.jdbc.ClientDriver");
    _jspx_th_s_setDataSource_0.setUrl("jdbc:derby://localhost:1527/ProjetS3");
    _jspx_th_s_setDataSource_0.setUser("elamrani");
    _jspx_th_s_setDataSource_0.setPassword("elamrani");
    int _jspx_eval_s_setDataSource_0 = _jspx_th_s_setDataSource_0.doStartTag();
    if (_jspx_th_s_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_s_setDataSource_0);
      return true;
    }
    _jspx_tagPool_s_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_s_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_s_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_s_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_s_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_s_query_0.setPageContext(_jspx_page_context);
    _jspx_th_s_query_0.setParent(null);
    _jspx_th_s_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_query_0.setVar("result");
    int[] _jspx_push_body_count_s_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_s_query_0 = _jspx_th_s_query_0.doStartTag();
      if (_jspx_eval_s_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_s_query_0[0]++;
          _jspx_th_s_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_query_0.doInitBody();
        }
        do {
          out.write(" select* from panier  ");
          int evalDoAfterBody = _jspx_th_s_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_s_query_0[0]--;
      }
      if (_jspx_th_s_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_query_0.doFinally();
      _jspx_tagPool_s_query_var_dataSource.reuse(_jspx_th_s_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("row");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <tr>\n");
          out.write("                                                         <td>\n");
          out.write("                                                            <div class=\"m-r-10\"><img src=\"");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\" alt=\"\" class=\"rounded\" width=\"170\"></div>\n");
          out.write("                                                        </td>\n");
          out.write("                                                        <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                                        \n");
          out.write("                                                        <div class=\"btn-group ml-auto\">\n");
          out.write("                                                            <td><i><a href=\"cata.jsp\"><button class=\"btn btn-sm btn-outline-light\">Edit</button></i></a></td>\n");
          out.write("                                                  <form action=\"sup\" method=\"POST\">\n");
          out.write("                                                        <td><button> <i class=\"far fa-trash-alt\"></i></button></td>\n");
          out.write("                                                  </form>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </tr>\n");
          out.write("                                                  ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.image}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.idarticle}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}
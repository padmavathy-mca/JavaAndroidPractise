package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/inc/head.jsp");
    _jspx_dependants.add("/inc/headbeforelogin.jsp");
    _jspx_dependants.add("/inc/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Dig Info</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.5.2.js\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-replace.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/Molengo_400.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/Expletus_Sans_400.font.js\"></script>\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script type=\"text/javascript\" src=\"js/html5.js\"></script>\n");
      out.write("<style type=\"text/css\">.bg, .box2{behavior:url(\"js/PIE.htc\");}</style>\n");
      out.write("<![endif]-->\n");
      out.write("</head>");
      out.write("\n");
      out.write("<body id=\"page5\">\n");
      out.write("    \n");
      out.write("    ");
      out.write("<div class=\"body1\">\n");
      out.write("  <div class=\"main\">\n");
      out.write("    <!-- header -->\n");
      out.write("    \n");
      out.write("    <header>\n");
      out.write("        \n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("         \n");
      out.write("        <nav>\n");
      out.write("          <ul id=\"menu\">\n");
      out.write("                \n");
      out.write("              <li> <a href=\"index.jsp\"><font color=\"yellow\"><b>Digital Information</b></font></a></li>\n");
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"reg.jsp\">Registration</a></li>\n");
      out.write("            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("            <!--<li><a href=\"teachers.html\">Teachers</a></li>\n");
      out.write("            <li><a href=\"admissions.html\">Admissions</a></li>\n");
      out.write("            <li class=\"end\"><a href=\"contacts.html\">Contacts</a></li>-->\n");
      out.write("             \n");
      out.write("          </ul>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("        <br><br>\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("    <!-- / header -->\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write(" ");
      out.write("\n");
      out.write("    \n");
      out.write("<div class=\"body2\">\n");
      out.write("  <div class=\"main\">\n");
      out.write("      \n");
      out.write(" \n");
      out.write(" \n");
      out.write("        <script src=\"scriptaculous/lib/prototype.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t<script src=\"scriptaculous/src/effects.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"fabtabulous.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"validation.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <!-- content -->\n");
      out.write("    <section id=\"content\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("                ");

        
if(request.getParameter("msg")!=null)
       {
    
      out.write("\n");
      out.write("    <font color=\"green\" size=\"6\">");
      out.print(request.getParameter("msg"));
      out.write("</font>\n");
      out.write("        \n");
      out.write("        ");

}



      out.write("\n");
      out.write("     <div class=\"box1\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("          <article class=\"col1\">\n");
      out.write("            <div class=\"pad_left1\">\n");
      out.write("              <h2>Registration Form</h2>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              <form id=\"ContactForm\"   action=\"regaction\"  id=\"test\">\n");
      out.write("                <div>\n");
      out.write("                    \n");
      out.write("                      <div  class=\"wrapper\"> <strong>Member:</strong>\n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"type\" value=\"Company\" checked=\"selected\" />Company\n");
      out.write("                     <input type=\"radio\" name=\"type\" value=\"Student\" />Student\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                  <div  class=\"wrapper\"> <strong>Name:</strong>\n");
      out.write("                    <div class=\"bg\">\n");
      out.write("                      <input type=\"text\" name=\"na\" class=\"input\" class=\"required\"  >\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div  class=\"wrapper\"> <strong>Email:</strong>\n");
      out.write("                    <div class=\"bg\">\n");
      out.write("                      <input type=\"text\" name=\"email\" class=\"input\" class=\"required\" >\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                 <div  class=\"wrapper\"> <strong>Password:</strong>\n");
      out.write("                    <div class=\"bg\">\n");
      out.write("                      <input type=\"text\" name=\"psw\" class=\"input\" class=\"required\" >\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                    \n");
      out.write("                      <div  class=\"wrapper\"> <strong>Phone Number:</strong>\n");
      out.write("                    <div class=\"bg\">\n");
      out.write("                      <input type=\"text\" name=\"phno\" class=\"input\" class=\"required\" >\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <input type=\"reset\" class=\"button\" value=\"Clear\"><input type=\"submit\" class=\"button\" value=\"Register\"> </div>\n");
      out.write("              </form>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("   \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </article>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </section>\n");
      out.write("    <!-- content -->\n");
      out.write("    <!-- footer -->\n");
      out.write("    ");
      out.write(" <footer>\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("        <div class=\"pad1\">\n");
      out.write("          <div class=\"pad_left1\">\n");
      out.write("     \n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("              <article class=\"call\"> <span class=\"call1\">Call Us Now: </span><span class=\"call2\">040-40172720</span> </article>\n");
      out.write("              <article class=\"col_4 pad_left2\">Copyright &copy; <a href=\"#\">SattvaQ</a> All Rights Reserved<br>\n");
      out.write("                Design by <a target=\"_blank\" href=\"http://www.sattvaq.com/\">Name1 and Name2</a></article>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- / footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- / footer -->\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
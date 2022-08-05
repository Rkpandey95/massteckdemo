package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"css/bootstrap-3.1.1.min.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("<!----font-Awesome----->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t    <div class=\"navbar-header\">\n");
      out.write("\t        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t        </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\"><h1 style=\"color:white;\">HDB Staff</h1></a>\n");
      out.write("\t    </div>\n");
      out.write("\t    <!--/.navbar-header-->\n");
      out.write("\t    <div class=\"navbar-collapse collapse\" id=\"bs-example-navbar-collapse-1\" style=\"height: 1px;\">\n");
      out.write("\t        <ul class=\"nav navbar-nav\">\n");
      out.write("\t\t        <li class=\"dropdown\">\n");
      out.write("\t\t            <a href=\"#\" >Home</a>\n");
      out.write("\t\t            \n");
      out.write("\t\t        </li>\n");
      out.write("\t\t        \n");
      out.write("\t\t        <li class=\"dropdown\">\n");
      out.write("\t\t            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Login<b class=\"caret\"></b></a>\n");
      out.write("\t\t             <ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t            <li><a href=\"adminlogin.jsp\">Admin</a></li>\n");
      out.write("\t\t\t            <li><a href=\"stafflogin.jsp\">Staff</a></li>\n");
      out.write("\t\t\t            \n");
      out.write("\t\t             </ul>\n");
      out.write("\t\t        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("\t\t            <a href=\"register.jsp\" >Staff Register</a>\n");
      out.write("\t\t       </li>\n");
      out.write("                       <!-- <li class=\"dropdown\">\n");
      out.write("\t\t            <a href=\"postjob.jsp\" >Post Job</a>\n");
      out.write("\t\t       </li>-->\n");
      out.write("                        \n");
      out.write("\t\t  </ul>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"clearfix\"> </div>\n");
      out.write("\t  </div>\n");
      out.write("\t    <!--/.navbar-collapse-->\n");
      out.write("\t</nav>");
      out.write("\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.8.3.js\"></script>\n");
      out.write("  <script src=\"http://code.jquery.com/ui/1.9.2/jquery-ui.js\"></script>\n");
      out.write("\n");
      out.write("   <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <script>\n");
      out.write("$(function() {\n");
      out.write("    $( \"#dateOfclosing\" ).datepicker();\n");
      out.write("    $( \"#dateOfposting\" ).datepicker();\n");
      out.write("});\n");
      out.write("\n");
      out.write("function validate(){\n");
      out.write("    var regName = /^[a-zA-Z]/;\n");
      out.write("    var regPass = /^[a-zA-Z0-9!@#$%^&*]{6,16}$/;\n");
      out.write("    var name = document.getElementById('staffname').value;\n");
      out.write("    var namePass = document.getElementById('staffpass').value;\n");
      out.write("    if(!regName.test(name)){\n");
      out.write("        alert('Please enter correct name.');\n");
      out.write("        document.getElementById('staffname').focus();\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("   else if(!regPass.test(namePass))\n");
      out.write("    {\n");
      out.write("        alert('Please enter password name.');\n");
      out.write("        document.getElementById('staffname').focus();\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<div class=\"banner\">\n");
      out.write("    \n");
      out.write("\t<div class=\"container\">\n");
      out.write("            <form action=\"RegisterServlet\" method=\"post\">\n");
      out.write("            <table style=\"height: 250px;\">\n");
      out.write("            <tr><td>Staff Name</td><td><input type=\"text\" name=\"staffname\" id=\"staffname\" required></td></tr>\n");
      out.write("            <tr><td>Staff Id</td><td><input type=\"text\" name=\"staffid\" id=\"staffid\" required></td></tr>\n");
      out.write("            <tr><td>Password</td><td><input type=\"password\" name=\"staffpass\" id=\"staffpass\" required></td></tr>\n");
      out.write("            <tr><td>Category of the sales Item</td>\n");
      out.write("                <td> <select name=\"citem\" required>\n");
      out.write("                        <option>Item1</option>\n");
      out.write("                        <option>Item2</option>\n");
      out.write("                        <option>Item3</option>\n");
      out.write("                        <option>Item4</option>\n");
      out.write("                    </select></td>\n");
      out.write("            <tr><td>Date of post Creation</td>\n");
      out.write("                <td><input type=\"datetime\" id=\"dateOfposting\" name=\"dateofpost\" required=\"\"></td></tr>\n");
      out.write("            <tr><td>Date of Closing</td>\n");
      out.write("                <td><input type=\"datetime\" id=\"dateOfclosing\" name=\"dateofclosing\" required></td></tr>\n");
      out.write("        \n");
      out.write("            </tr>\n");
      out.write("                <tr><td colspan=\"2\" align=\"right\"><input type=\"submit\" onclick=\"validate();\" value=\"ADD\" name=\"btnsubmit\" id=\"btnsubmit\" /></td></tr>\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("                 ");

                  if(request.getParameter("m")!=null)   
                  {
                      out.print(request.getParameter("m"));
                  }
                  
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("   </div> \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 col-sm-4 col-xs-6\">\n");
      out.write("                    <a class=\"site-title\"><span>HDB</span>Staff</a>\n");
      out.write("                 <!--   <p>We're a digital agency focused on creative and results-driven solutions.</p>\n");
      out.write("                    <p>We measure our success by the results we drive for our clients.</p>\n");
      out.write("                -->\n");
      out.write("                 </div>\n");
      out.write("\t\t<!--<div class=\"col-md-3 grid_3\">\n");
      out.write("\t\t\t<h4>Twitter Widget</h4>\n");
      out.write("\t\t\t<div class=\"footer-list\">\n");
      out.write("\t\t\t  <ul>\n");
      out.write("\t\t\t\t<li><i class=\"fa fa-twitter tw1\"> </i><p><span class=\"yellow\"><a href=\"#\">consectetuer</a></span> adipiscing elit web design</p></li>\n");
      out.write("\t\t\t\t<li><i class=\"fa fa-twitter tw1\"> </i><p><span class=\"yellow\"><a href=\"#\">consectetuer</a></span> adipiscing elit web design</p></li>\n");
      out.write("\t\t\t\t<li><i class=\"fa fa-twitter tw1\"> </i><p><span class=\"yellow\"><a href=\"#\">consectetuer</a></span> adipiscing elit web design</p></li>\n");
      out.write("\t\t\t  </ul>\n");
      out.write("\t\t\t</div> -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--<div class=\"col-md-3 grid_3\">\n");
      out.write("\t\t\t<h4>Seeking</h4>\n");
      out.write("\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. </p>\n");
      out.write("\t\t</div> -->\n");
      out.write("\t\t<div class=\"col-lg-offset-4 col-md-3 col-sm-4 col-md-offset-2 col-sm-offset-0 col-xs-6 \">\n");
      out.write("                    <h3>Keep in touch</h3>\n");
      out.write("                    <ul class=\"list-unstyled contact-links\">\n");
      out.write("                        <li><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:info@hdbstaff.com\">info@hdbstaff.com</a></li>\n");
      out.write("                        <li><i class=\"fa fa-phone\" aria-hidden=\"true\"></i><a href=\"tel:8120552433\">8120552433 </a></li>\n");
      out.write("                        <li><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i><p>India</p></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 grid_3\">\n");
      out.write("\t\t\t<h4>Sign up for our newsletter</h4>\n");
      out.write("\t\t\t<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam.</p>\n");
      out.write("\t\t\t<form>\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Enter your email\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn red\">Subscribe now!</button>\n");
      out.write("\t\t    </form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  \t  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\t");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-08-08 03:19:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class level3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"./assets/style.css\" /> \r\n");
      out.write("\t\t<title>String Mania</title>\r\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<form action=\"/jspservlet-app-stringmania/level3\"  method=\"post\">\r\n");
      out.write("\t\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("<h1>LEVEL 3</h1>\r\n");
      out.write("   <div id=\"inc\">\r\n");
      out.write("\t\t<h1>STRINGMANIA</h1>\r\n");
      out.write("\t\t<div id=\"box\">\r\n");
      out.write("\t\t<label id=\"btext\">ENTER A STRING OF YOUR CHOICE</label>\r\n");
      out.write("\t\t<input name=\"input1\" type=\"text\" placeholder=\"ENTER ANY SENTENCE\">\r\n");
      out.write("\t\t<label id=\"btext\">ENTER A STRING OF YOUR CHOICE</label>\r\n");
      out.write("\t\t<input name=\"input2\" type=\"text\" id=\"txt2\" placeholder=\"ENTER ANY SENTENCE\">\r\n");
      out.write("\t\t<label id=\"btext\">Choose an operation you would like to perform on your string</label>\r\n");
      out.write("\t\t<div id=\"choice\">\t\t\r\n");
      out.write("\t\t<div><input type=\"checkbox\" name=\"concatenation\" value=\"concatenate\"><label>CONCATENATE</label></div>\r\n");
      out.write("\t\t<div><input type=\"checkbox\" name=\"split\" value=\"split\"><label>SPLIT</label></div>\r\n");
      out.write("\t\t<div><input type=\"checkbox\" name=\"indexOf\" value=\"indexof\"><label>INDEX OF</label></div>\r\n");
      out.write("\t\t<div></div>\r\n");
      out.write("\t\t<div></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<button name=\"seeanswer\">SEE ANSWER</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h3>");
out.print(request.getAttribute("output")); 
      out.write("</h3>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<button name=\"end\">END</button>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

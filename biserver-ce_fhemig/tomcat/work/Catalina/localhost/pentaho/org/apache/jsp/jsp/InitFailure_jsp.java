package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.pentaho.platform.util.messages.LocaleHelper;
import org.pentaho.platform.engine.core.system.PentahoSystem;
import org.pentaho.platform.web.jsp.messages.Messages;
import java.util.List;

public final class InitFailure_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

/*
 * Copyright 2006 - 2010 Pentaho Corporation.  All rights reserved. 
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * 
 */
	response.setCharacterEncoding(LocaleHelper.getSystemEncoding());
    response.setHeader("Pragma", "no-cache"); // Set standard HTTP/1.0 no-cache header.
    response.setHeader("Cache-Control", "no-store, no-cache, private, must-revalidate, max-stale=0" );
    response.setHeader("Expires", "0");
  	List initializationErrorMessages = PentahoSystem.getInitializationFailureMessages();

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>Error Initializing Pentaho</title>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"white\" dir=\"");
      out.print( LocaleHelper.getTextDirection() );
      out.write("\">\n");
      out.write("\n");
      out.write("  <h2>Pentaho Initialization Exception</h2>\n");
      out.write("  <br />\n");
      out.write("  <div style='border:2px solid #cccccc'>\n");
      out.write("    <table width='100%' border='0'>\n");
      out.write("      <tr><td><b>");
      out.print(Messages.getInstance().getString("InitFailure.USER_ERRORS_DETECTED"));
      out.write("</b></td></tr>\n");

  for (int i=0; i<initializationErrorMessages.size(); i++) {

      out.write("\n");
      out.write("    <tr><td>");
      out.print(initializationErrorMessages.get(i));
      out.write("</td></tr>\n");

  } // end for loop

      out.write("\n");
      out.write("    </table>\n");
      out.write("    <br />\n");
      out.write("      ");
      out.print( Messages.getInstance().getString("InitFailure.USER_SEE_SERVER_CONSOLE") );
      out.write("\n");
      out.write("  </div>\n");
      out.write(" </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

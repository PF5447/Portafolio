package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginError_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href=\"CSS/login_principal.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("         <script type=\"text/javascript\" src=\"JS/md5.js\"></script>\n");
      out.write("        <title>DEJ Movile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>DEJ Movile</h1>\n");
      out.write("        <form  class=\"tabla_login\" action=\"./LoginServlet\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            <fieldset style=\"width:30%\" class=\"field\" >\n");
      out.write("                <legend>Registro</legend>\n");
      out.write("            <table title=\"Registro\" >\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">Rut</td>\n");
      out.write("                    <td><input type=\"text\" name=\"rut\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">Password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"pass\" onkeyup=\"this.form.pass2.value=md5(this.form.pass.value)\"\n");
      out.write("                               value=\"\"/>\n");
      out.write("                    <input type=\"hidden\" name=\"pass2\" size=\"50\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"1\"></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Aceptar\" name=\"btnAceptar\" /></td>\n");
      out.write("                    <td>Usuario o clave incorrectas</td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\"></td>\n");
      out.write("                    <td><a href=\"./Cargar\" onclick=\"CerrarSesion\">Registrarse</a></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("           </fieldset> \n");
      out.write("            </form>\n");
      out.write("        \n");
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

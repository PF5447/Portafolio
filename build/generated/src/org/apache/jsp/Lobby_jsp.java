package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Lobby_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      Modelo.Usuario usuario = null;
      synchronized (session) {
        usuario = (Modelo.Usuario) _jspx_page_context.getAttribute("usuario", PageContext.SESSION_SCOPE);
        if (usuario == null){
          usuario = new Modelo.Usuario();
          _jspx_page_context.setAttribute("usuario", usuario, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("usuario"), request);
      out.write('\n');
      out.write('\n');
      Modelo.Usuario Usuario_get = null;
      synchronized (request) {
        Usuario_get = (Modelo.Usuario) _jspx_page_context.getAttribute("Usuario_get", PageContext.REQUEST_SCOPE);
        if (Usuario_get == null){
          Usuario_get = new Modelo.Usuario();
          _jspx_page_context.setAttribute("Usuario_get", Usuario_get, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usuario_get.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"CSS/login.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h4 class=\"Bienvenida\">Bienvenido(a)\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getApellido_paterno()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getApellido_materno()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("|\n");
      out.write("        <a   href=\"./ServletLogOut\" onclick=\"CerrarSesion\">Cerrar Sesion</a>\n");
      out.write("        </h4>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <hr />\n");
      out.write("        <h1>Dej Movile :: Menu</h1><br>\n");
      out.write("        \n");
      out.write("        <h2>\n");
      out.write("        <a class=\"link_cerrar\" href=\"./Solicitud.jsp\" onclick=\"CerrarSesion\">Solicitar un Plan</a><br>\n");
      out.write("        <a class=\"link_cerrar\" href=\"./ListarSolicitudes.jsp\" onclick=\"CerrarSesion\">Ver mis Planes</a>\n");
      out.write("        </h2>\n");
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

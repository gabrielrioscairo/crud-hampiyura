package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import conexiones.miConexion;

public final class editar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>trabajoExpo</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Lista de Medicamentos</h2>\n");
      out.write("        <table border=\"1\" width=\"100%\">\n");
      out.write("                <thead>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t <td> ID</td>\n");
      out.write("\t\t <td> Nombre</td>\n");
      out.write("\t\t <td> Marca</td>\n");
      out.write("\t\t <td> Sintomas</td>\n");
      out.write("\t\t <td>Stock</td>\n");
      out.write("                 \t\t <td>Descripcion</td>\n");
      out.write("                 \t\t <td>Precio</td>\n");
      out.write("\t\t <td colspan=2>ACCIONES</td>\n");
      out.write("\t\t</tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("       ");
 miConexion consulta=new miConexion();
            ResultSet rs;
            
            rs=consulta.mostrar_todos();
           while(rs.next())
            {
                out.println("<tr>"
                +"<td>"+rs.getInt("idmedic")+"</td>"
                +"<td>"+rs.getString("nombre")+"</td>"
                +"<td>"+rs.getString("marca")+"</td>"
                +"<td>"+rs.getString("sintomas")+"</td>"
                +"<td>"+rs.getInt("stock")+"</td>"
                +"<td>"+rs.getString("descripcion")+"</td>"    
                +"<td>"+rs.getDouble("precio")+"</td>"                
                +"<td>"+"<a href='editar2.jsp?id="+rs.getInt("idmedic")+"'>Editar</a>"+"</td>"
                +"<td>"+"<a href='eliminar?id="+rs.getInt("idmedic")+"'>Eliminar</a>"+"</td>"
                +"</tr>"
                +"</tbody>");
            }   
       
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <br><br>\n");
      out.write("        <input type=\"button\" value=\"Volver\" onclick=\"location.href='index.jsp'\">\n");
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

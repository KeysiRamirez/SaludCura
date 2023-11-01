package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sun.org.apache.bcel.internal.generic.Select;
import javax.persistence.criteria.From;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<span style=\"font-family: verdana, geneva, sans-serif;\"><!DOCTYPE html>\n");
      out.write("    <html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("      <meta charset=\"UTF-8\" />\n");
      out.write("      <title>Salud Cura</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        // Conexion a la DB
        Connection con;
        String url="jdbc:mysql://localhost:3306/dispensariomedico?serverTimezone=UTC";
        String Driver="com.mysql.jdbc.Driver";
        String user="root";
        String password="";
        Class.forName(Driver);
        con=DriverManager.getConnection(url, user, password);
        
       
        PreparedStatement ps;
        ResultSet rs;
        ps=con.prepareStatement("Select * From dispensariomedico");
        rs=ps.executeQuery();
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        <nav>\n");
      out.write("              <ul>\n");
      out.write("                <li><a href=\"#\" class=\"logo\">\n");
      out.write("                  <img src=\"/logo.jpg\" alt=\"\">\n");
      out.write("                  <span class=\"nav-item\">Salud Cura</span>\n");
      out.write("                </a></li>\n");
      out.write("                <li><a href=\"index.html\">\n");
      out.write("                  <i class=\"fas fa-home\"></i>\n");
      out.write("                  <span class=\"nav-item\">Home</span>\n");
      out.write("                </a></li>\n");
      out.write("                <li><a href=\"pacientes.html\">\n");
      out.write("                  <i class=\"fas fa-user\"></i>\n");
      out.write("                  <span class=\"nav-item\">Pacientes</span>\n");
      out.write("                </a></li></a>\n");
      out.write("                <li><a href=\"medicamentos.html\">\n");
      out.write("                  <i class=\"fas fa-wallet\"></i>\n");
      out.write("                  <span class=\"nav-item\">Medicamentos</span>\n");
      out.write("                </a></li>\n");
      out.write("                <li><a href=\"medicos.html\">\n");
      out.write("                  <i class=\"fas fa-chart-bar\"></i>\n");
      out.write("                  <span class=\"nav-item\">Medicos</span>\n");
      out.write("                </a></li>\n");
      out.write("                <li><a href=\"visitas.html\">\n");
      out.write("                  <i class=\"fas fa-tasks\"></i>\n");
      out.write("                  <span class=\"nav-item\">Visitas</span>\n");
      out.write("                </a></li>\n");
      out.write("                <li><a href=\"\">\n");
      out.write("                  <i class=\"fas fa-cog\"></i>\n");
      out.write("                  <span class=\"nav-item\">Settings</span>\n");
      out.write("                </a></li>\n");
      out.write("                <li><a href=\"\">\n");
      out.write("                  <i class=\"fas fa-question-circle\"></i>\n");
      out.write("                  <span class=\"nav-item\">Help</span>\n");
      out.write("                </a></li>\n");
      out.write("                <li><a href=\"\" class=\"logout\">\n");
      out.write("                  <i class=\"fas fa-sign-out-alt\"></i>\n");
      out.write("                  <span class=\"nav-item\">Log out</span>\n");
      out.write("                </a></li>\n");
      out.write("              </ul>\n");
      out.write("            </nav>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <section class=\"main\">\n");
      out.write("          <div class=\"main-top\">\n");
      out.write("            <h1>Medicos</h1>\n");
      out.write("            <i class=\"fas fa-user-cog\"></i>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"users\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img src=\"./pic/img1.jpg\">\n");
      out.write("              <h4>Sam David</h4>\n");
      out.write("              <p>Ui designer</p>\n");
      out.write("              <div class=\"per\">\n");
      out.write("                <table>\n");
      out.write("                  <tr>\n");
      out.write("                    <td><span>85%</span></td>\n");
      out.write("                    <td><span>87%</span></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Month</td>\n");
      out.write("                    <td>Year</td>\n");
      out.write("                  </tr>\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("              <button>Profile</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img src=\"./pic/img2.jpg\">\n");
      out.write("              <h4>Balbina kherr</h4>\n");
      out.write("              <p>Progammer</p>\n");
      out.write("              <div class=\"per\">\n");
      out.write("                <table>\n");
      out.write("                  <tr>\n");
      out.write("                    <td><span>82%</span></td>\n");
      out.write("                    <td><span>85%</span></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Month</td>\n");
      out.write("                    <td>Year</td>\n");
      out.write("                  </tr>\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("              <button>Profile</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img src=\"./pic/img3.jpg\">\n");
      out.write("              <h4>Badan John</h4>\n");
      out.write("              <p>tester</p>\n");
      out.write("              <div class=\"per\">\n");
      out.write("                <table>\n");
      out.write("                  <tr>\n");
      out.write("                    <td><span>94%</span></td>\n");
      out.write("                    <td><span>92%</span></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Month</td>\n");
      out.write("                    <td>Year</td>\n");
      out.write("                  </tr>\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("              <button>Profile</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img src=\"./pic/img4.jpg\">\n");
      out.write("              <h4>Salina micheal</h4>\n");
      out.write("              <p>Ui designer</p>\n");
      out.write("              <div class=\"per\">\n");
      out.write("                <table>\n");
      out.write("                  <tr>\n");
      out.write("                    <td><span>85%</span></td>\n");
      out.write("                    <td><span>82%</span></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Month</td>\n");
      out.write("                    <td>Year</td>\n");
      out.write("                  </tr>\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("              <button>Profile</button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("    \n");
      out.write("          <section class=\"attendance\">\n");
      out.write("            <div class=\"attendance-list\">\n");
      out.write("              <h1>Lista de medicos</h1>\n");
      out.write("              <table class=\"table\">\n");
      out.write("                <thead>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Nombre</th>\n");
      out.write("                    <th>Cedula</th>\n");
      out.write("                    <th>Tanda</th>\n");
      out.write("                    <th>Especialidad</th>\n");
      out.write("                    <th>Estado</th>\n");
      out.write("                    <th>Detalles</th>\n");
      out.write("                  </tr>\n");
      out.write("                </thead>\n");
      out.write("                \n");
      out.write("                ");

                
                    while(rs.next()){
                
                
      out.write("\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>");
      out.print( rs.getInt("idMedico"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getString("Nombre"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getInt("Ceduka"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getString("Tanda"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getString("Especialidad"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getBoolean("Estado"));
      out.write("</td>\n");
      out.write("                    <td><button>Editar</button></td>\n");
      out.write("                    <td><button>Eliminar</button></td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  <tr class=\"active\">\n");
      out.write("                    <td>02</td>\n");
      out.write("                    <td>Balbina Kherr</td>\n");
      out.write("                    <td>Coding</td>\n");
      out.write("                    <td>03-24-22</td>\n");
      out.write("                    <td>9:00AM</td>\n");
      out.write("                    <td>4:00PM</td>\n");
      out.write("                    <td><button>View</button></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>03</td>\n");
      out.write("                    <td>Badan John</td>\n");
      out.write("                    <td>testing</td>\n");
      out.write("                    <td>03-24-22</td>\n");
      out.write("                    <td>8:00AM</td>\n");
      out.write("                    <td>3:00PM</td>\n");
      out.write("                    <td><button>View</button></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>04</td>\n");
      out.write("                    <td>Sara David</td>\n");
      out.write("                    <td>Design</td>\n");
      out.write("                    <td>03-24-22</td>\n");
      out.write("                    <td>8:00AM</td>\n");
      out.write("                    <td>3:00PM</td>\n");
      out.write("                    <td><button>View</button></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <!-- <tr >\n");
      out.write("                    <td>05</td>\n");
      out.write("                    <td>Salina</td>\n");
      out.write("                    <td>Coding</td>\n");
      out.write("                    <td>03-24-22</td>\n");
      out.write("                    <td>9:00AM</td>\n");
      out.write("                    <td>4:00PM</td>\n");
      out.write("                    <td><button>View</button></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr >\n");
      out.write("                    <td>06</td>\n");
      out.write("                    <td>Tara Smith</td>\n");
      out.write("                    <td>Testing</td>\n");
      out.write("                    <td>03-24-22</td>\n");
      out.write("                    <td>9:00AM</td>\n");
      out.write("                    <td>4:00PM</td>\n");
      out.write("                    <td><button>View</button></td>\n");
      out.write("                  </tr> -->\n");
      out.write("                </tbody>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("          </section>\n");
      out.write("        </section>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("</span>\n");
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

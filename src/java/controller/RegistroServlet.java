
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Registro;
import modelo.RegistroDAO;


@WebServlet(name = "RegistroServlet", urlPatterns = {"/RegistroServlet"})
public class RegistroServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        RegistroDAO dao = new RegistroDAO();
        Registro u = new Registro();
    int r;
    
        String accion = request.getParameter("registrar");
        
        if(accion.equals("registrar")){
            
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String nombre = request.getParameter("name");
            u.setUsername(username);
            u.setPassword(password);
            u.setName(nombre);
            
            r = dao.Validar(u);
            
            if(r==1) {
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else{
                request.getRequestDispatcher("registro.jsp").forward(request, response);
            }
            
        }
        
    }
        

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}

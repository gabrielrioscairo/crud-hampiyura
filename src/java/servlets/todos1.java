/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import conexiones.miConexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LAB-USR-AQ265-A0805
 */
@WebServlet(name = "todos1", urlPatterns = {"/todos1"})
public class todos1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            miConexion consulta=new miConexion();//Se importa conexiones.miConexion
            ResultSet rs;//
            
            rs=consulta.mostrar_todos();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet todos1</title>");            
            out.println("</head>");
            out.println("<body>");
            while(rs.next())
            {
                out.println("<h4>Id de la medicina: "+rs.getInt("idmedic")+"</h4>");
                out.println("<h4>Nombre de la medicina: "+rs.getString("nombre")+"</h4>");
                out.println("<h4>Marca de la medicina: "+rs.getString("marca")+"</h4>");
                out.println("<h4>Síntoma: "+rs.getString("sintomas")+" </h4>");
                out.println("<h4>Stock: "+rs.getInt("stock")+"</h4>");
                out.println("<h4>descripcion de la medicina: "+rs.getString("descripcion")+" </h4>");
                out.println("<h4>Precio de le medicina: "+rs.getDouble("precio")+"</h4>");
                out.println("<h4>-----------------------------------------\n</h4>");
            }
            out.println("<br><br>");
            out.println("<input type=\"button\" value=\"Volver\" onclick=\"location.href='index.jsp'\">");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(todos1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(todos1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

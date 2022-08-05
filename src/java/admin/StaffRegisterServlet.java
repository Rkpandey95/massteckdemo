/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import DAL.Datahelper;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rk
 */
public class StaffRegisterServlet extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
           try (PrintWriter out = response.getWriter()) {
            
               AddStaff as = new AddStaff();
               as.setStaffname(request.getParameter("staffname"));
               as.setStaffid(request.getParameter("staffid"));
               as.setStaffpass(request.getParameter("staffpass"));
               as.setCitem(request.getParameter("citem"));
               as.setDateofpost(request.getParameter("dateOfposting"));
               as.setDateofclosing(request.getParameter("dateOfclosing"));
               AddStaffJobDAO.save(as);
              response.sendRedirect("admin/staffregister.jsp?m="+"data added successfully");  
     
           /*Datahelper.openConn();
           Datahelper.insert_update_delete("insert into s_register values('"+request.getParameter("staffname")+"','"+request.getParameter("staffid")+"','"+request.getParameter("staffpass")+"','"+request.getParameter("citem")+"','"+request.getParameter("dateofpost")+"','"+request.getParameter("dateofclosing")+"')");
           response.sendRedirect("admin/staffregister.jsp?m="+"data added successfully");
           Datahelper.closeConn(); */
        }
        catch(Exception ex)
        {
            
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
        processRequest(request, response);
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
        processRequest(request, response);
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

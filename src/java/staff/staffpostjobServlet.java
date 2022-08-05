/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;
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
public class staffpostjobServlet extends HttpServlet {

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
            
           int pid =0;
           Datahelper.openConn();
           Datahelper.insert_update_delete("insert into s_job values('"+pid+"','"+request.getParameter("emailid")+"','"+request.getParameter("mobileno")+"','"+request.getParameter("staffid")+"','"+request.getParameter("location")+"','"+request.getParameter("category")+"','"+request.getParameter("description")+"',1)");
           response.sendRedirect("staff/staffpostjob.jsp?m="+"data added successfully");
           pid++;
           Datahelper.closeConn(); 
           
           /*
           PostJobBean pb = new PostJobBean();
           pb.setEmailid(request.getParameter("emailid"));
           pb.setMobileno(request.getParameter("mobileno"));
           pb.setLocation(request.getParameter("location"));
           pb.setCategory(request.getParameter("category"));
           pb.setDescription(request.getParameter("description"));
           PostJobDAO.save(pb);
           response.sendRedirect("staff/staffpostjob.jsp?m="+"data added successfully"); */
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

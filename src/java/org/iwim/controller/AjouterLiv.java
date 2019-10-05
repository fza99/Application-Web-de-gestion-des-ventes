/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iwim.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.iwim.dao.LManager;

/**
 *
 * @author start
 */
@WebServlet(name = "AjouterLiv", urlPatterns = {"/AjouterLiv"})
public class AjouterLiv extends HttpServlet {
    LManager lm;
   
   @Override
    public void init() throws ServletException{
    
        super.init();
        lm=new LManager("ProjetS3");
    
    }

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AjouterLiv</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AjouterLiv at " + request.getContextPath() + "</h1>");
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
        String nom= request.getParameter("nom");
        String prenom=request.getParameter("prenom");
        String tel=request.getParameter("tel");
        String email=request.getParameter("email");
        String addtress=request.getParameter("address");
        String id=request.getParameter("id");
        String username=request.getParameter("username");
        String pass=request.getParameter("pass");
        
        String idaff="";
        
        try {
            lm.AjouterLiv(nom, prenom, addtress, tel, email, username, pass, id, idaff);
        } catch (SQLException ex) {
            Logger.getLogger(AjouterLiv.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        response.sendRedirect("Livs.jsp");

        
        
    }

    

}

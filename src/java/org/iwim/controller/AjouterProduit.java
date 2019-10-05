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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.iwim.dao.PManager;

/**
 *
 * @author start
 */
public class AjouterProduit extends HttpServlet {
    PManager pm;
    @Override
     public void init() throws ServletException{
    
        super.init();
        pm=new PManager("ProjetS3");
    
    }

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AjouterProduit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AjouterProduit at " + request.getContextPath() + "</h1>");
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

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String libelle=request.getParameter("libelle");
        String quantite=request.getParameter("quantite");
        String image=request.getParameter("image");
        String id= request.getParameter("id");
        String prix=request.getParameter("prix");
        
        try {
            org.iwim.entities.Produit p= pm.AjouterProduit( libelle, image,id, prix, quantite);
            
        } catch (SQLException ex) {
            Logger.getLogger(AjouterProduit.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("admin_cata.jsp");
   
    }
}

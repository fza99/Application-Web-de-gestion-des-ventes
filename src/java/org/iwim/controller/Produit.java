/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iwim.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.iwim.dao.PManager;

/**
 *
 * @author start
 */
public class Produit extends HttpServlet {
       
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
            out.println("<title>Servlet Produit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Produit at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        
        String id=(String) request.getParameter("id");
        
        String add = request.getParameter("ajouter");
        String sup = request.getParameter("supprimer");
        
        if(sup!=null)
        {
            
          pm.deleteProduit(id);
            
          response.sendRedirect("admin_cata.jsp");
            
            
        } else {
            
        }
        if(add!=null)
        {
        
            response.sendRedirect("ajouterProduit.jsp");
        }
        
    }

    
}

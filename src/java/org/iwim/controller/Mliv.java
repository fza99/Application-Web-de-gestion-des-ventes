package org.iwim.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/Mliv"})
public class Mliv extends HttpServlet {

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
            out.println("<title>Servlet Mliv</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Mliv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
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
        
        
        String id=(String) request.getParameter("id");
        
        String add = request.getParameter("add");
        String sup = request.getParameter("supprimer");
        
        if(sup!=null)
        {
            
          lm.deleteLiv(id);
            
          response.sendRedirect("Livs.jsp");
            
            
        } else {
            
        }
        if(add!=null)
        {
        
            response.sendRedirect("AjouterLiv.jsp");
        }
        
    }

    

}

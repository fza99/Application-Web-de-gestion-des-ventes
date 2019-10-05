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
import javax.servlet.http.HttpSession;
import org.iwim.dao.LManager;

/**
 *
 * @author start
 */
public class Liv extends HttpServlet {

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
            out.println("<title>Servlet Liv</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Liv at " + request.getContextPath() + "</h1>");
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
        String username, password;
        HttpSession session = request.getSession();
        
        username=request.getParameter("username");
        password=request.getParameter("pass");
        session.setAttribute("username", username);

        
        
       
        
        
        org.iwim.entities.Liv l = lm.Authentificat(username, password);
        if(l!=null)
        {
        
                response.sendRedirect("TableLiv.jsp");
        
        }
        else
        {
        
               response.sendRedirect("error.jsp");
        
        }
    }
    }

   

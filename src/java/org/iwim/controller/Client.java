/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iwim.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.iwim.dao.CManager;

/**
 *
 * @author start
 */
@WebServlet(name = "Client", urlPatterns = {"/Client"})
public class Client extends HttpServlet {
   CManager cm;
   
   @Override
    public void init() throws ServletException{
    
        super.init();
        cm=new CManager("ProjetS3");
    
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Client</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Client at " + request.getContextPath() + "</h1>");
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
        HttpSession Session = request.getSession();
        String username,password;

        username=request.getParameter("username");
        password=request.getParameter("pass");
        Session.setAttribute("username", username);
        Session.setAttribute("Idcmd", password);
        
       
 

        org.iwim.entities.Client c = cm.Authentificat(username, password);
        if(c!=null)
        {
        
                response.sendRedirect("cata.jsp");
        
        }
        else
        {
        
               response.sendRedirect("error.jsp");
        
        }
    }

}

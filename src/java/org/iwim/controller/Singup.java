package org.iwim.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import org.iwim.dao.UManager;
import org.iwim.entities.user;

/**
 *
 * @author start
 */
@WebServlet(name = "Singup", urlPatterns = {"/Singup"})
public class Singup extends HttpServlet {
    
        UManager um;
    
    @Override
    public void init() throws ServletException{
    
        super.init();
        um=new UManager("ProjetS3");
    
    }

   
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
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
       
           String nom= request.getParameter("Nom");
           String prenom=request.getParameter("Prenom");
           String username=request.getParameter("username");
           String pass=request.getParameter("pass");
           String email= request.getParameter("Email");
           
          user u =new user();
            
            try {
                u = um.Singup(nom, username, pass, email, prenom);
            } catch (SQLException ex) {
                Logger.getLogger(Singup.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
          if(u!=null)
        {
        
                response.sendRedirect("index.html");
        
        }
        else
        {
        
               response.sendRedirect("error.jsp");
        
        }
            
            
           
 
    }
}

   
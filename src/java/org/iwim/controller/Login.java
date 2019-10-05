/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iwim.controller;

/**
 *
 * @author start
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.iwim.dao.UManager;
import org.iwim.entities.user;

/**
 *
 * @author start
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
        String username,password;

        username=request.getParameter("username");
        password=request.getParameter("pass");
        
        HttpSession session= request.getSession();
        session.setAttribute("username", username);
        
       
        
        
        user u=um.Authentificat(username, password);
        
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

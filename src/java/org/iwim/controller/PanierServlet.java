
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
import javax.servlet.http.HttpSession;
import org.iwim.dao.Ucmm;
import org.iwim.entities.Commande;



/**
 *
 * @author start
 */
@WebServlet(name = "PanierServlet", urlPatterns = {"/PanierServlet"})
public class PanierServlet extends HttpServlet {

    Ucmm cmm;

    /**
     *
     * @throws ServletException
     */
    @Override
     public void init() throws ServletException{
    
        super.init();
        cmm=new Ucmm("ProjetS3");
    
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
                             
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String  IdArticle= (String) request.getParameter("IdArticle");
        String Statut = "non livrer" ;
        String DateCmd="12-02-2018" ; 
        String Idcmd= (String) session.getAttribute("Idcmd");
        String  username = (String) session.getAttribute("username");
        String add = request.getParameter("add");
        String show = request.getParameter("show");
       
        if(add!=null)
        {
            
            try {
                Commande cm = cmm.Create(Idcmd,DateCmd,username,Statut);
                Commande cc = cmm.Panier(username, DateCmd, IdArticle,Idcmd);
            } catch (SQLException ex) {
                Logger.getLogger(PanierServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            response.sendRedirect("cata.jsp");
        } else {
        }
        if(show!=null)
        {
        
                     response.sendRedirect("panier.jsp");
        }


        
      
		
	
    }
}
    

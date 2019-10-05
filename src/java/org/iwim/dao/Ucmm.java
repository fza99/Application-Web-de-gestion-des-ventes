/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iwim.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.iwim.entities.Commande;

import org.iwim.model.DBInteraction;

/**
 *
 * @author start
 */
public class Ucmm extends DBInteraction{
    
    public Ucmm(String db) {
        super(db);
    }
    
        /**
         * 
         * @param IdCmd
         * @return 
         */
    	public Commande Find(int IdCmd)
	{
		Commande cm= new Commande();
		connect();
	        String sql="select * from utilisateur where IdCmd='"+IdCmd+"'";
		ResultSet rs=Select(sql);
      
		try {
			 if(rs.next())
			{
				cm=new Commande();
                                cm.setNumCmd(rs.getInt(1));
                               
                                
			}
		} catch (SQLException e) {
		}
		disconnect();
		return cm; 
                
	}

    /**
     * @param IdCmd
     * @param DateCmd
     * @param username
     * @param Statut
     * @param IdArticle
     * @return
     * @throws SQLException
     */
        public  Commande Create (String IdCmd,String DateCmd, String username,String Statut ) throws SQLException 
        {       
                Commande cm= new Commande();
                connect();
                String sql = "insert into Commande (idcmd,datecmd,username,statut) values ('"+IdCmd+"','"+DateCmd+"','"+username+"','"+Statut+"')";
                MAJ(sql);
		disconnect();
                return cm; 
        }
        public Commande Panier (String username, String DateCmd, String IdArticle,String IdCmd ) throws SQLException 
        {       
                Commande cm= new Commande();
                connect();
                String sql="insert into panier (username,datecmd,idarticle,idcmd) values ('"+username+"','"+DateCmd+"','"+IdArticle+"','"+IdCmd+"')";
                MAJ(sql);
		disconnect();
                return cm; 
        }
     
    /**
     *
     * @param IdCmd
     * @param Idliv
     */
    public void Affecte(String IdCmd, String Idliv){
                connect();
		String sql=" update livreur set idaff='"+IdCmd+"'where idliv="+Idliv+" ";
		MAJ(sql);
		disconnect();
        }
    /**
     *
     * @param IdCmd
     */
    public void deleteCommande(int IdCmd)
		{
		connect();

                String sql="delete from Commande where Idcmd="+IdCmd+"";
             
		MAJ(sql);
		disconnect();
		}
    
        public void UpdateCommande(int idcmd,  Commande ut)
	{
		connect();
		//String sql="update utiilisateur set   email='"++"', password='"++"', nom='"++"' , prenom='"++"'    where id_user="++" ";
		//MAJ(sql);
		disconnect();		
	}

    
        
  
    
}
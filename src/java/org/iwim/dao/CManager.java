/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iwim.dao;

/**
 *
 * @author start
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.iwim.entities.Client;
import org.iwim.entities.user;
import org.iwim.model.DBInteraction;

 public class CManager extends DBInteraction{
    
    public CManager(String db) {
        super(db);
    }
    
    
    	public Client Authentificat(String username,String pass)
	{
		Client c=null;
		connect();
		String sql="select * from Client where username='"+username+"' and pass='"+pass+"'";
		ResultSet rs=Select(sql);
      
		try {
			 if(rs.next())
			{
				c=new Client();
                                c.setNom(rs.getString(1));
                                c.setIdclient(rs.getInt(2));
                                c.setUsername(rs.getString(3));
                                c.setPass(rs.getString(4));
                                
                                
			}
		} catch (SQLException e) {
		}
		disconnect();
		return c; 
                
	}
        public  void Singup (String nom, String username, String pass, String email, String prenom) throws SQLException{
                connect();
                Connection conn=null;
		String sql ;
                sql = "insert into client (nom,username,pass,email,prenom) values ('"+nom+"','"+username+"','"+pass+"','"+email+"','"+prenom+"')";
                Statement st = conn.createStatement();
                //Statement str = conn.createStatement();
                st.execute(sql);
        }
        
        // Methode 1.
                public ArrayList<Client>  Allutilisateur()
			{
				ArrayList<Client> cs=new ArrayList<>();
                                connect();       
				String sql="select * from client order by id_user";
				ResultSet rs=Select(sql);
				try {
					while(rs.next())
					{
						Client c=new Client();
						c.set(rs.getInt(1));
						c.setEmail(rs.getString(2));
						c.setPass(rs.getString(3));
                                                c.setNom(rs.getString(4));
                                                c.setPrenom(rs.getString(5));
						cs.add(c);
					}
				} catch (SQLException e) {
				}
				
				disconnect();
				
				return cs;
							
			}
    
    // Methode 2.
    
    	public void deleteClient(int idclient)
		{
		connect();
		String sql="delete from client where id_user="+idclient+"";
             
		MAJ(sql);
		disconnect();
		}
  
  
    
        
        
        
        public void UpdateUtilisateur(int us_id,  user ut)
	{
		connect();
		String sql="update utiilisateur set   email='"+ut.getEmail()+"', password='"+ut.getPass()+"', nom='"+ut.getNom()+"' , prenom='"+ut.getPrenom()+"'    where id_user="+us_id+" ";
		MAJ(sql);
		disconnect();		
	}
        
         public  ArrayList<user> findutilisateur(String nom, String prenom)
			{
                            
			ArrayList<user> cs=new ArrayList<>();
			connect();
			String sql="select * from utiilisateur where nom='"+nom+"' and prenom='"+prenom+"'  ";
			ResultSet rs=Select(sql);
			try {
				while(rs.next())
					{
						user c=new user();
						c.setIduser(rs.getInt(1));
						c.setEmail(rs.getString(2));
						//c.getPass(rs.getString(3));
                                                c.setNom(rs.getString(4));
                                                c.setPrenom(rs.getString(5));
						cs.add(c);
					
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			disconnect();
			
			return cs;
			}
    
    
    
}
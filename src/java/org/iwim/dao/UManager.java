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
import org.iwim.entities.user;
import org.iwim.model.DBInteraction;

/**
 *
 * @author start
 */
public class UManager extends DBInteraction{
    
    public UManager(String db) {
        super(db);
    }
    
    
    	public user Authentificat(String username,String pass)
	{
		user u=null;
		connect();
		String sql="select * from utilisateur where username='"+username+"' and pass='"+pass+"'";
		ResultSet rs=Select(sql);
      
		try {
			 if(rs.next())
			{
				u=new user();
                                u.setNom(rs.getString(1));
                                u.setIduser(rs.getInt(2));
                                u.setUsername(rs.getString(3));
                                u.setPass(rs.getString(4));
			}
		} catch (SQLException e) {
		}
		disconnect();
		return u; 
	}

        /**
     *
     * @param nom
     * @param username
     * @param pass
     * @param email
     * @param prenom
     * @return
     * @throws SQLException
     */
        public  user Singup (String nom, String username, String pass, String email, String prenom) throws SQLException 
        {       
                user u=new user();
                connect();
		String sql ;
                sql = "insert into utilisateur (nom,username,pass,email,prenom) values ('"+nom+"','"+username+"','"+pass+"','"+email+"','"+prenom+"')";
                MAJ(sql);
		disconnect();
                return u; 
        }
        
        // Methode 1.
                public ArrayList<user>  Allutilisateur()
			{
				ArrayList<user> cs=new ArrayList<>();
                                connect();       
				String sql="select * from utiilisateur order by id_user";
				ResultSet rs=Select(sql);
				try {
					while(rs.next())
					{
						user c=new user();
						c.setIduser(rs.getInt(1));
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
    
    	public void deleteUtilisateur(int id_us)
		{
		connect();
		String sql="delete from utiilisateur where id_user="+id_us+"";
             
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
    
    


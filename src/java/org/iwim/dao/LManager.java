/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iwim.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.iwim.entities.Liv;
import org.iwim.entities.user;
import org.iwim.model.DBInteraction;

/**
 *
 * @author start**/
 public class   LManager extends DBInteraction{
    
    public LManager(String db) {
        super(db);
    }
    
    
    	public Liv Authentificat(String username,String pass)
	{
		Liv l=null;
		connect();
		String sql="select * from Livreur where username='"+username+"' and pass='"+pass+"'";
		ResultSet rs=Select(sql);
      
		try {
			 if(rs.next())
			{
			        l=new Liv();
                                l.setNom(rs.getString(1));
                                l.setIdliv(rs.getInt(2));
                                l.setUsername(rs.getString(3));
                                l.setPass(rs.getString(4));
               
			}
		} catch (SQLException e) {
		}
		disconnect();
		return l; 
                
	}
        
    /**
     *
     * @param id
     */
    public void deleteLiv (String id)
		{
		connect();
		String sql=" delete from Produit where IdLivreur =('"+id+"')";
		MAJ(sql);
		disconnect();
                
		}
        
     public liv AjouterLiv( String nom,String prenom,String address,String tel, String email,String username,String pass, String IdLiv, String Idaff) throws SQLException{
        
         
                liv l=new liv();
                connect();
		String sql ;
                sql = "insert into produit (Tel,Address,Email,Username,Pass,IdLivreur,Nom,Prenom,IdCmdAff) values ('"+tel+"','"+address+"','"+email+"','"+username+"','"+pass+"','"+IdLiv+"','"+nom+"','"+prenom+"','"+Idaff+"')";
                MAJ(sql);
		disconnect();
                return l; 
    }
        public void UpdateLiv(int id_liv,  Liv l)
	{
		connect();
		String sql="update utiilisateur set   email='"+l.getEmail()+"', password='"+l.getPass()+"', nom='"+l.getNom()+"' , prenom='"+l.getPrenom()+"'    where id_user="+id_liv+" ";
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


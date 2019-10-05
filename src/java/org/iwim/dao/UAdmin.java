/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iwim.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.iwim.entities.Admin;
import org.iwim.entities.user;
import org.iwim.model.DBInteraction;

/**
 *
 * @author start
 */
public class UAdmin extends DBInteraction{
    
    public UAdmin(String db) {
        super(db);
    }
    
    public Admin Authentificat(String username,String pass)
	{
		Admin  a=null;
		connect();
		String sql="select * from Admin where username='"+username+"' and pass='"+pass+"'";
		ResultSet rs=Select(sql);
      
		try {
			 if(rs.next())
			{
				a =new Admin();
                                a.setUsername(rs.getString(3));
                                a.setPass(rs.getString(4));
                                
                                
			}
		} catch (SQLException e) {
		}
		disconnect();
		return a; 
                
	}
    
}

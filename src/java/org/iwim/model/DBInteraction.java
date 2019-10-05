/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iwim.model;

/**
 *
 * @author start
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author start
 */
public class DBInteraction {
    
        Connection conn=null;
	Statement st=null;
	ResultSet rs=null;
	String url=null;
	
	public DBInteraction(String db){
		
			try {
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				url="jdbc:derby://localhost:1527/"+db;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
	public void connect(){
		try {
			conn=DriverManager.getConnection(url, "elamrani","elamrani");
			st=conn.createStatement();
                        Statement st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void disconnect(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ResultSet Select(String sql){
          try {
			rs=st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          return rs;
	}
	public int MAJ(String sql)
	{     
		int nb=0;
			try {
				nb=st.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return nb;
		
	}
	public boolean next()
	{
		  try {
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}

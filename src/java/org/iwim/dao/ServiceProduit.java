
package org.iwim.dao;

import org.iwim.model.DBInteraction;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.jms.Session;
import javax.transaction.Transaction;
import org.iwim.entities.Produit;



public class ServiceProduit extends DBInteraction {
    Transaction tx = null;
    Session session = null;
    Produit produit = null;

    public ServiceProduit(String db) {
        super(db);
    }
    
    
    public ArrayList<Produit> AllProduit()
			{
				ArrayList<Produit> ps=new ArrayList<>();
                                connect();       
				String sql="select * from produit ";
				ResultSet rs=Select(sql);
				try {
					while(rs.next())
					{
						Produit p=new Produit();
						p.setId(rs.getInt(1));
						p.setLibelle(rs.getString(2));
						p.setPhoto(rs.getString(3));
                                                p.setPrix(rs.getDouble(4));
                                                
						ps.add(p);
					}
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
				disconnect();
				
				return ps;
							
			}

    

   
   
}

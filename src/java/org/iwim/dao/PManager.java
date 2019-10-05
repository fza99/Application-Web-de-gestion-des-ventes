/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iwim.dao;

import java.sql.SQLException;
import org.iwim.entities.Produit;
import org.iwim.model.DBInteraction;

/**
 *
 * @author start
 */
public class PManager extends DBInteraction{

    public PManager(String db) {
        super(db);
    }
    
    /**
     *
     * @param id
     */
    public void deleteProduit (String id)
		{
		connect();
		String sql=" delete from Produit where Id=('"+id+"')";
		MAJ(sql);
		disconnect();
                
		}
    
    
    public void deletePanier (String id){
        connect();
        String sql=" delete from panier where idarticle =('"+id+"')";
        MAJ(sql);
        disconnect();
        
    }
    
    /**
     *
     * @param libelle
     * @param Id
     * @param prix
     * @param image
     * @param quantite
     * @return
     * @throws SQLException
     */
    public Produit AjouterProduit( String libelle,String image,String Id, String prix,String quantite) throws SQLException{
        
         
                Produit p=new Produit();
                connect();
		String sql ;
                sql = "insert into produit (Libelle,image,Id,Prix,Quantite) values ('"+libelle+"','"+image+"','"+Id+"','"+prix+"','"+quantite+"')";
                MAJ(sql);
		disconnect();
                return p; 
    }
}

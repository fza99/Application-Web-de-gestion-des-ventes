package org.iwim.entities;


import java.util.ArrayList;
import java.util.List;

public class Panier {
	private List<Produit> produits = new ArrayList<>();
	
	public void add(Produit produit){
		produits.add(produit);
	}
	
	public void remove(Produit produit){
		produits.remove(produit);
	}
	
	public void removeAll(){
		produits.clear();
	}
	
	public int count(){
		return produits.size();
	}
	
	public List<Produit> getArticles(){
		return produits;
	}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iwim.entities;



/**
 *
 * @author start
 */
public class Commande {
    private int idcmd;
    private int idProduit;
    private int idClient;
    private String statut; 
    private String dateCmnd;

    public Commande() {
    }

    public Commande(int idProduit, int idClient, String statut, String dateCmnd) {
        this.idProduit = idProduit;
        this.idClient = idClient;
        this.statut = statut;
        this.dateCmnd = dateCmnd;
    }

    public Commande(int idcmd, int idProduit, int idClient, String statut, String dateCmnd) {
        this.idcmd = idcmd;
        this.idProduit = idProduit;
        this.idClient = idClient;
        this.statut = statut;
        this.dateCmnd = dateCmnd;
    }

    public int getNumCmd() {
        return idcmd;
    }

    public void setNumCmd(int idcmd) {
        this.idcmd = idcmd;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDateCmnd() {
        return dateCmnd;
    }

    public void setDateCmnd(String dateCmnd) {
        this.dateCmnd = dateCmnd;
    }
    
    
    
}

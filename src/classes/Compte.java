/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import dataBase.Connexion;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Compte {
    protected Float solde;
    protected int etat;   
    protected Date dateOuverture;
    protected String code_client;    
    protected String type;
    protected String numCompte;
    protected Connexion db;

    public Connexion getDb() {
        return db;
    }

    public void setDb(Connexion db) {
        this.db = db;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }


    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getCode_client() {
        return code_client;
    }

    public void setCode_client(String code_client) {
        this.code_client = code_client;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }
    
    private void generateNumCompte(){
        if(this.type.equals("Compte Credit")){
            this.numCompte = "CCR00"+(1+this.db.nbreComptesByType(this.type));
        }else if(this.type.equals("Compte Hypothecaire")){
            this.numCompte = "CHT00"+(1+this.db.nbreComptesByType(this.type));
        }else if(this.type.equals("Marge Credit")){
            this.numCompte = "CMC00"+(1+this.db.nbreComptesByType(this.type));
        }else{
            this.numCompte = "CCH00"+(1+this.db.nbreComptesByType(this.type));
        }
    }
    

    /**
     *
     * @param solde
     * @param etat
     * @param code_client
     * @param type
     * @param dateOuverture
     */
    public Compte(Float solde, int etat, String code_client,String type, Date dateOuverture) {
        this.solde = solde;
        this.etat = etat;
        this.type = type;
        this.dateOuverture = dateOuverture;
        this.code_client = code_client;
        
        try {
            this.db = new Connexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Compte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.generateNumCompte();
    }

    
    public Float getSolde() {
        return solde;
    }

    public void setSolde(Float solde) {
        this.solde = solde;
    }

}

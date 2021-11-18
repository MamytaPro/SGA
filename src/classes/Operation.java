/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Operation {
    private Float montant;
    private TypeOp type;
    private Date dateOp;

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public TypeOp getType() {
        return type;
    }

    public void setType(TypeOp type) {
        this.type = type;
    }

    public Date getDateOp() {
        return dateOp;
    }

    public void setDateOp(Date dateOp) {
        this.dateOp = dateOp;
    }

    public Operation(Float montant, TypeOp type, Date dateOp) {
        this.montant = montant;
        this.type = type;
        this.dateOp = dateOp;
    }
            
    public static enum TypeOp{
        Depot, Retrait, Transfert,PaiementFacture
    }
    
    public void depotArgent(Float montant){
        
    }
    
     public int retrait(int somme) {
        montant = montant-somme;
        return somme;
    }
    
}
    
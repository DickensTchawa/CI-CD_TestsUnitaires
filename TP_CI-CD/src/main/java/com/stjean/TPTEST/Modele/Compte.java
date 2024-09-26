package com.stjean.TPTEST.Modele;

import java.util.Date;

public class Compte {
    private String id;
    private String numeroCompte;
    private String typeCompte;
    private double solde;
    private Date dateCreation;
    private String idUtilisateur;

    public Compte(String id, String numeroCompte, String typeCompte, double solde, String idUtilisateur) {
        this.id = id;
        this.numeroCompte = numeroCompte;
        this.typeCompte = typeCompte;
        this.solde = solde;
        this.dateCreation = new Date();
        this.idUtilisateur = idUtilisateur;
    }

    public void crediter(double montant) {
        solde += montant;
    }

    public void debiter(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant pour effectuer cette opération.");
        }
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}

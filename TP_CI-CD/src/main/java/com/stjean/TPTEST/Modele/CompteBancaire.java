package com.stjean.TPTEST.Modele;

public class CompteBancaire {
    private String numeroCompte;
    private double solde;

    public CompteBancaire(String numeroCompte, double soldeInitial) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
    }

    // Méthode pour déposer de l'argent
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            throw new IllegalArgumentException("Le montant doit être positif");
        }
    }

    // Méthode pour retirer de l'argent
    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant pour effectuer ce retrait.");
        }
        solde -= montant;
    }

    // Méthode pour obtenir le solde
    public double getSolde() {
        return solde;
    }

    // Méthode pour obtenir le numéro de compte
    public String getNumeroCompte() {
        return numeroCompte;
    }
}

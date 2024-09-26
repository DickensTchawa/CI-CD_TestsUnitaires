package com.stjean.TPTEST.Modele;

import java.util.Date;

public class Operation {
    private String id;
    private String type; // "DEBIT" ou "CREDIT"
    private double montant;
    private Date dateOperation;
    private String numeroCompte;

    public Operation(String id, String type, double montant, String numeroCompte) {
        this.id = id;
        this.type = type;
        this.montant = montant;
        this.dateOperation = new Date();
        this.numeroCompte = numeroCompte;
    }
}

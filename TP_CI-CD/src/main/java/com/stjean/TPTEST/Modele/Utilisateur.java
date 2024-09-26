package com.stjean.TPTEST.Modele;

import java.time.LocalDate;
import java.time.Period;

public class Utilisateur {
    private String idUtilisateur;
    private String nom;
    private int anneeNaissance;
    private String telephone;
    private String adresse;
    private String email;
    private String ville;
    private String pays;
    private String profession;
    private String sexe;
    private String statutSocial;

    public Utilisateur(String idUtilisateur, String nom, int anneeNaissance, String telephone,
                       String adresse, String email, String ville, String pays,
                       String profession, String sexe, String statutSocial) {
        this.idUtilisateur = idUtilisateur;
        this.nom = nom;
        this.anneeNaissance = anneeNaissance;
        this.telephone = telephone;
        this.adresse = adresse;
        setEmail(email);
        this.ville = ville;
        this.pays = pays;
        this.profession = profession;
        this.sexe = sexe;
        this.statutSocial = statutSocial;
    }

    public boolean estAdulte() {
        int age = Period.between(LocalDate.of(anneeNaissance, 1, 1), LocalDate.now()).getYears();
        return age >= 18;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!estEmailValide(email)) {
            throw new IllegalArgumentException("Email invalide");
        }
        this.email = email;
    }

    public static boolean estEmailValide(String email) {
        return email != null && email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");
    }
}

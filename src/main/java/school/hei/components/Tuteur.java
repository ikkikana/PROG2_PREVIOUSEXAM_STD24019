package school.hei.components;

import java.time.LocalDate;

public class Tuteur {

    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private String telephone;
    private String descriptionLien;

    public Tuteur(int id, String nom, String prenom, LocalDate dateNaissance,
                  String email, String telephone, String descriptionLien) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.descriptionLien = descriptionLien;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getDescriptionLien() {
        return descriptionLien;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDescriptionLien(String descriptionLien) {
        this.descriptionLien = descriptionLien;
    }
}

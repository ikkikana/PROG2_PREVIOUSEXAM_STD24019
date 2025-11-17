package school.hei.components;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.time.Instant;

public class Etudiant {

    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private String telephone;
    private String groupe;
    private String tuteur;

    private Map<Examen, Note> notes = new HashMap<>();

    public Etudiant(int id, String nom, String prenom, LocalDate dateNaissance,
                    String email, String telephone, String groupe, String tuteur) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.groupe = groupe;
        this.tuteur = tuteur;
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
    public String getGroupe() {
        return groupe;
    }
    public String getTuteur() {
        return tuteur;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }
    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }

    public void addNote(Examen exam, Note note) {
        notes.put(exam, note);
    }

    public double getExamGrade(Examen exam, Instant t) {
        Note note = notes.get(exam);
        if (note == null) return 0;
        return note.getValeurInitiale();
    }
    public double getCourseGrade(Cours cours, Instant t) {
        double total = 0;
        int coeffSum = 0;

        for (Examen exam : notes.keySet()) {
            if (exam.getCours().equals(cours)) {
                int coeff = exam.getCoefficient();
                double grade = getExamGrade(exam, t);
                total += grade * coeff;
                coeffSum += coeff;
            }
        }

        return coeffSum == 0 ? 0 : total / coeffSum;
    }

}

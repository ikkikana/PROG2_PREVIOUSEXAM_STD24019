package school.hei.components;

import java.util.List;

public class Promotion {

    private int id;
    private String nom;
    private List<String> groupes;

    public Promotion(int id, String nom, List<String> groupes) {
        this.id = id;
        this.nom = nom;
        this.groupes = groupes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<String> getGroupes() {
        return groupes;
    }

    public void setGroupes(List<String> groupes) {
        this.groupes = groupes;
    }
}

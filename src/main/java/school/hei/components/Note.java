package school.hei.components;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Note {

    private double valeurInitiale;
    private List<String> historique;

    public Note() {
        this.historique = new ArrayList<>();
    }

    public double getValeurInitiale() {
        return valeurInitiale;
    }

    public void setValeurInitiale(double valeurInitiale) {
        this.valeurInitiale = valeurInitiale;
    }

    public List<String> getHistorique() {
        return historique;
    }

    public void ajouterHistorique(String entree) {
        historique.add(Instant.now() + " : " + entree);
    }
}

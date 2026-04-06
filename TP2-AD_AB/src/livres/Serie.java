package livres;

import java.util.ArrayList;
import java.util.List;

public class Serie {

    private String nom;
    private List<Ouvrage> ouvrages;

    public Serie(String nom) {
        this.nom = nom;
        this.ouvrages = new ArrayList<>();
    }

    public void ajouterOuvrage(Ouvrage o) {
        if (o != null) {
            ouvrages.add(o);
        }
    }

    public void enleverOuvrage(Ouvrage o) {
        ouvrages.remove(o);
    }

    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Serie: " + nom + " (" + ouvrages.size() + " ouvrages)";
    }
}
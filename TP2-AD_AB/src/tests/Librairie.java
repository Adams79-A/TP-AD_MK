package tests;

import livres.*;

import java.util.ArrayList;
import java.util.List;

public class Librairie {

    private List<Auteur> auteurs = new ArrayList<>();
    private List<Ouvrage> ouvrages = new ArrayList<>();

    public Librairie() {

        Pays canada = new Pays("Canada", "CAN");
        Pays usa = new Pays("USA", "USA");
        Pays suisse = new Pays("Suisse", "CHE");

        Auteur albertine = new Auteur("Albertine", "Tremblay", canada);
        Auteur john = new Auteur("John", "Smith", usa);
        Auteur jean = new Auteur("Jean", "Némarre", suisse);

        auteurs.add(albertine);
        auteurs.add(john);
        auteurs.add(jean);

        // 🔥 NOUVEAU : utilisation des sous-classes

        ouvrages.add(new OuvragePapier("Titre 1", john, 300));
        ouvrages.add(new OuvragePapier("Titre 2", albertine, 250));
        ouvrages.add(new OuvragePapier("Titre 3", john, 200));

        ouvrages.add(new OuvrageAudio("Titre 4", john, 120, OuvrageAudio.FormatAudio.NUMERIQUE));
        ouvrages.add(new OuvrageAudio("Titre 5", albertine, 90, OuvrageAudio.FormatAudio.ANALOGIQUE));

        ouvrages.add(new OuvrageVideo("Titre 6", jean, 110, 1500));
        ouvrages.add(new OuvrageVideo("Titre 7", john, 95, 2000));
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public List<Ouvrage> trouverOuvrages(Auteur auteur) {

        List<Ouvrage> trouves = new ArrayList<>();

        for (Ouvrage ouvrage : ouvrages) {
            if (ouvrage.getAuteur().equals(auteur)) {
                trouves.add(ouvrage);
            }
        }
        return trouves;
    }
}

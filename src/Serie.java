import java.util.ArrayList;
import java.util.List;


    public class Serie {
        private String nom;
        private List<String> ouvrages;

        // Constructeur
        public Serie(String nom) {
            this.nom = nom;
            this.ouvrages = new ArrayList<>(); // liste initialement vide
        }

        // Méthode pour ajouter un ouvrage
        public void ajouterOuvrage(String ouvrage) {
            ouvrages.add(ouvrage);
        }

        // Getters
        public String getNom() {
            return nom;
        }

        public List<String> getOuvrages() {
            return ouvrages;
        }

        // Affichage
        @Override
        public String toString() {
            return "Serie: " + nom + ", nombre d'ouvrages: " + ouvrages.size();
        }
    }

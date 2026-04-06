package livres;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Ouvrage {

    public static final String TITRE_INCONNU = "Titre Inconnu";
    public static final int NOMBRE_EXEMPLAIRE_DEFAUT = 0;
    public static final int LONGUEUR_TITRE_MIN = 3;

    private String titre = TITRE_INCONNU;
    private Auteur auteur;
    private LocalDate date;
    private int nombreExemplaires = NOMBRE_EXEMPLAIRE_DEFAUT;

    public Ouvrage(String titre, Auteur auteur, LocalDate date, int nombreExemplaires) {
        setTitre(titre);
        setAuteur(auteur);
        setDate(date);
        setNombreExemplaires(nombreExemplaires);
    }

    public String getTitre() {
        return titre;
    }

    protected void setTitre(String titre) {
        if (titre != null && titre.length() >= LONGUEUR_TITRE_MIN) {
            this.titre = titre;
        }
    }

    public Auteur getAuteur() {
        return auteur;
    }

    protected void setAuteur(Auteur auteur) {
        if (auteur != null) {
            this.auteur = auteur;
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNombreExemplaires() {
        return nombreExemplaires;
    }

    protected void setNombreExemplaires(int nombreExemplaires) {
        if (nombreExemplaires >= 0) {
            this.nombreExemplaires = nombreExemplaires;
        }
    }

    public void acheter(int nombre) {
        if (nombre > 0) {
            nombreExemplaires += nombre;
        }
    }

    public boolean vendre(int nombre) {
        if (nombre > 0 && nombreExemplaires >= nombre) {
            nombreExemplaires -= nombre;
            return true;
        }
        return false;
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        String dateStr = (date != null) ? date.toString() : "Non disponible";
        return "[" + getDescription() + "] " + titre +
                " (" + auteur.getNom() + ")" +
                " - disponible le " + dateStr +
                " (" + nombreExemplaires + " ex.)";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ouvrage)) return false;
        Ouvrage other = (Ouvrage) o;
        return Objects.equals(titre, other.titre)
                && Objects.equals(auteur, other.auteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, auteur);
    }
}

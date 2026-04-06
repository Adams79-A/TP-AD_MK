package livres;

public class OuvrageVideo extends Ouvrage {

    private int dureeMinutes;
    private int tailleMb;

    public OuvrageVideo(String titre, Auteur auteur, int dureeMinutes, int tailleMb) {
        super(titre, auteur, null, 0);
        this.dureeMinutes = dureeMinutes;
        this.tailleMb = tailleMb;
    }

    @Override
    public String getDescription() {
        return "Video";
    }

    @Override
    public String toString() {
        return super.toString() + " - " + dureeMinutes + " min - " + tailleMb + " MB";
    }
}

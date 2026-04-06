package livres;

public class OuvrageAudio extends Ouvrage {

    public enum FormatAudio {
        NUMERIQUE, ANALOGIQUE
    }

    private int dureeMinutes;
    private FormatAudio format;

    public OuvrageAudio(String titre, Auteur auteur, int dureeMinutes, FormatAudio format) {
        super(titre, auteur, null, 0);
        this.dureeMinutes = dureeMinutes;
        this.format = format;
    }

    @Override
    public String getDescription() {
        return "Audio";
    }

    @Override
    public String toString() {
        return super.toString() + " - " + dureeMinutes + " min - " + format;
    }
}

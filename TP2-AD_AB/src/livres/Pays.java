package livres;

public class Pays {
    private String nom;
    private String code;

    public Pays(String nom, String code) {
        if (code == null || !code.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Code invalide");
        }
        this.nom = nom;
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public String getCode() {
        return code;
    }

    public String toString() {
        return nom + " (" + code + ")";
    }
}
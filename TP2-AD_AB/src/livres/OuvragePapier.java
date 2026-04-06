
    package livres;

    public class OuvragePapier extends Ouvrage {

        private int nombrePages;

        public OuvragePapier(String titre, Auteur auteur, int nombrePages) {
            super(titre, auteur, null, 0);
            this.nombrePages = nombrePages;
        }

        public int getNombrePages() {
            return nombrePages;
        }

        @Override
        public String getDescription() {
            return "Papier";
        }

        @Override
        public String toString() {
            return super.toString() + " - " + nombrePages + " pages";
        }
    }


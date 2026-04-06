package tests;


import java.util.List;

import livres.*;

/**
 * CoursPOO 1
 *
 * @author Julien.Brunet màj Jocelyn
 * @since H25
 */
public class TestOuvrage {

    public static void main(String[] args) {
        TestOuvrage test = new TestOuvrage();
        test.testTrouver();



        System.out.println("\n=== TEST AUTEUR + PAYS ===");

        Pays france = new Pays("France", "FRA");


        Auteur auteur = new Auteur("Victor", "Hugo", france);

        System.out.println(auteur);

        System.out.println("\n=== TEST SERIE ===");

        Serie serie = new Serie("Classiques");


        OuvragePapier livre1 = new OuvragePapier("Harry Potter", auteur, 300);
        OuvrageAudio audio1 = new OuvrageAudio("Musique", auteur, 120, OuvrageAudio.FormatAudio.NUMERIQUE);
        OuvrageVideo video1 = new OuvrageVideo("Film", auteur, 90, 1500);

        System.out.println(livre1);
        System.out.println(audio1);
        System.out.println(video1);




        System.out.println("Nombre : " + serie.getOuvrages().size());



    }

    Pays canada = new Pays("Canada", "CAN");
    Pays usa = new Pays("Etats-Unis", "USA");
    Pays france = new Pays("France", "FRA");






    private void testTrouver() {
        Librairie bibliotheque = new Librairie();
        Auteur john = bibliotheque.getAuteurs().get(1);

        System.out.println("\n-----Test de votre méthode trouverOuvrage-----------");
        List<Ouvrage> resultat = bibliotheque.trouverOuvrages(new Auteur("Albertine", "Tremblay", "Canada"));
        System.out.println("Livres de albertine: " + resultat);

        resultat = bibliotheque.trouverOuvrages(john);
        System.out.println("Livres de john: " + resultat);

        resultat = bibliotheque.trouverOuvrages(new Auteur("Jacques", "Beaulieu", "France"));
        System.out.println("Livres de Main: " + resultat);
    }


}


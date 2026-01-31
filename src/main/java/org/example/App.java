package org.example;

/**
 * Hello world!
 */
import fr2.cours.info.tp.ferroviaire.cartographie.models.Gare;

public class App {
    public static void main(String[] args) {

        Gare gare = new Gare(
                "GARE-001",
                "Le Mans",
                3,
                1
        );

        System.out.println(gare.getNom());
    }
}

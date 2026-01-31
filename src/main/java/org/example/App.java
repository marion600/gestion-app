package org.example;

import fr2.cours.info.tp.ferroviaire.cartographie.models.Gare;

public class App {
    public static void main(String[] args) {

        Gare gare = new Gare(
                "G1",
                "Gare Centrale",
                2,
                101
        );

        System.out.println(gare.getNom());
    }
}

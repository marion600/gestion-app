package org.example;

/**
 * Hello world!
 */
import fr2.cours.info.tp.ferroviaire.cartographie.models.Gare;

public class App {
    public static void main(String[] args) {
// Création d'une gare
        Gare gareB = new Gare();
        gareB.setNom("Gare B");
        gareB.setNombreQuais(1);

        System.out.println("Gare créée : " + gareB.getNom());
        System.out.println("Nombre de quais : " + gareB.getNombreQuais());

        // Les chemins de fer / voies seront ajoutés plus tard
        // quand tu auras créé les classes correspondantes
    }
}

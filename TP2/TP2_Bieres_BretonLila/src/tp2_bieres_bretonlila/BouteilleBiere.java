/*Lila Breton
* TDC
* TP2 Exercice 1
* 11/16 Octobre 2024
 */
package tp2_bieres_bretonlila;

/**
 *
 * @author lilab
 */
public class BouteilleBiere {
    String nom ;
    String brasserie;
    double degreAlcool;
    boolean ouverte ;
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) ");
        System.out.println("Brasserie : " + brasserie ) ;
    }
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

}

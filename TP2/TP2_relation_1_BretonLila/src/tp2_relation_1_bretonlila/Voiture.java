package tp2_relation_1_bretonlila;

/*Lila Breton
* TDC
* TP2 Exercice 4
* 2 Novembre 2024
 */

/**
 *
 * @author lilab
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
   
    // Constructeur pour initialiser nom et prenom
    public Voiture(String Modele,String Marque,int PuissanceCV) {
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        this.proprietaire = null;
    }
   
    @Override
    public String toString () {
        return "Modele : " +Modele+" Marque:"+Marque+" PuissanceCV:"+PuissanceCV;
    }
}

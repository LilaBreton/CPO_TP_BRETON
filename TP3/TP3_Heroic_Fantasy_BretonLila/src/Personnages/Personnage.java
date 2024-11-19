/*Lila Breton
* TDC
* TP3 Exercice 1
* 13 Novembre 2024
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author lilab
 */
public abstract class Personnage {
    private String Nom;
    private int NivVie;
    private ArrayList<Arme> TtArmes;
    private Arme Arme_en_Main;

    public Personnage(String Nom, int NivVie) {
        this.Nom = Nom;
        this.NivVie = NivVie;
        this.TtArmes = new ArrayList<>();
        this.Arme_en_Main = null
    }
    
    public String getNom() {
        return Nom;
    }

    public int getNivVie() {
        return NivVie;
    }
    
    public void ajouterArme(Arme arme) {
        if (TtArmes.size() < 5) {
            TtArmes.add(arme);
        } else {
            System.out.println("Le personnage ne peut pas posseder plus de 5 armes");
        }
    }
    
    public Arme getArmeEnMain() {
        return Arme_en_Main;
    }
    
    public void equiperArme(String nomArme) {
        for (Arme arme : TtArmes) {
            if (arme.getNom().equals(nomArme)) {
                Arme_en_Main = arme;
                System.out.println("L arme " + nomArme + " a ete equipee");
                return;
            }
        }
        System.out.println("L arme " + nomArme + " n a pas ete trouvee dans les armes");
    }
    
    @Override
    public String toString(){
        return "Le nom du personnage est : " + Nom + ", son niveau de vie est : " + NivVie + " et son arme en main est : " + (Arme_en_Main != null ? Arme_en_Main : "aucune");     
    }
}
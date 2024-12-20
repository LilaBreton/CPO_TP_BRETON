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
    private static int NbPersonnages = 0;

    public Personnage(String Nom, int NivVie) {
        this.Nom = Nom;
        this.NivVie = NivVie;
        this.TtArmes = new ArrayList<>();
        this.Arme_en_Main = null;
        NbPersonnages++;
    }
    
    public String getNom() {
        return Nom;
    }

    public int getNivVie() {
        return NivVie;
    }
    
    public ArrayList getTtArmes() {
        return TtArmes;
    }
    
    public void ajouterArme(Arme arme) {
        if (TtArmes.size() < 5) {
            TtArmes.add(arme);
        } 
        else {
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
    
    public static int getNbPersonnages() {
        return NbPersonnages;
    }
    
    public void finalize(){
        NbPersonnages--;
        System.out.println("Nombre de personnages restants en jeu : " + NbPersonnages);
    }
    
    @Override
    public String toString(){
        //return "Le nom du personnage est : " + Nom + ", son niveau de vie est : " + NivVie + " et son arme en main est : " + (Arme_en_Main != null ? Arme_en_Main : "aucune");     

        StringBuilder sb = new StringBuilder();
        sb.append("Nom : ").append(Nom)
            .append(", Niveau de vie : ").append(NivVie)
            .append(", Arme en main : ").append(Arme_en_Main != null ? Arme_en_Main : "aucune")
            .append(", Stock d'armes : [");
        for (Arme arme : TtArmes) {
            sb.append(arme.getNom()).append(", ");
        }
        if (!TtArmes.isEmpty()) {
            sb.setLength(sb.length() - 2); // Enlève la dernière virgule
        }
        sb.append("]");
        return sb.toString();
    }
}
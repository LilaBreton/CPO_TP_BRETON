/*Lila Breton
* TDC
* TP3 Exercice 1
* 13 Novembre 2024
 */
package tp3_heroic_fantasy_bretonlila;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author lilab
 */
public class TP3_Heroic_Fantasy_BretonLila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Exc = new Epee("Excalibur",7,5);
        Epee Dur = new Epee("Durandal",4,7);
        Baton Che = new Baton("Chene", 4, 5);
        Baton Cha = new Baton("Charme", 5, 6);
        
        System.out.println(Exc);
        System.out.println(Dur);
        System.out.println(Che);
        System.out.println(Cha);
        
        ArrayList <Arme> Armes = new ArrayList <Arme>();
        Armes.add(Exc);
        Armes.add(Dur);
        Armes.add(Che);
        Armes.add(Cha);
        
        for (int i = 0; i<(Armes.size()); i++){
            System.out.println(Armes.get(i));
        }
        
        
        Magicien Gan = new Magicien("Gandalf",65,true);
        Magicien Gar = new Magicien("Garcimore",44,false);
        Guerrier Con = new Guerrier("Conan", 78, false);
        Guerrier Lan = new Guerrier("Lannister", 45, true);
                
        System.out.println(Gan);
        System.out.println(Gar);
        System.out.println(Con);
        System.out.println(Lan);
        
        ArrayList <Personnage> Personnages = new ArrayList <Personnage>();
        Personnages.add(Gan);
        Personnages.add(Gar);
        Personnages.add(Con);
        Personnages.add(Lan);
        
        for (int i = 0; i<(Armes.size()); i++){
            System.out.println(Personnages.get(i));
        }
        
        Baton Mys = new Baton("Mystique", 20, 80);
        Epee Enc = new Epee("Enchantee", 40, 90);
        
        Con.ajouterArme(Che);
        Con.ajouterArme(Exc);
        Con.ajouterArme(Dur);
        Con.equiperArme("Excalibur");
        
        Gan.ajouterArme(Cha);
        Gan.ajouterArme(Mys);
        Gan.ajouterArme(Enc);
        
        System.out.println("Le nombre d'armes preferees de Gandalf est : " + Gan.ArmesPref());

        for (Personnage personnage : Personnages) {
            System.out.println(personnage);
        }
        
        System.out.println("Nombre de personnages en jeu : " + Personnage.getNbPersonnages());
        System.out.println("Nombre de guerriers en jeu : " + Guerrier.getNbGuerriers());
        System.out.println("Nombre de magiciens en jeu : " + Magicien.getNbMagiciens());
        
        Lan.finalize();
        Gar.finalize();
    }
}

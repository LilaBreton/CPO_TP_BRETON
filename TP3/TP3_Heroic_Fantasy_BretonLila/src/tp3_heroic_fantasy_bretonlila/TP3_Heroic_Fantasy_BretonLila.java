/*Lila Breton
* TDC
* TP3 Exercice 1
* 13 Novembre 2024
 */
package tp3_heroic_fantasy_bretonlila;

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
    }

}

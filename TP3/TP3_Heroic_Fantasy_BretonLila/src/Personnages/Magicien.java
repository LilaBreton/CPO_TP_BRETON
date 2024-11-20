/*Lila Breton
* TDC
* TP3 Exercice 1
* 13 Novembre 2024
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;

/**
 *
 * @author lilab
 */
public class Magicien extends Personnage {
    private boolean Confirme;
    
    public Magicien(String Nom, int NivVie, boolean Confirme) {
        super(Nom, NivVie);
        this.Confirme = Confirme;
    }
    
    public void setConfirme(boolean Confirme) {
        this.Confirme = Confirme;
    }
    
    public boolean getConfirme() {
        return Confirme;
    }
    
    public int ArmesPref() {
        int nb = 0;
        for (Object arme : getTtArmes()) {
            if (arme instanceof Baton) { 
                nb++;
            }
        }
        return nb;
    }
}

/*Lila Breton
* TDC
* TP3 Exercice 1
* 13 Novembre 2024
 */
package Personnages;

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
}

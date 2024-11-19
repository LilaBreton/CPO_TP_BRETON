/*Lila Breton
* TDC
* TP3 Exercice 1
* 13 Novembre 2024
 */
package tp3_heroic_fantasy_bretonlila;

/**
 *
 * @author lilab
 */
public class Guerrier extends Personnage {
    private boolean Cheval;
    
    public Guerrier(String Nom, int NivVie, boolean Cheval) {
        super(Nom, NivVie);
        this.Cheval = Cheval;
    }
    
    public void setCheval(boolean Cheval) {
        this.Cheval = Cheval;
    }

    public boolean getCheval() {
        return Cheval;
    }
}

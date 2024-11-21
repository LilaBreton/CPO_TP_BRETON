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
public class Guerrier extends Personnage {
    private boolean Cheval;
    private static int NbGuerriers = 0;

    public Guerrier(String Nom, int NivVie, boolean Cheval) {
        super(Nom, NivVie);
        this.Cheval = Cheval;
        NbGuerriers++;
    }

    public void setCheval(boolean Cheval) {
        this.Cheval = Cheval;
    }

    public boolean getCheval() {
        return Cheval;
    }
    
    public static int getNbGuerriers() {
        return NbGuerriers;
    }
    
    public void finalize(){
        NbGuerriers--;
        System.out.println("Nombre de guerriers restants en jeu : " + NbGuerriers);
    }
}

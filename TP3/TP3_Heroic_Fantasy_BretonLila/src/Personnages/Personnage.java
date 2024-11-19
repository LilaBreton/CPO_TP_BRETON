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
public abstract class Personnage {
    private String Nom;
    private int NivVie;

    public Personnage(String Nom, int NivVie) {
        this.Nom = Nom;
        this.NivVie = NivVie;
    }
    
    public String getNom() {
        return Nom;
    }

    public int getNivVie() {
        return NivVie;
    }
    
    @Override
    public String toString(){
        return "Le nom du personnage est : " + Nom + " et son niveau de vie est : " + NivVie;        
    }
}

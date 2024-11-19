/*Lila Breton
* TDC
* TP3 Exercice 1
* 13 Novembre 2024
 */
package Armes;

/**
 *
 * @author lilab
 */
public abstract class Arme {
    private String Nom;
    private int NivAtt;

    public Arme(String Nom, int NivAtt) {
        this.Nom = Nom;
        this.NivAtt = Math.min (NivAtt, 100);
    }
    
    public String getNom() {
        return Nom;
    }

    public int getNivAtt() {
        return NivAtt;
    }
    
    @Override
    public String toString(){
        return "Le nom de l arme est : " + Nom + " et son niveau d attaque est : " + NivAtt;        
    }
}

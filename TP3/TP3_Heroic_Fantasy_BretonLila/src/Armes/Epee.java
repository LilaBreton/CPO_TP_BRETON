/*Lila Breton
* TDC
* TP3 Exercice 1
* 13 Novembre 2024
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author lilab
 */
public class Epee extends Arme {
    private int Indice;

    public Epee(String Nom, int NivAtt, int Indice) {
        super(Nom, NivAtt);
        this.Indice = Indice;
        this.Indice = Math.min (Indice, 100);
    }

    public int getIndice() {
        return Indice;
    }
}

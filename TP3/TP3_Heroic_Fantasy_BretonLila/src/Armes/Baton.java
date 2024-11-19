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
public class Baton extends Arme {
    private int Age;

    public Baton(String Nom, int NivAtt, int Age) {
        super(Nom, NivAtt);
        this.Age = Age;
        this.Age = Math.min (Age, 100);
    }

    public int getAge() {
        return Age;
    }
}
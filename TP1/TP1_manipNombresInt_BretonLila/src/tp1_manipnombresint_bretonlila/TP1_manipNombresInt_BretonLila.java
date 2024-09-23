/*Lila Breton
* TDC
* TP1 Exercice 1
* 23 Septembre 2024
 */
package tp1_manipnombresint_bretonlila;

import java.util.Scanner;

/**
 *
 * @author lilab
 */
public class TP1_manipNombresInt_BretonLila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nombre1;
        int nombre2;
        
        nombre1 = 0;
        nombre2 = 0;
        
        System.out.println("Veuillez entrer un 1er nombre :");
        nombre1 = sc.nextInt();
        System.out.println("Veuillez entrer un 2eme nombre :");
        nombre2 = sc.nextInt();
        
        System.out.println("Voici la somme des deux nombres : " + (nombre1 + nombre2));
        System.out.println("Voici la difference des deux nombres : " + (nombre1 - nombre2));
        System.out.println("Voici le produit des deux nombres : " + (nombre1 * nombre2));
        System.out.println("Voici le quotient des deux nombres : " + (nombre1 / nombre2));
        System.out.println("Voici le reste de la division euclidienne des deux nombres : " + (nombre1 % nombre2));
    }
    
}

/*Lila Breton
* TDC
* TP1 Exercice 3
* 27 Septembre 2024
 */
package tp1_guessmynumber_bretonlila;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lilab
 */
public class TP1_guessMyNumber_BretonLila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i<=5; i++){
            int n = generateurAleat.nextInt(100);
            System.out.print(n + " ");
        }
        
        int nb = generateurAleat.nextInt(100);
        System.out.println("Veuillez saisir un nombre entre 0 et 100 :");
        int nombre = sc.nextInt();
        int compteur = 0;
        
        while (nombre != nb) {
            if (nb>nombre){
                System.out.println("Trop petit");
                System.out.println("Veuillez saisir un nombre plus grand :");
                nombre = sc.nextInt();
                compteur += 1;
            }
            
            else {
                System.out.println("Trop grand");
                System.out.println("Veuillez saisir un nombre plus petit :");
                nombre = sc.nextInt();
                compteur += 1;
            }
        }
        System.out.println("Vous avez gagne");
        System.out.println("Vous avez effectue " + (compteur+1) + " coups");
    }
}

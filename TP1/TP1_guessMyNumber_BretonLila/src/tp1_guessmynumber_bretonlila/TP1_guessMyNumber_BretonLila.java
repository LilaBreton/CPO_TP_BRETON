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
        
        int nb;
        int nombre;
        int compteur = 0;
        int niveau;
        
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        System.out.println("Veuillez saisir le numero du niveau de difficulté que vous avez choisi :");
        niveau = sc.nextInt();
        
        if (niveau == 1){
            nb = generateurAleat.nextInt(70);
            System.out.println("Veuillez saisir un nombre entre 0 et 70 :");
            nombre = sc.nextInt();
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
        
        else if (niveau == 2){
            nb = generateurAleat.nextInt(100);
            System.out.println("Veuillez saisir un nombre entre 0 et 100 :");
            nombre = sc.nextInt();
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
        
        else if (niveau == 3){
            nb = generateurAleat.nextInt(200);
            System.out.println("Veuillez saisir un nombre entre 0 et 200 :");
            nombre = sc.nextInt();
            while (nombre != nb && compteur<=7) {
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
            if (nb = nombre && compteur<=7) {
                System.out.println("Vous avez gagne");
                System.out.println("Vous avez effectue " + (compteur+1) + " coups");
            }
            else if (nb != nombre && compteur>7){
            System.out.println("Vous avez gagne");
            System.out.println("Vous avez effectue " + (compteur+1) + " coups");
            }
        }
        
        else {
            System.out.println("La saisie est incorrecte, veuillez recommencer.");
        }
        
    }
}

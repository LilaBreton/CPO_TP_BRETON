/*Lila Breton
* TDC
* TP1 Exercice 4
* 27 Septembre 2024
 */
package tp1_stats_bretonlila;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lilab
 */
public class TP1_stats_BretonLila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        int [] tableau = new int[6];
        for (int i = 0; i<6; i++) {
            tableau [i] = 0;
            System.out.print(tableau[i]);
        }
        
        System.out.println(" ");
        
        
        int m;
        System.out.println("Veuillez entrer un nombre :");
        m = sc.nextInt();
        
        int [] tab = new int[m];
        
        for (int i = 0; i<m; i++){
            tab [i] = generateurAleat.nextInt(5);
            System.out.print(tab[i]);
        }
        
        System.out.println(" ");
        
        double nb0 = 0;
        double nb1 = 0;
        double nb2 = 0;
        double nb3 = 0;
        double nb4 = 0;
        double nb5 = 0;
        
        for (int i=0; i<tab.length; i++) {
            if (tab [i]==0) {
                nb0 += 1;
            }
            
            if (tab [i]==1) {
                nb1 += 1;
            }
            
            if (tab [i]==2) {
                nb2 += 1;
            }
            
            if (tab [i]==3) {
                nb3 += 1;
            }
            
            if (tab [i]==4) {
                nb4 += 1;
            }
            
            if (tab [i]==5) {
                nb5 += 1;
            }
        }
        
        System.out.println("On a obtenu :");
        System.out.println((nb0/m)*100 + " % de " + 0);
        System.out.println((nb1/m)*100 + " % de " + 1);
        System.out.println((nb2/m)*100 + " % de " + 2);
        System.out.println((nb3/m)*100 + " % de " + 3);
        System.out.println((nb4/m)*100 + " % de " + 4);
        System.out.println((nb5/m)*100 + " % de " + 5);        
        
    }
}
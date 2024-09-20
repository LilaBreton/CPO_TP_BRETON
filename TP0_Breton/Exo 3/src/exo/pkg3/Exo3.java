/*Lila Breton
* TDC
* TP0 Exercice 3
* 20 Septembre 2024
 */
package exo.pkg3;

/**
 *
 * @author lilab
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:");
        System.out.println("1) Add");
        System.out.println("2) Substract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Modulo");
        
        int operateur; 
        int operande1;
        int operande2;
        int result;
        
        System.out.println("Veuillez entrer un chiffre :");
        operateur = sc.nextInt();
        System.out.println("Veuillez entrer un nombre :");
        operande1 = sc.nextInt();
        System.out.println("Veuillez entrer un nombre :");
        operande2 = sc.nextInt();
        
        if (operateur=1){
            result = operande1 + operande2
        }
        
        if (operateur=2){
            result = operande1 - operande2
        } 
        
        if (operateur=3){
            result = operande1 * operande2
        }
        
        if (operateur=4){
            result = operande1 / operande2
        }
        
        if (operateur=5){
            result = operande1 % operande2
        }
        
        
    }
    
}

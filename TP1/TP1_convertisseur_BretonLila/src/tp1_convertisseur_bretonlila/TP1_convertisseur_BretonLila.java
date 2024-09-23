/*Lila Breton
* TDC
* TP1 Exercice 2
* 23 Septembre 2024
 */
package tp1_convertisseur_bretonlila;

import java.util.Scanner;

/**
 *
 * @author lilab
 */
public class TP1_convertisseur_BretonLila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Initialisation de nombre1
        double nombre;
        nombre = 0;
        
        //Faire saisir un nombre par l'utilisateur
        //System.out.println("Veuillez entrer un nombre :");
        //nombre = sc.nextDouble();
        
        //Affichage du nombre saisi
        //System.out.println("Vous avez saisi : " + nombre);
        
        //Affichage de la conversion en Kelvin
        //System.out.println("Voici la temperature en degre Kelvin : " + (nombre+273.15) + " K");
        
        // Affichage des differentes temperatures :
        //System.out.println(CelciusVersKelvin(nombre));
        //System.out.println(KelvinVersCelcius (nombre));
        //System.out.println(FarenheitVersCelcius(nombre));
        //System.out.println(CelciusVersFarenheit(nombre));
        //System.out.println(KelvinVersFarenheit(nombre));
        //System.out.println(FarenheitVersKelvin(nombre));

        
        System.out.println("Bonjour, saisissez une valeur :");
        nombre= sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        
        int conversion;
        conversion = 0;
        conversion = sc.nextInt();
        
        if (conversion==1){
            System.out.println(nombre + " degre Celsius est egal a " + CelciusVersKelvin(nombre) + " degres Kelvin");
        }
        
        if (conversion==2){
            System.out.println(nombre + " degre Kelvin est egal a " + KelvinVersCelcius(nombre) + " degres Celsius");
        } 
        
        if (conversion==3){
            System.out.println(nombre + " degre Farenheit est egal a " + FarenheitVersCelcius(nombre) + " degres Celsius");
        }
        
        if (conversion==4){
            System.out.println(nombre + " degre Celsius est egal a " + CelciusVersFarenheit(nombre) + " degres Farenheit");
        }
        
        if (conversion==5){
            System.out.println(nombre + " degre Kelvin est egal a " + KelvinVersFarenheit(nombre) + " degres Farenheit");
        }
        
        if (conversion==6){
            System.out.println(nombre + " degre Farenheit est egal a " + FarenheitVersKelvin(nombre) + " degres Kelvin");
        }
        
    }
    
    public static double CelciusVersKelvin (double tCelcius) {
        double tKelvin;
        tKelvin = tCelcius + 273.15;
        return tKelvin;
    }
    
    public static double KelvinVersCelcius (double tKelvin) {
        double tCelcius;
        tCelcius = tKelvin - 273.15;
        return tCelcius;
    }
    
    public static double FarenheitVersCelcius (double tFarenheit) {
        double tCelcius;
        tCelcius = (tFarenheit - 32)/1.8 ;
        return tCelcius;
    }
    
    public static double CelciusVersFarenheit (double tCelcius) {
        double tFarenheit;
        tFarenheit = (tCelcius*1.8) + 32;
        return tFarenheit;
    }
    
    public static double KelvinVersFarenheit (double tKelvin) {
        double tFarenheit;
        tFarenheit = ((tKelvin - 273.15)*1.8) + 32;
        //tFarenheit = CelciusVersFarenheit(KelvinVersCelcius)
        return tFarenheit;
    }
    
    public static double FarenheitVersKelvin (double tFarenheit) {
        double tKelvin;
        tKelvin = ((tFarenheit - 32)/1.8) + 273.15;
        //tKelvin = (FarenheitVersCelcius(CelciusVersKelvin)
        return tKelvin;
    }
    
}
    
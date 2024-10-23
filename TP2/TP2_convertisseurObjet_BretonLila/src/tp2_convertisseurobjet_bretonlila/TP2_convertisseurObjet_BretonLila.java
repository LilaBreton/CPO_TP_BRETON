package tp2_convertisseurobjet_bretonlila;

import java.util.Scanner;

/*Lila Breton
* TDC
* TP2 Exercice 2
* 23 Octobre 2024
 */

/**
 *
 * @author lilab
 */
public class TP2_convertisseurObjet_BretonLila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double temperature;
        System.out.println("Entrez une temperature :");
        temperature = sc.nextDouble();
        
        Convertisseur conversion = new Convertisseur();
        double temp = conversion.CelciusVersKelvin(temperature);
        System.out.println(temperature + " degres Celsius est egal a " + temp + " degres Kelvin");
        System.out.println(conversion);
        
        temp = conversion.KelvinVersCelcius(temperature);
        System.out.println(temperature + " degres Kelvin est egal a " + temp + " degres Celsius");
        System.out.println(conversion);
        
        temp = conversion.FarenheitVersCelcius(temperature);
        System.out.println(temperature + " degres Farenheit est egal a " + temp + " degres Celsius");
        System.out.println(conversion);
        
        temp = conversion.CelciusVersFarenheit(temperature);
        System.out.println(temperature + " degres Celsius est egal a " + temp + " degres Farenheit");
        System.out.println(conversion);
        
        temp = conversion.KelvinVersFarenheit(temperature);
        System.out.println(temperature + " degres Kelvin est egal a " + temp + " degres Farenheit");
        System.out.println(conversion);
        
        temp = conversion.FarenheitVersKelvin(temperature);
        System.out.println(temperature + " degres Farenheit est egal a " + temp + " degres Kelvin");
        System.out.println(conversion);
        
        
        
        System.out.println("Entrez une temperature :");
        temperature = sc.nextDouble();
        
        Convertisseur conversion2 = new Convertisseur();
        temp = conversion2.CelciusVersKelvin(temperature);
        System.out.println(temperature + " degres Celsius est egal a " + temp + " degres Kelvin");
        System.out.println(conversion2);
        
        temp = conversion2.CelciusVersFarenheit(temperature);
        System.out.println(temperature + " degres Celsius est egal a " + temp + " degres Farenheit");
        System.out.println(conversion2);
        
        temp = conversion2.FarenheitVersKelvin(temperature);
        System.out.println(temperature + " degres Farenheit est egal a " + temp + " degres Kelvin");
        System.out.println(conversion2);
        
        
        
        int type;
        type = 0;
        while (type<=6){
            System.out.println("Saisissez le type de conversion que vous souhaitez effectuer :");
            System.out.println("1) De Celcius vers Kelvin");
            System.out.println("2) De Kelvin vers Celcius");
            System.out.println("3) De Farenheit vers Celcius");
            System.out.println("4) De Celcius vers Farenheit");
            System.out.println("5) De Kelvin vers Farenheit");
            System.out.println("6) De Farenheit vers Kelvin");
            System.out.println("Si vous souhaitez arreter la conversion entrez un autre chiffre");
        
            
            type = sc.nextInt();
            System.out.println("Entrez une temperature :");
            temperature = sc.nextDouble();
            Convertisseur conv = new Convertisseur();
            
            if (type==1){
                temp = conv.CelciusVersKelvin(temperature);
                System.out.println(temperature + " degres Celsius est egal a " + temp + " degres Kelvin");
                System.out.println(conv);
            }
        
            if (type==2){
                temp = conv.KelvinVersCelcius(temperature);
                System.out.println(temperature + " degres Kelvin est egal a " + temp + " degres Celsius");
                System.out.println(conv);
            } 
        
            if (type==3){
                temp = conv.FarenheitVersCelcius(temperature);
                System.out.println(temperature + " degres Farenheit est egal a " + temp + " degres Celsius");
                System.out.println(conv);
            }
        
            if (type==4){
                temp = conv.CelciusVersFarenheit(temperature);
                System.out.println(temperature + " degres Celsius est egal a " + temp + " degres Farenheit");
                System.out.println(conv);
            }
        
            if (type==5){
                temp = conv.KelvinVersFarenheit(temperature);
                System.out.println(temperature + " degres Kelvin est egal a " + temp + " degres Farenheit");
                System.out.println(conv);
            }
        
            if (type==6){
                temp = conv.FarenheitVersKelvin(temperature);
                System.out.println(temperature + " degres Farenheit est egal a " + temp + " degres Kelvin");
                System.out.println(conv);
            }
        }  
    }
}

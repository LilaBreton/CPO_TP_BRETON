package tp2_convertisseurobjet_bretonlila;

/*Lila Breton
* TDC
* TP2 Exercice 2
* 23 Octobre 2024
 */

/**
 *
 * @author lilab
 */
public class Convertisseur {
    int nbConversions;
    double temperature;
    double tempfinale;
    
    public void Convertisseur() {
        nbConversions = 0 ;
    }
    
    public double CelciusVersKelvin(double temperature) {
        nbConversions += 1;
        return tempfinale = temperature + 273.15;
    }
    
    public double KelvinVersCelcius (double temperature) {
        nbConversions += 1;
        return tempfinale = temperature - 273.15;
    }
    
    public double FarenheitVersCelcius (double temperature) {
        nbConversions += 1;
        return tempfinale = (temperature - 32)/1.8;
    }
    
    public double CelciusVersFarenheit (double temperature) {
        nbConversions += 1;
        return tempfinale = (temperature*1.8) + 32;
    }
    
    public double KelvinVersFarenheit (double temperature) {
        nbConversions += 1;
        return tempfinale = ((temperature - 273.15)*1.8) + 32;
    }
    
    public double FarenheitVersKelvin (double temperature) {
        nbConversions += 1;
        return tempfinale = ((temperature - 32)/1.8) + 273.15;
    }
    
    @Override
    public String toString () {
        return "nombre de conversions : "+ nbConversions;
    }
}

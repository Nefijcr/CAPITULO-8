/*
 *Crea un método que compruebe si una palabra es un palíndromo 
 */
package Recursividad;
/**
 *
 * @author nefij
 */
public class Ejercicio_12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
    //palabra analizada
    String s="reconocer";
    if(palin(s)) System.out.println("Es un palíndromo");
    else System.out.println("No es un palíndromo");
}
//método que comprueba si una palabra es un palíndromo
//ejemplo: reconocer -> true
public static boolean palin(String frase)
{
    frase=frase.toLowerCase();
    if(frase.length()<=1) return true;
    else
    {
        if(frase.charAt(0)==frase.charAt(frase.length()-1))
        return palin(frase.substring(1, frase.length()-1));
        else return false;
            }
        }    
    }     
    
    


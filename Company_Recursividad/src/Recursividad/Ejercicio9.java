/*
 *Crea un método que imprima por pantalla un Rectángulo a partir de los valores de la base y la altura 
 */
package Recursividad;
/**
 *
 * @author nefij
 */
public class Ejercicio9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
    //imprimir rectángulo: altura, base
    cuad(5,10);
}
//método que imprime un rectángulo
//ejemplo: base = 4 y altura 3
//
// * * * *
// * * * *
// * * * *
//
static void cuad(int altura, int base)
{
    if(altura>0)
    {
        cuad2(base);//método recursivo que crea los elementos de cada línea
        cuad(altura-1, base);//llamada recursiva
    }
}
//crea los elementos de cada línea
static void cuad2(int n)
{
    if(n>0)
    {
        System.out.print("* ");
        cuad2(n-1);
    }
    else
        System.out.println();
        }        
    }     
    
    


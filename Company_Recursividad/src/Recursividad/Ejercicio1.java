/*
 * Crea un método que obtenga la suma de los números naturales desde 1 hasta N. Se debe pasar como parámetro el número N
 */
package Recursividad;
/**
 *
 * @author nefij
 */
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
        //llamada para obtener la suma de 5
    System.out.println(sum(4));
}
//método que devuelve la suma de los elementos desde n hasta 1
//ejemplo: n = 4 -> 4+3+2+1=10
static int sum(int n)
{
    //caso base
    if(n==1)
        return 1;

    //llamada recursiva
    else
        return n+sum(n-1);
}
    }
    


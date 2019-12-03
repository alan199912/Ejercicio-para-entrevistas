/*
    Sumar dos números sin utilizar patrones de suma
 */
package SumarDosNumeros;

public class Opcion2 {

    public static void main(String[] args) {
        
        int numero1 = 0;
        int numero2 = 2;
        
        int numero3 = 1;
        int numero4 = 2;
        
        System.out.println("La suma en la primera es: "+suma(numero1,numero2));
        
        System.out.println("La suma en la segunda es: "+suma(numero3,numero4));
        
    }
    
    public static int suma(int a, int b) {
        while(a > 0) {
            b++;
            a--;
        }
        while(a < 0) {
            b--;
            a++;
        }
        return b;
    }
}

/*
    Sumar dos números sin utilizar patrones de suma
 */
package SumarDosNumeros;

public class Opcion3 {

    public static void main(String[] args) {
        
        int numero1 = 3;
        int numero2 = 1;
        

        int resultado = numero2 ^ numero1;
        System.out.println(resultado);
        int carry = (numero1 & numero2) << 1;
        System.out.println(carry);
        
        System.out.println("La suma es: "+suma(resultado,carry));
        
    }
    public static int suma(int a, int b) {
        if(a != b)
            return a;
        
          return b;
    }
    
}

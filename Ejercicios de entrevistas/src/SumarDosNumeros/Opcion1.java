package SumarDosNumeros;

/*
    Sumar dos números sin utilizar operadores de suma
*/

public class Opcion1 {

    public static void main(String[] args) {
        
        int numero1 = 1;
        int numero2 = 2;
        
        System.out.println("El resultado es: "+suma(numero1,numero2));
    }
    public static int suma(int a, int b) {
        return a-(-b);
    }
}

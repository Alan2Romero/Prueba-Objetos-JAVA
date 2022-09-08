/*

 * Nombre de la clase: Clase de la semana del 22
 * Información de la versión: 
 * Fecha: 4/9/2022
 * Enunciado: Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima el diámetro, 
 * la circunferencia y el área del círculo mediante el uso del valor de punto flotante 3.14159 para π. 
 */
/* Se importa la libreria de java Scanner que permite registrar el input del usuario */
import java.util.Scanner;

public class Ejercicio228 {
    /* Se pone el valor del Scanner en la palabra leer para poder llamar a la libreria en el codigo */
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        /* Declaracion de variables */
        int radio = 0;
        float diametro = 0;
        /* Codigo Principal */
        System.out.println("Ingrese el radio del circulo:");
        radio = leer.nextInt();
        /* Operacion matematica para sacar el diametro */
        diametro = radio * 2;
        System.out.printf("El diametro es: " + diametro +  "\n");
        /* Operacion matematica para sacar la circunferencia */
        /* Se utiliza la libreria Math (Ya importada adentro del lenguaje Java) para utilizar PI y cumplir la formula de la
         * circunferencia */
        System.out.printf("La circunferencia es: " + Math.PI * diametro +  "\n" );
        /* Operacion matematica para sacar el area */
        System.out.printf("El area del circulo es: " + Math.PI * radio +  "\n");
    }
}

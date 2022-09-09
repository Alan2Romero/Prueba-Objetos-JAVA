/*

 * Nombre de la clase: Clase de la semana del 5/9
 * Información de la versión: 
 * Fecha: 8/9/2022
 */
/* Se importa la libreria de java Scanner que permite registrar el input del usuario */
import java.util.Scanner;

class Cuenta{
    // variables de instancia //
    private String nombre;
    private double saldo;

    // Constructor de Cuenta que recibe dos parametros //
    public Cuenta(String nombre, double saldo)
    {
        this.nombre = nombre; // asigna nombre a la variable instancia nombre

        // valida que el saldo sea mayor que 0.0; de lo contrario,
        // la variable instancia saldo mantiene su valor inicial.
        if (saldo > 0.0){
            this.saldo = saldo; // Lo asigna a la variable de instancia saldo
        }
    }
    //Metodo que deposita (suma) solo una cantidad valida al saldo
    public void depositar(double montoDeposito)
    {
        if (montoDeposito > 0.0){ // si el montoDeposito es valido
            saldo += montoDeposito; // suma al saldo
        } 
    }
    // Metodo que retira una cantidad valida al saldo
    public void retirar(double retiro){ 
        if (retiro > 0.0 && saldo > retiro){
            saldo -= retiro;
        }
        else{
            System.out.print("El monto a retirar excede el saldo de la cuenta\n");
        }
    }
    // metodo que devuelve el saldo de la cuenta
    public double obtenerSaldo(){
        return saldo;
    }

    // metodo que establece el nombre
    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

    // metodo que devuelve el nombre
    public String obtenerNombre(){
        return nombre; // devuelve el valor de name a quien lo invoco
    } // fin del metodo obtenerNombre
} // fin de la clase Cuenta

public class Ejercicio311 {
    public static void main(String[] args){
        // Crea dos objetos usando como plantilla el objeto "Cuenta"
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.000);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);
        // Muestra el saldo inicial de cada objeto
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        // Objeto Scanner para leer el ingreso de datos del usuario
        Scanner leer = new Scanner(System.in);
    
        // Depositar plata para la cuenta1
        System.out.print("Escriba el monto a depositar para cuenta1: ");
        double montoDeposito = leer.nextDouble(); // Entrada usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta 1%n%n", montoDeposito);

        // Muestra los saldos
        cuenta1.depositar(montoDeposito);
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        
        // Depositar plata para la cuenta2
        System.out.print("Escriba el monto a depositar para cuenta2: ");
        montoDeposito = leer.nextDouble(); //Entrada usuario
        cuenta2.depositar(montoDeposito); // Suma al saldo de cuenta2

        // Muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        // Retirar saldos
        System.out.print("Escriba el monto a retirar para cuenta1: ");
        double retiro = leer.nextDouble(); //Entrada usuario
        cuenta1.retirar(retiro); // Resta el saldo de cuenta1

        // Muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
    
        // Retirar saldos
        System.out.print("Escriba el monto a retirar para cuenta2: ");
        retiro = leer.nextDouble(); //Entrada usuario
        cuenta2.retirar(retiro); // Resta el saldo de cuenta1

        // Muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
    }
}
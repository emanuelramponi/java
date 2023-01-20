package Ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejString {
    public static void main(String[] args) {
        /*
         * La tarea consiste en crear una nueva clase con el metodo main llamada DetalleDeFactura, 
         * se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner
         * de la siguiente manera:
         * 1. Reciba el nombre de la factura o descripcion, utilizar metodo nextLine() para obtener el nombre
         *    de la factura con espacios
         * 2. Reciba 2 precios de productos de tipo double, utilizar metodo nextDouble() para obtener precios
         *    con decimales
         * 3. Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
         * 
         * Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto),
         * el impuesto y el monto total neto incluyendo impuesto
         * 
         * Por ejemplo algo asi:
         * "La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082, y el
         * monto despues de impuesto es de 160.3882"
         */
        
        double valorDouble1 = 0, valorDouble2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, a continuacion ingrese la descripcion de la factura: ");
        String facturaDescripcion = scanner.nextLine();
        
        System.out.println("Ingrese el valor del primer producto: ");
        try {
           valorDouble1 = scanner.nextDouble(); 
        } catch (InputMismatchException e) {
            System.out.println("Error! Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        System.out.println(valorDouble1);
        
        System.out.println("Ingrese el valor del segundo producto: ");
        try {
           valorDouble2 = scanner.nextDouble(); 
        } catch (InputMismatchException e) {
            System.out.println("Error! Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        System.out.println(valorDouble2);

        scanner.close();

        double total = valorDouble1 + valorDouble2;

        String texto = "La factura " + facturaDescripcion + " tiene un total bruto de " + total + 
        ", con un impuesto de " + total*0.19 + ", y el " +
         "monto despues de impuesto es de " + total*1.19;

         System.out.println(texto);
    }
}

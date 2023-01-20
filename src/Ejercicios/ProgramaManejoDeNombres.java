package Ejercicios;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
    // La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
    // Se requiere desarrollar un programa que reciba 
    // los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
    // Se pide por cada nombre de la persona una nueva variable del tipo String al tomar 
    // el segundo carácter pero convertido en mayúscula y se le concatena un punto y los 
    // dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
    // Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
    // Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
    // N.es_A.ia_E.pe

        String nombre = "";

        StringBuilder sb = new StringBuilder(nombre);

        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el 1º nombre: ");
            nombre = scanner.nextLine();
            nombre = nombre.toUpperCase();

            // String parte1 = nombre.substring(1,2);
            // // String parte2 = nombre.sustring();
            // int lastWord = nombre.length();
            // int indice = lastWord - 2;

            // System.out.println(parte1);
            // sb.append(parte1);
            // System.out.println(sb);

            
         }
        
        scanner.close();
    }
}

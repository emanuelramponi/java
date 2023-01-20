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

        String[] nombres = new String[3];
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < nombres.length; i++) 
        {
            System.out.println("Ingrese el " + (i+1) + "° nombre: ");
            nombres[i] = scanner.nextLine();
        }
        
        for (int i = 0; i < nombres.length; i++)
        {
            sb = (i==2)?
            sb.append(nombres[i].toUpperCase().charAt(1)).append(".").append(nombres[i].substring(nombres[i].length()-2)):
            sb.append(nombres[i].toUpperCase().charAt(1)).append(".").append(nombres[i].substring(nombres[i].length()-2)).append("_");
        }
        System.out.println(sb);
        scanner.close();


        // String test = "";
        // for (int i = 0; i < nombres.length; i++) 
        // {
        //     System.out.println("Ingrese el " + (i+1) + "° nombre: ");
        //     nombres[i] = scanner.nextLine();
        // }
        // String test = "";
        // for (int i = 0; i < nombres.length; i++)
        // {
        //    test= test+ nombres[i].toUpperCase().charAt(1) + "." + nombres[i].substring(nombres[i].length()-2)+"_";
        // }
        // test = test.substring(0,test.length()-1);
        // System.out.println(test);
    }
}

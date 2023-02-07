package Practica.Seccion_12_Arreglos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DetectandoOrden_Clase106 {
    public static void main(String[] args) {
        int[] numeros = new int[7];

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 7 números");

        try{
            for (int i = 0; i < numeros.length ; i++) {
                numeros[i] = sc.nextInt();
            }

        }catch (InputMismatchException e) {
            System.err.println("Ingreso un dato erróneo, debe ingresar un numero entero");
            System.err.println(e);
            System.exit(-2);
        }

        boolean ascendente = false;
        boolean descendente = false;

        for (int i = 0; i < numeros.length-1 ; i++) {

            if (numeros[i] < numeros[i + 1])
            {
               ascendente = true;
            }

            if (numeros[i] > numeros[i + 1])
            {
                descendente = true;
            }

        }

        System.out.println(ascendente);
        System.out.println(descendente);

        if(ascendente && descendente){
            System.out.println("Orden desordenado");
        } else if (ascendente && !descendente) {
            System.out.println("Orden Ascendente");
        }else if(!ascendente && descendente){
            System.out.println("Orden Descendente");
        } else if (!ascendente && !descendente) {
            System.out.println("todos son iguales");
        }



    }
}

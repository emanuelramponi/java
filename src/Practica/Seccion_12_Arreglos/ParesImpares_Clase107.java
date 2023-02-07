package Practica.Seccion_12_Arreglos;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ParesImpares_Clase107 {
    public static void main(String[] args) {
        //copiar impares en un arreglo e impares en otro

        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.println("Ingrese la cantidad de numeros que quiere guardar: ");

        try
        {
            a = sc.nextInt();
        } catch (InputMismatchException e)
        {
        System.err.println("Ingreso un dato erróneo, debe ingresar un numero entero");
        System.err.println(e);
        System.exit(-2);
        }


        int[] arreglo = new int[a];

        System.out.println("\nAhora ingrese " + a + " numeros");
        for (int i = 0; i < arreglo.length; i++) {
            try
            {
                arreglo[i] = sc.nextInt();
            } catch (InputMismatchException e)
            {
                System.err.println("Ingreso un dato erróneo, debe ingresar un numero entero");
                System.err.println(e);
                System.exit(-2);
            }
        }



        int par = 0, impar = 0;

        for (int i = 0; i < arreglo.length ; i++) {
            if (arreglo[i]%2 == 0)
            {
                par++;
            } else {
                impar++;
            }
        }

        int[] arrPar = new int[par];
        int[] arrImpar = new int[impar];

        int j = 0, k = 0;

        for (int i = 0; i < arreglo.length ; i++) {
            if (arreglo[i]%2 == 0)
            {
                arrPar[j++] = arreglo[i];
            } else{
                arrImpar[k++] = arreglo[i];
            }
        }
        System.out.println("\npares: ");
        for(int e: arrPar)
        {
            System.out.print(e + " ");
        }

        System.out.println("\nimpares");
        for(int e: arrImpar)
        {
            System.out.print(e + " ");
        }
    }


}

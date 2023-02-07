package Practica.Seccion_12_Arreglos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NotasAlumnos_Clase108 {
    public static void main(String[] args) {
        //Colegio con tres asignaturas. Para cada asignatura hay 7 alumnos, una nota para cada alumno en su asignatura correspondiente
        //Calcular   1. Promedio General del curso completo
        //            2. Promedio por asgignatura
        //             3. Promedio por alumno
        //              Por ejemplo leer el indicie del alumno y luego obtenemos una nota de las asignaturas y calculamos su promedio

        String asignaturas[] = new String[3];

        Scanner sc = new Scanner(System.in);

        ingresandoAsignaturas:
        for (int i = 0; i < asignaturas.length ; i++) {
            System.out.print("Ingrese la " + (i+1) + "º asignatura: ");
            asignaturas[i] = sc.nextLine();
            if(i==2) {
                System.out.println("\nUsted a ingresado las siguientes materias: ");
                for (String s : asignaturas) {
                    System.out.println(s);
                }
                System.out.println("\n");
                boolean seguir = false;


                int respuesta = 0;

                do {
                    System.out.println("Quiere continuar con estas materias o modificarlas? (s/n)");
                    System.out.println("1- Continuar");
                    System.out.println("2- Modificar las asignaturas");


                    try{
                        respuesta = sc.nextInt();
                    }catch (InputMismatchException e) {
                    System.err.println("Ingreso un dato erróneo, debe ingresar un numero entero");
                    System.err.println(e);
                }

                    if (respuesta==2)
                    {
                        continue ingresandoAsignaturas;
                    }
                    else if (respuesta ==1) break;
                    else
                    {
                        System.err.println("\nHa ingresado una opcion incorrecta, vuelva a responder con una opcion válida\n");
                        seguir = true;
                    } else {
                        seguir = false;
                    }
                } while (seguir);


            }
        }

    }
}

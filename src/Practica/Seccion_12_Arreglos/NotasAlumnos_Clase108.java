package Practica.Seccion_12_Arreglos;

import java.util.Scanner;

public class NotasAlumnos_Clase108 {

    public static String[] ingresandoAsignaturas()
    {
        Scanner sc = new Scanner(System.in);
        String[] asignaturas = new String[3];

        for (int i = 0; i <asignaturas.length ; i++) {
            System.out.print("Ingrese la " + (i+1) + "º asignatura: ");
            asignaturas[i] = sc.nextLine();
        }
        return asignaturas;
    }

    public static String[] ingresandoNombres()
    {
        Scanner scn = new Scanner(System.in);
        String[] alumnos = new String[7];

        for (int i = 0; i <alumnos.length ; i++) {
            System.out.print("Ingrese el " + (i+1) + "º alumno: ");
            alumnos[i] = scn.nextLine();
        }
        return alumnos;
    }

    public static void menu(String[] arreglo)
    {
        System.out.println("Seleccione la informacion a modificar");
        for (int i = 0; i <arreglo.length ; i++) {
            System.out.println((i+1) + ". " + arreglo[i]);
        }
        System.out.println(arreglo.length+1 + ". Todas las anteriores");

    }
    public static String[] modificandoAsignaturas(String[] ignoredAsignaturas)
    {
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);

        menu(ignoredAsignaturas);

        int opcion = sca.nextInt();

        System.out.println("\n");

        if( opcion == 1 || opcion == 2 || opcion == 3)
        {
            ignoredAsignaturas[opcion - 1] = sc.nextLine();
        }else if (opcion==4)
        {
            ignoredAsignaturas = ingresandoAsignaturas();
        }
        return ignoredAsignaturas;
    }

    public static int validacion ()
    {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;

        while (seguir){
            System.out.println("Quiere continuar o modificar la informacion ingresada?");
            System.out.println("1- Continuar");
            System.out.println("2- Modificar");

            respuesta = sc.nextInt();
            System.out.println("\n");
            if(respuesta == 1 || respuesta == 2)
            {
                seguir=false;
            } else
            {
                System.out.println("Ha ingresado una opcion incorrecta, ingrese una válida");
            }

        }
        return respuesta;
    }



    public static void main(String[] args)
    {
        //Colegio con tres asignaturas. Para cada asignatura hay 7 alumnos, una nota para cada alumno en su asignatura correspondiente
        //Calcular   1. Promedio General del curso completo
        //            2. Promedio por asgignatura
        //             3. Promedio por alumno
        //              Por ejemplo leer el indicie del alumno y luego obtenemos una nota de las asignaturas y calculamos su promedio

        String[] asignaturas;
        int respuesta;

        asignaturas = ingresandoAsignaturas();

        respuesta = validacion();

        if(respuesta==2)
        {
            asignaturas = modificandoAsignaturas(asignaturas);
        }

        String[] alumnos = ingresandoNombres();

        respuesta = validacion();

        if(respuesta==2)
        {

        }






    }
}




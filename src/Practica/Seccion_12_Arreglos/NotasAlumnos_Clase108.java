package Practica.Seccion_12_Arreglos;

import java.util.Scanner;

public class NotasAlumnos_Clase108 {


    public static void menuDespliegue(String[] menu)
    {

        System.out.println("============= MENU =============");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.print("Opcion: ");

    }

    public static int menuInteraccion()
    {
        String[] menuPrincipalArray =
                {   "Ingresar nombres de alumnos",
                        "Ingresar asignaturas",
                        "Ingresar notas" ,
                        "Modificar informacion",
                        "Mostrar Informacion",
                        "Salir"
                };
//
        Scanner opMenu = new Scanner(System.in);
        String option = "";
        int optionNumber = 0;

        boolean seguirMenu = true;
        System.out.println(menuPrincipalArray.length);

        while(seguirMenu) {
            menuDespliegue(menuPrincipalArray);
            option = opMenu.nextLine();

            try {
                optionNumber = Integer.parseInt(option);
            }catch (NumberFormatException e)
            {
                System.err.println("Ingrso un formato erroneo, debe ser numero entero");
                System.err.println(e);
            }

            if (optionNumber <= 0 || optionNumber > menuPrincipalArray.length ) {
                System.err.println("\n¡OPCION INEXISTENTE!\n");
            }else{
                seguirMenu=false;
            }
        }
        return optionNumber;
    }
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

    public static void menuOpciones(String[] arreglo)
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

        menuOpciones(ignoredAsignaturas);

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

//    public static int validacion ()
//    {
//        boolean seguir = true;
//        Scanner sc = new Scanner(System.in);
//        int respuesta = 0;
//
//        while (seguir){
//            System.out.println("Quiere continuar o modificar la informacion ingresada?");
//            System.out.println("1- Continuar");
//            System.out.println("2- Modificar");
//
//            respuesta = sc.nextInt();
//            System.out.println("\n");
//            if(respuesta == 1 || respuesta == 2)
//            {
//                seguir=false;
//            } else
//            {
//                System.out.println("Ha ingresado una opcion incorrecta, ingrese una válida");
//            }
//
//        }
//        return respuesta;
//    }


    public static void submenu()
    {
        Scanner scSB = new Scanner(System.in);

        String[] information = {"Asignaturas","Alumnos","Notas"};
        System.out.println("============= MENU =============");
        for (int i = 0; i < ; i++) {
            System.out.println("============= MENU =============");
            for (int i = 0; i < information.length; i++) {
                System.out.println((i+1) + ". " + information[i]);
            }

            System.out.print("Opcion: ");
            int option = scSB.nextInt();

            switch (option){
                case 1:  menuOpciones();break;
                case 2: break;
                case 3: break;
                default: break;
            }


        }
    }


    public static void main(String[] args)
    {
        //Colegio con tres asignaturas. Para cada asignatura hay 7 alumnos, una nota para cada alumno en su asignatura
        // correspondiente
        //Calcular   1. Promedio General del curso completo
        //            2. Promedio por asgignatura
        //             3. Promedio por alumno
        //              Por ejemplo leer el indicie del alumno y luego obtenemos una nota de las asignaturas y
        //              calculamos su promedio

//        String[] asignaturas;
//        int respuesta;
//
//        asignaturas = ingresandoAsignaturas();
//
//        respuesta = validacion();
//
//        if(respuesta==2)
//        {
//            asignaturas = modificandoAsignaturas(asignaturas);
//        }
//
//        String[] alumnos = ingresandoNombres();
//
//        respuesta = validacion();

        String[] informacion = {"Materias","Alumnos","Notas"}:

        int opcionElegida = menuInteraccion();


        switch (opcionElegida){
            case 1: String[] alumnos = ingresandoNombres(); break;
            case 2: String[] asignaturas = ingresandoAsignaturas(); break;
            case 3: String [][] notasAlumnos;break;
            case 4: break;
            case 5: break;
            case 6: break;
        }



    }
}




package Practica.Seccion_12_Arreglos;

import java.util.Scanner;

public class NotasAlumnos_Clase108b {
    public static void menuDespliegue(String[] menu)
    {
        System.out.println("============= MENU =============");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.print("Opcion: ");
    }

    public static int menuInteraccion(String[] menuPrincipalArray)
    {

        Scanner opMenu = new Scanner(System.in);
        String option = "";
        int optionNumber = 0;

        boolean seguirMenu = true;

        while(seguirMenu) {
            menuDespliegue(menuPrincipalArray);
            option = opMenu.nextLine();
            boolean datoCorrecto = false;

            seguirMenu= stringAEntero(option);

            if (optionNumber <= 0 || optionNumber > menuPrincipalArray.length ) {
                System.err.println("\n¡OPCION INEXISTENTE!\n");
            }else{
                seguirMenu=false;
            }
        }

        optionNumber = Integer.parseInt(option);
        return optionNumber;
    }

    static boolean stringAEntero(String noEntero)
    {
        boolean enteroConvertido = true;

        try {
            int numero = Integer.parseInt(noEntero);
        }catch (NumberFormatException e)
        {
            System.err.println("Ingrso un formato erroneo, debe ser numero entero");
            System.err.println(e);
            enteroConvertido = false;
        }
        return enteroConvertido;
    }


    public static void main(String[] args)
    {
        String[] informacion = {"Materias","Alumnos","Notas"}:
        String[] menuPrincipalArray =
                {   "Ingresar nombres de alumnos",
                        "Ingresar asignaturas",
                        "Ingresar notas" ,
                        "Modificar informacion",
                        "Mostrar Informacion",
                        "Salir"
                };


        int opcionElegida = menuInteraccion(menuPrincipalArray);




    }
}




package Practica.Seccion_03_Strings;

public class MetodosEjemplos {
    public static void main(String[] args) {
        String nombre = "Andres";

        System.out.println(nombre.length());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.equals("francia"));
        System.out.println(nombre.equalsIgnoreCase("aNdReS")); //ignora las mayusculas o minusculas, no es sensitivCase
        System.out.println(nombre.compareTo("Andres")); //si son iguales arroja un 0, si son diferentes distinto de 0

        try {
            System.out.println(nombre.charAt(7)); //obtenemos un caracter en particular con el indice del string
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Ha ingresado un indice que supera el tamaño del string \n");
        }


        // CONVERTIR STRING EN UN ARRAY

        System.out.println("CONVERTIR STRING EN UN ARRAY \n");

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        // System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); //NOS VA A ARROJAR LA DIRECCION

        char[] arreglo = trabalenguas.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            if (i == (arreglo.length-1)){
                System.out.println(arreglo[i] + "\n");
            }else{
                System.out.print(arreglo[i] + " ");
            }
        }

        String[] arreglo2 = trabalenguas.split("a");

        for (int i = 0; i < arreglo2.length; i++) {
            if (i == (arreglo2.length-1)){
                System.out.println(arreglo2[i] + "\n");
            }else{
                System.out.print(arreglo2[i] + " ");
            }
        }

        // OBTENEMOS LA EXTENSION DEL ARCHIVO
        String archivo = "alguna.imagen.aleatoria.docx";

        // DE ESTA MANERA
        String[] arreglo3 = archivo.split("[.]");

        for (int i = 0; i < arreglo3.length; i++) {
            if (i == (arreglo3.length-1)){
                System.out.println(arreglo3[i] + "\n");
                System.out.println("el formato del archivo es " + arreglo3[i] + "\n");
            }else{
                System.out.print(arreglo3[i] + " ");
            }

        }

        // O DE ESTA MANERA
        int i = archivo.lastIndexOf(".");

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(i+1) = " +  archivo.substring(i+1));
    }
}

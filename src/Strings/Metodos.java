package Strings;

public class Metodos {
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
            // TODO: handle exception
            System.out.println("Ha ingresado un indice que supera el tamaño del string");
        }
        

    }
}

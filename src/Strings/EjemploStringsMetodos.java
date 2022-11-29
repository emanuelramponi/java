package Strings;

public class EjemploStringsMetodos {
    public static void main(String[] args) {
        String nombre = "Andres";

        System.out.println(nombre.length());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.equals("Andres"));
        System.out.println(nombre.equalsIgnoreCase("ANDRES")); //ignora las mayusculas o minusculas, no es sensitivCase
        System.out.println(nombre.compareTo("Andres")); //si son iguales arroja un 0, si son diferentes distinto de 0
        System.out.println(nombre.charAt(0)); //obtenemos un caracter en particular con el indice del string

    }
}

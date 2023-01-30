package Practica.Seccion_03_Strings;

public class Validaciones {
    public static void main(String[] args) {
        String curso = null;
        String curso2 = "boca";
        
        boolean esNulo = curso== null;
        boolean esNulo1 = curso== null;
        
        // if(!esNulo){
        //     System.out.println(curso.toUpperCase());
        //     System.out.println(curso.concat(" desde cero!")); //En este caso como sigue siendo null va a tirar NullPointerException
        //     System.out.println("Bienvenido al curso".concat(curso)); 
        // }

        // System.out.println(curso.concat(" desde cero!")); //En este caso como sigue siendo null va a tirar NullPointerException
        // System.out.println("Bienvenido al curso".concat(curso)); //no puedo concatenar un string que si tiene 
                                                                //una referencia o una instancia invocando el metodo concato con 
                                                                //otro objeto del tipo string que es tipo nulo

        if (esNulo) {
            curso="Programacion Java"; 
        }


        if (esNulo1) {
            curso2="";//si el objeto es vacio, pero existe y tiene referencia, se verifica de la siguiente forma
        }

        // boolean esVacio = curso2.length()==0;
        boolean esVacio2 = curso2.isEmpty();
        // boolean esVacio3 = curso.isBlank(); //este metodo valida que sea distinto de null, 
                                            //despues que sea distinto de empty 
                                            //y por ultimo que sea distinto de un espacio en blanco

        // if (!esVacio) {
        //     System.out.println(curso2.toUpperCase());
        //     System.out.println("Bienvenido al curso".concat(curso2));
        // }

        if (!esVacio2) { //otra manera de corroborar que es vacio
            System.out.println("1 " + curso2.toUpperCase());
            System.out.println("2 Bienvenido al curso".concat(curso2));
        }
        
        System.out.println("3 " + curso.toUpperCase());
        System.out.println("4 " + curso.concat(" desde cero!"));
        System.out.println("5 Bienvenido al curso".concat(curso));
        System.out.println("6 " + curso.toUpperCase());
        System.out.println("7 Bienvenido al curso " + curso); //de esta forma no va a dar exception error pero el valor va a ser null

        //Entonces el metodo concat lo vamos a utilizar cuando el objeto string que vamos a concatenar tiene una instancia, no es nulo.
    }
}

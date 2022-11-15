package Strings;
public class EjemploStrings {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación java");

        boolean esIgual = curso==curso2;
        System.out.println("esIgual = " + esIgual); //el resultado va a ser false porque son dos instancias distintas, en dos espacios de memoria diferente

        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual); //equals compara el texto, no la referencia como se hacia con los ==

        esIgual = curso.equalsIgnoreCase(curso2); // compara sin tener en cuenta las mayusculas ni las minusculas

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual); //aca va a dar true porque curso al ser igual que curso3, 
                                                    //lo que hace es no crear un nuevo objeto, sino asigna la referencia del curso que ya existe
                                                    //es para poder optimizar y no ocupar tanta memora

        int numeroA = 10, numeroB = 5;
        String profesor = "Andrez Guzman ";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(numeroA + numeroB + detalle);

        System.out.println(detalle + (numeroA + numeroB) );

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);

    }
}

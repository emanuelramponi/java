package Strings;

public class etiquetasEnFor {
    public static void main(String[] args) {
        
        String frase = "tres tristes tigres tragan trigo en un trigaltrigo";
        String palabra = "trigo";

        int cantidad = 0;
        char letra = 'g';

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;  // hacemos esto para que si la frase es  tres tristes tigres tragan trigo en un trigaltrigo" 
                                                    //este al momento de recorrer el ultimo trigo no siga el for


        buscar:
        for (int i = 0; i <= maxFrase;) {  //inicializamos con la primera posicion de la frase
            int k = i;                              // creamos otra variable para que i no incremente y pueda seguir comparando cuando no sean todas las letras iguales
            for (int j = 0; j < maxPalabra; j++) {
                if(frase.charAt(k++) != palabra.charAt(j)){ //empieza a comparar los valores del indice k de la frase con la palabra
                    i++;
                    continue buscar;                        //si no coincide lo que hace es seguir en la etiqueta que creamos
                }
            }
            cantidad++; 
            i+= maxPalabra;                                    //cuando la encuentra incrementa la variable cantidad para que nos diga cuantas veces la encontro    
        }

        System.out.println("Encontrado " + cantidad + " veces el caracter '" + letra + "' en la frase");

    }
}

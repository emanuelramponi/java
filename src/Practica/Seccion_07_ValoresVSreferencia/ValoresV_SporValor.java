package Practica.Seccion_07_ValoresVSreferencia;

public class ValoresV_SporValor {
    public static void main(String[] args) {
        //PASAMOS POR VALOR
        int i = 10;

        System.out.println("iniciamos el método main con i  = " + i);
        test(i);
        System.out.println("Finalizamos el método main con i  = " + i); //en el otro metodo se cambio pero en main no cambio el valor
    }

    public static void test(int i){
        System.out.println("Iniciamos el método test con i  = " + i);
        i = 53; //es otra instancia la que se esta cambiando, se toma por referencia el valor del mismo pero se lo crea en otra instancia, es por eso que se mantiene
                //el valor en el main
        System.out.println("Finalizamos el método test con i  = " + i);
    }

}

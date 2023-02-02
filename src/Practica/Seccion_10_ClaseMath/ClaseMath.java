package Practica.Seccion_10_ClaseMath;

public class ClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(4.6,9.3);
        System.out.println("max = " + max);

        double min = Math.min(4.6,9.3);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5); //redondeamos para arriba
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.6); //redondea para abajo
        System.out.println("piso = " + piso);

        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        // CREAMOS NUMEROS ALEATORIOS DE UNA LISTA/ARREGLO

        String[] colores = {"azul","amarillo","rojo","verde","blanco","negro"};
        double random = Math.random();
        System.out.println("\nrandom = " + random);
        random *= colores.length;

        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);
    }
}

package Practica.Seccion_12_Arreglos;

public class Clase104principioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = i + 1;
        }
        
        int aux = 0;

        for (int i = 0; i < numeros.length - i; i++) {
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length - 1 - i];
        }

        for (int j : a) {
            System.out.println("i = " + j);
        }
    }
}

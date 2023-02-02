package Practica.Seccion_10_ClaseMath;

import java.util.Random;

public class ClaseRandom {
    public static void main(String[] args) {

        String[] colores = {"azul","amarillo","rojo","verde","blanco","negro"};
        Random randomObj = new Random();
        System.out.println("randomObj = " + randomObj);

        int randomInt = randomObj.nextInt(colores.length); //valor aleatorio entre 0 y 7
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + colores[randomInt]);
    }
}

package Practica.Seccion_10_ClaseMath;

import java.util.Scanner;

public class EjRadioCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo para poder calcular su area: ");

        double radio = sc.nextDouble();

        double areaCirculo = Math.PI * Math.pow(radio,2);

        System.out.println("El area del circulo es igual a " + areaCirculo);
    }
}

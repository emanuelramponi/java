package Practica.Seccion_12_Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class Arreglos {
    public static void arregloInverso(String[] arreglo)
    {
        int total2 = arreglo.length;
        int total = arreglo.length;

        for (int i = 0; i <total2/2 ; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2++;
        }
    }

    public static void main(String[] args) {
        String[] productos =
                {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                 "Asus Notebook", "Macbook Air",
                 "Chromecast 4ta generación", "Bicicleta Oxford"
                };

        int total = productos.length;

        Arrays.sort(productos); //ordena los productos de menor a mayor
        arregloInverso(productos); //invertimos el orden, de forma explicita

        Collections.reverse(Arrays.asList(productos)); //api de java, lo convierte a lista y la invierte

        System.out.println("=== Usando for ===");
        for (int i = 0; i <total ; i++) {
            System.out.println("para indice  " + i + " : " + productos[i]);
        }
    }
}

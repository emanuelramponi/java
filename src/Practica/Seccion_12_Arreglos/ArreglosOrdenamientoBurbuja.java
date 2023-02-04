package Practica.Seccion_12_Arreglos;

@SuppressWarnings("ALL")

public class ArreglosOrdenamientoBurbuja {

    public static void sortBurbuja(Object[] arreglo)
    {
        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total -1 - i; j++) { //a medida que avanza el for del i se van ordenando las posiciones superiores
                //noinspection unchecked
                if( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) <0) //convertimos el int en Integer(objeto por referencia) para utilizar compareTo
                {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
    }


    public static void itererarArreglo(Object[] arreglo)
    {
        int total = arreglo.length;
        System.out.println("=== Usando for ===");
        for (int i = 0; i <total ; i++) {
            System.out.println("para indice  " + i + " : " + arreglo[i]);
        }

    }


    public static void main(String[] args) {
        String[] productos =
                {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                 "Asus Notebook", "Macbook Air",
                 "Chromecast 4ta generación", "Bicicleta Oxford"
                };

        Integer[] numeros = {9,24,64,43,75,32,8};

        sortBurbuja(productos);

        sortBurbuja(numeros);

        itererarArreglo(productos);

        itererarArreglo(numeros);

        }

}

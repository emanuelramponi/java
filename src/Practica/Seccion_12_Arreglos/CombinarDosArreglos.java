package Practica.Seccion_12_Arreglos;

public class CombinarDosArreglos {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[10];
        b= new int[10];
        c= new int[20];

        for (int i = 0; i <a.length ; i++) {
            a[i] = (i +1);
        }

        for (int i = 0; i <b.length ; i++) {
            b[i] = (i+1)*5;
        }

        int aux = 0;

        for (int i = 0; i <b.length ; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        for (int i = 0; i <c.length ; i++) {
            System.out.println((i+1) + ": " + c[i]);
        }

        //2 de A y 2 de B

        aux = 0;
        
        for (int i = 0; i <b.length ; i+= 2) { //si queremos agregar 3, tienen que ser multiplo de 3 el tamaño de los arreglos
            for (int j = 0; j < 2; j++) {
                c[aux++] = a[i+j];
            }

            for (int j = 0; j < 2; j++) {
                c[aux++] = b[i+j];
            }
        }

        for (int i = 0; i <c.length ; i++) {
            System.out.println((i+1) + ": " + c[i]);
        }

    }
}

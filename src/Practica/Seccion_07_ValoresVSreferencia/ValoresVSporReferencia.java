package Practica.Seccion_07_ValoresVSreferencia;

public class ValoresVSporReferencia {

    public static void main(String[] args) {
        int[] edad = {10,11,12};

        System.out.println("iniciamos el método main");
        for (int i = 0; i < edad.length ; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("Antes de llamar al método test");
        test(edad);
        for (int i = 0; i < edad.length ; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }
        //por ser de referencia mantiene el cambio realizado en el método test
        System.out.println("Finaliza el método main con los datos del arreglo modificados");
    }

    public static void test(int[] edadArr){ //el arreglo es uno datos que se puede pasar por referencia
        System.out.println("iniciamos el método test");
        for (int i = 0; i <edadArr.length ; i++) {
            edadArr[i] += 20;
        }
        System.out.println("finaliza el método test");
    }
}

package Ejercicios;

public class ClasesWrapper {
    public static void main(String[] args) {
        
        // int intPrimitivo = 32749;
        // Integer intObjeto = Integer.valueOf(intPrimitivo); //forma explicita (unboxing)
        // Integer intObjeto2=intPrimitivo;                     //autovoxing, toma el valor literal y lo convierte de forma automatica en un objeto
        // System.out.println("intObjeto = " + intObjeto);

        // int num = intObjeto;  //automatica implicita
        // System.out.println("num = " + num);
        // int num2 = intObjeto2.intValue(); //retorna el entero primtivo del objeto
        // System.out.println("num2 = " + num2);

        //CLASES WRAPPER NUMERICAS Y OPERACIONES RACIONALES

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // NUMEROS MAYORES A 128 SE TIENE QUE HACER LO SIGUIENTE, HASTA 127 LO QUE HACE ES PASARLO A PRIMITIVO DE FORMA AUTOMATICA PARA COMPARARLOS.
        System.out.println("Son el mismo objeto? " + (num1 == num2)); // compara si estos dos objetos corresponden a la misma instancia, por es hay que utilizar equals

        System.out.println("tienen el mismo valor? " + (num1.equals(num2))); //compara el valor de cada objeto integer
        System.out.println("tienen el mismo valor? " + (num1.intValue() == num2.intValue())); //comparamos tambien el valor de cada objeto de forma explicita
        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);


        //  CLASE WRAPPER BOOLEAN

        // Integer num1= 1, num3 = 2;

        // boolean primBoolean = num1 > num3; //false
        // Boolean objBoolean = Boolean.valueOf(primBoolean);
        // Boolean objBoolean2 = Boolean.valueOf("false");
        // Boolean objBoolean3 = false;

        // System.out.println("primBoolean = " + primBoolean);
        // System.out.println("objBoolean = " + objBoolean);
        // System.out.println("objBoolean2 = " + objBoolean2);

        // System.out.println("comparando dos objetos boolean: " + (objBoolean == objBoolean2)); //se puede comparar con el igual a diferencia del int
        // System.out.println("comparando dos objetos boolean: " + (objBoolean.equals(objBoolean3)));



    }
}

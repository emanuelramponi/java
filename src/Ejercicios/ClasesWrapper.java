package Ejercicios;

public class ClasesWrapper {
    public static void main(String[] args) {
        
        int intPrimitivo = 32749;
        Integer intObjeto = Integer.valueOf(intPrimitivo); //forma explicita (unboxing)
        Integer intObjeto2=intPrimitivo;                     //autovoxing, toma el valor literal y lo convierte de forma automatica en un objeto
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;  //automatica implicita
        System.out.println("num = " + num);
        int num2 = intObjeto2.intValue(); //retorna el entero primtivo del objeto
        System.out.println("num2 = " + num2);

        


        //  CLASE WRAPPER BOOLEAN

        Integer num1= 1, num3 = 2;

        boolean primBoolean = num1 > num2; //false
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;

        System.out.println("primBoolean = ");
    }
}

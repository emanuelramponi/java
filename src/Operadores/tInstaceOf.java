package Operadores;

public class tInstaceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase string";
        
        Object num = 7;

        Boolean b1 = texto instanceof String; //validamos que el objeto pertenece a un tipo de clase o no
        System.out.println("texto es del tipo String? "+ b1);
        
        Boolean b2 = num instanceof String;
        System.out.println("num es del tipo String? " + b2);

        b2 = num instanceof Integer;
        System.out.println("num es del tipo Integer?" + b2);

        Number decimal = 45.54;
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo double? " + b1);

        
    }
    
}

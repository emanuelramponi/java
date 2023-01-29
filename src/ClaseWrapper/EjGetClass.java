package ClaseWrapper;

import java.lang.reflect.Method;

public class EjGetClass {
    public static void main(String[] args) {
    String texto = "Hola que tal buen dia yo estoy cheto bien";

    Class starClass = texto.getClass();

    System.out.println("starClass.getName() = " + starClass.getName());
    System.out.println("starClass.getSimpleName() = " + starClass.getSimpleName());
    System.out.println("starClass.getPackageName() = " + starClass.getPackageName());
    System.out.println("starClass = " + starClass);

    for (Method m : starClass.getMethods()) {
        System.out.println("m.getName() = " + m.getName()); //lo que nos da aca son todos los nombres de los metodos que existen de la clase String
    }

    Integer num = 35;
    Class intClass = num.getClass();
    Class objClass = intClass.getSuperclass().getSuperclass();

    System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
    System.out.println("intClass.getSuperclass().getSuperclass() = " + objClass);

    for (Method m : objClass.getMethods()) {
        System.out.println("m.getName() = " + m.getName()); //lo que nos da aca son todos los nombres de los metodos que existen de la clase String
    }
    }
}

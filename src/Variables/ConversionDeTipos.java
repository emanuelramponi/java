package Variables;
public class ConversionDeTipos {
    public static void main(String[] args) {

        //CONVERSION DE CADENAS A PRIMITIVOS
        String numeroStr = "50";
        // String numeroStr2 = "234";

        // int numeroInt2 = Integer.parseInt(numeroStr2);
        System.out.println("se paso el string a numero entero");
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "328943298.32e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "TruE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //CONVERSION DE PRIMITIVOS A CADENAS
        //Hay dos maneras de conversion

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        //1° MANERA
        //Realizamos la conversion
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        //2° MANERA
        otroNumeroStr = String.valueOf(otroNumeroStr + 10); // A este metodo se lo conoce como sobrecarga de metodos
                                                            // si le agregamos signos en un string va a tomar el valor con la operacion deseada
                                                            // si en vez de int es string, va a concatenar, no a sumar
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.234323e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        //CONVERSION DE PRIMITIVOS A PRIMITIVOS
        int i = 12769; //cuando supera el limite de short y lo forzamos a pasarlo a short,va a haber perdida de informacion si supera el limite
        short s = (short) i; //a este metodo de conversion se lo llama casting/cast
        System.out.println("s = " + s);
        System.out.println(Short.MAX_VALUE);

        long l = i;
        System.out.println("l = " + l);

        char b = (char) i;
        System.out.println("b = " + b);

        float f = (float) i;
        System.out.println("f = " + f);

        
        // EN PRIMITIVOS SOLAMENTE SE PUEDE HACER CAST A VALORES DE TIPO NUMERICOS Y TAMBIEN CHAR
    }
}

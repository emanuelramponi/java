package Practica.Seccion_11_LineaComandos;



public class Calculadora {
    public static void  calculadora(String signo, double[] num)
    {
        double resultado = 0;
        switch (signo)
        {
            case "resta" -> resultado = num[0] - num[1];
            case "suma" -> resultado = num[0] + num[1];
            case "multi" -> resultado = num[0] * num[1];
            case "div" -> resultado = num[0] / num[1];
            default -> {
            }
        }
        System.out.println("resultado = " + resultado);

    }

    public static void validationOperacion (String signo)
    {
        boolean signoCorrecto = signo.equals("resta") || signo.equals("suma") || signo.equals("multi") || signo.equals("div");

        if (!signoCorrecto)
        {
            System.out.println("El signo ingresado no es válido, ingresar uno que lo sea (resta, multi, div o suma)");
            System.exit(-1);
        }
    }


    public static void main(String[] args) {

    if (args.length <3){
        System.out.println("Debe tener parametros, ingrese una operacion (resta, multi, div o suma) y dos numeros enteros");
        System.exit(-1);
    }

    double[] numeros = new double[2];

    try{
        for (int i = 0; i <2 ; i++) {
            numeros[i] = Double.parseDouble(args[i+1]);
        }
    }catch (NumberFormatException e){
        System.err.println("No ingreso el formato correcto, ingrese un numero válido");
        System.err.println(e);
        System.exit(-1);
    }

    validationOperacion(args[0]);

    calculadora(args[0], numeros);

    }


}

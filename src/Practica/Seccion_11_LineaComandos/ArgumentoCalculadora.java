package Practica.Seccion_11_LineaComandos;



public class ArgumentoCalculadora {
    public double calculadora(String signo, double num1, double num2)
    {
        double resultado = 0;
        switch (signo) {
            case "resta" -> resultado = num1 - num2;
            case "suma" -> resultado = num1 + num2;
            case "multiplicacion" -> resultado = num1 * num2;
            case "division" -> resultado = num1 / num2;
            default -> {
            }
        }
    return resultado;
    }

    public boolean validationOperacion (String signo)
    {
        return signo.equals("resta") || signo.equals("suma") || signo.equals("multiplicacion") || signo.equals("division");
    }


    public static void main(String[] args) {

    if (args.length >3){
        System.out.println("Ingrese una operacion (resta, multiplicacion, division o suma) y dos numeros enteros");
        System.exit(-1);
    }

    double[] numeros = new double[2];

    try{
        for (int i = 0; i <2 ; i++) {
            numeros[i] = Double.parseDouble(args[i+1]);
        }
    }catch (NumberFormatException e){
        System.out.println("No ingreso el formato correcto, ingrese un numero válido");
        System.out.println(e);
    }


    }


}

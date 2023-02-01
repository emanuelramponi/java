package Practica.Seccion_01_Introduccion;
import Practica.Seccion_03_Strings.Strings;

import javax.swing.JOptionPane;

public class eShowInputDialog {
    public static void main(String[] args) {
            
            String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
            //Incorporacion de excepcion de error de formato
            //MANEJO DE ERROR DE FORMATO EN LAS EXCEPCIONES
            int numeroDecimal = 0; // inicializamos la variable antes de entrar al try catch, que es donde va a ver si el dato es del formato correcto
            try {

                numeroDecimal = Integer.parseInt(numeroStr); // el programa verifica que el dato ingresado por el usuario pueda pasarse a int

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Error \n Debe ingresar un numero");
                main(args); //llamamos denuevo a la funcion main, para que no se este ejecutando en bucle ya que esta en recursividad 
                System.exit(0); // ponemos la funcion system exit, y que el status tiene que dar cero para que este termine

            } 


             
            System.out.println("numeroDecimal = " + numeroDecimal);

            String resultadoBinario = "numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            System.out.println(resultadoBinario);

            int numeroBinario = 0b111110100;
            System.out.println("numeroBinario = " + numeroBinario);

            String resultadoOctal = "numero octal de " + numeroDecimal +  " = " + Integer.toOctalString(numeroBinario);
            System.out.println(resultadoOctal);
            
            int numeroOctal = 764;
            System.out.println("numeroOctal = " + numeroOctal);

            String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroBinario) ;
            System.out.println(resultadoHexa);
            
            int numeroHex = 0x1f4;
            System.out.println("numeroHex = " + numeroHex);

            String mensaje = resultadoBinario + "\n" + resultadoOctal + "\n" + resultadoHexa;

            JOptionPane.showMessageDialog(null, mensaje);
    }
}

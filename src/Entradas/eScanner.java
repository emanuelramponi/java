package Variables;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {
            //otro metodo para pasar a int mediante scanner y por medio de otra exception  
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero entero: ");
            // String numeroStr = scanner.nextLine();
            
            int numeroDecimal = 0; 
            try {

                numeroDecimal = scanner.nextInt(); // numeroDecimal = Integer.parseInt(numeroStr); 

            } catch (InputMismatchException e) {

                System.out.println("Error! Debe ingresar un numero");
                main(args);
                System.exit(0); 

            } 

            scanner.close();

            System.out.println("numeroDecimal = " + numeroDecimal);

            String mensaje = "numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) + "\n" +
            "numero octal de " + numeroDecimal +  " = " + Integer.toOctalString(numeroDecimal) + "\n" +
            "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) ;

            System.out.println(mensaje);

            
    }
}

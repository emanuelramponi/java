public class SistemasNumericos {
    public static void main(String[] args) {
            int numeroDecimal = 500;
            System.out.println("numeroDecimal = " + numeroDecimal);
            System.out.println("numeroDecimal de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

            int numeroBinario = 0b111110100;
            System.out.println("numeroBinario = " + numeroDecimal);
            System.out.println("numero octal de " + numeroDecimal +  " = " + Integer.toOctalString(numeroBinario));
            
            int numeroOctal = 764;
            System.out.println("numeroOctal = " + numeroOctal);
            System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroBinario));
            
            int numeroHex = 0x1f4;
            System.out.println("numeroHex = " + numeroHex);

    }
}

package Variables;
public class PrimitivosEnteros {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD\n");

        byte numeroByte = 127;
        System.out.println("BYTE");
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte correspondiente en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites " + Byte.SIZE);
        System.out.println("valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Byte.MIN_VALUE + "\n" );
        
        short numeroShort = 32767;
        System.out.println("SHORT");
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short correspondiente en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites " + Short.SIZE);
        System.out.println("valor maximo de un byte: " + Short.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Short.MIN_VALUE + "\n");

        int numeroInt = 2147483647;
        System.out.println("INT");
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int correspondiente en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites " + Integer.SIZE);
        System.out.println("valor maximo de un byte: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Integer.MIN_VALUE + "\n");

        long numeroLong = 9223372036854775807L;
        System.out.println("LONG");
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long correspondiente en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites " + Long.SIZE);
        System.out.println("valor maximo de un byte: " + Long.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Long.MIN_VALUE + "\n");
     
        

    }
}

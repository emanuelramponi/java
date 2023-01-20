package Variables.Primitivos;
public class PrimitivosFloat {
    static float varFlotante;
    public static void main(String[] args) {
        float realFloat = 2.12e3f; //2120f
        realFloat = 1.5e-10f; //0.00000000015f
        realFloat = 0.00000000015f;
        System.out.println("real float = " + realFloat);
        System.out.println("float corresponde en byte a " + Float.BYTES);
        System.out.println("float corresponde en bites a " + Float.SIZE);
        System.out.println("Maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Minimo valor para float = " + Float.MIN_VALUE  + "\n");

        double realDouble = 3.4028235E39;
        System.out.println("real double = " + realDouble);
        System.out.println("double corresponde en byte a " + Double.BYTES);
        System.out.println("double corresponde en bites a " + Double.SIZE);
        System.out.println("Maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("Minimo valor para double = " + Double.MIN_VALUE  + "\n");
        

        System.out.println("varFlotante: " + varFlotante);
    }
}

package Strings;


public class TestRendConcat2 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 1/2ms
            c += a + b + "\n";  
        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        // System.out.println("c = " + c);

    }
}

package Strings;

public class TestRendConcat1 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        // String c = a;

        StringBuilder sb = new StringBuilder(a);

        
        long inicio = System.currentTimeMillis();
        
        for (int i = 0; i < 1000; i++) {
            // c = c.concat(a).concat(b).concat("\n"); //entre 2 y 6 milisegundos tarda este tipo de concatenacion
            // c += a + b + "\n";
            sb.append(a).append(b).append("\n"); //tarda entre 0 y 1 milisegundo, es mas rapido y mas eficiente este metodo
        }
   
        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio); 
        System.out.println(fin);
        System.out.println(inicio);
        
    }
}

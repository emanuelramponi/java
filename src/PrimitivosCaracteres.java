public class PrimitivosCaracteres{
        public static void main(String[] args) {
            
            char caracter = '\u0040';
            var decimal = 64;
            System.out.println("caracter: " +caracter);
            System.out.println("caracter: " + decimal);
            System.out.println("caracter = decimal? : " + (caracter == decimal));
    
            char simbolo = '@';
            System.out.println("$simbolo = " + (simbolo == caracter) + "\n");

            System.out.println("char corresponde en byte = " + Character.BYTES); // System.getProperty("line.separator") || System.lineSeparator = \n
            System.out.println("char corresponde en bites a " + Character.SIZE);
            System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
            System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE );

            System.out.println("\nla concha de tu madre all boys");
        }
    }


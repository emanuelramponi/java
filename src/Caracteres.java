public class Caracteres {void main(String[] args) {
        
        char caracter = '\u0040';
        var decimal = 64;
        System.out.println("caracter: " +caracter);
        System.out.println("caracter: " + decimal);
        System.out.println("caracter = decimal? : " + (caracter == decimal));

        char simbolo = '@';
        System.out.println("$simbolo = " + (simbolo == caracter));
    }
}

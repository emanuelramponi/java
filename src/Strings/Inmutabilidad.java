package Strings;



public class Inmutabilidad {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso==resultado);


        //hacer una transformacion mediante funcion flecha
        String resultado2 = curso.transform(c->{ // c es el parametro que le pasamos a curso, puede ir en parentesis si hay mas de un parametro
            return c + " con " + profesor;
        });//transform lo que hace es retornar una nueva instancia, no modifica a curso. Estamos llamando a una funcion en este caso
        
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        //cualquier cambio o metodo que modifica el string lo que hace es retornar una nueva instancia, el original queda intacto.
        //se tiene que guardar en otra variabla la modificacion que nosotros hicimos

        String resultado3 = resultado.replace("a","A"); //reemplazamos las a minusculas que hay en el string resultado por A mayusculas

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);

    }   

    
}

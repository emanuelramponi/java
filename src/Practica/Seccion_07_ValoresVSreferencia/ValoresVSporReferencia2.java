package Practica.Seccion_07_ValoresVSreferencia;

class Persona{ //lo recomendado es crearla en un archivo separado
    private String nombre;       //private: solamente se puede manipular, leer y modificar en la propia clase, no se puede hacer desde afuera

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre; //this se utiliza para referirse a que corresponde a un atributo de la clase
    }
    
    public String leerNombre(){
     return this.nombre;   
    }

}
public class ValoresVSporReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Andres");

        System.out.println("iniciamos el método main");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("Antes de llamar al método test");
        test(persona);

        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("Finaliza el método main con los datos del arreglo modificados");
    }

    public static void test(Persona persona){ //el arreglo es uno datos que se puede pasar por referencia
        System.out.println("iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("finaliza el método test");
    }
}

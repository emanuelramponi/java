package Practica.Seccion_09_SystemClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignandoPropiedadadesDelSistema {
    public static void main(String[] args) {
        //importamos el archivo config
        //si no existe manejamos el archivo
        try{
            FileInputStream archivo = new FileInputStream("src/Practica/Seccion_09_SystemClass/config.properties");


            /*1. Creo objeto Properties
            * 2. Le agrego las propiedades del archivo properties
            * 3. Con set le puedo agregar otra propiedad que no está en el archivo config
            * 4. Le agregamos las propiedades de "p" al sistema*/
            Properties p = new Properties(System.getProperties()); //cargamos las configuraciones del sistema
            p.load(archivo); // y tambien le pasamos la configuracion del archivo
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties"); //podemos agregar otra configuraciòn a "p" Properties
            System.setProperties(p); //le agregamos a las propiedades del sistema las configuraciones del objeto Properties p
            
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada")); //obtenemos de forma directa creando una variable
            System.out.println(System.getProperty("config.puerto.servidor")); //o indirectamente a través del método con el nombre de la llave
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

            //ps.list(System.out);
        }catch(Exception e) {
            System.out.println("No existe el archivo = " + e);
        }

    }
}

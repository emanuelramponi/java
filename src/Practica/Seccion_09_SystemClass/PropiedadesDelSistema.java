package Practica.Seccion_09_SystemClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropiedadesDelSistema {
    
    //documantacion de getproperties
    //https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html



    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);
        
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);
        
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator);

        System.out.println("lineSeparator + \" Una linea nueva\" = " + lineSeparator + " Una linea nueva" + lineSeparator);

        Properties p = System.getProperties();
        p.list(System.out);
    }
}

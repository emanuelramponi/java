package Ejercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejOperadores {
    
    public static void main(String[] args) {
        // EJERCICIO 1
        // Pedir dos números y mostrarlos ordenados de mayor a menor
        
        // int[] num = new int[2];
        // Scanner scanner = new Scanner(System.in);
    
        // for (int i = 0; i < num.length; i++) {
        //     System.out.print("Ingrese el " + (i+1) + "º numero: ");
        //     num[i] = scanner.nextInt();
        // }

        // String resultado = num[0]<num[1]?  num[1] + " " + num[0]: num[0] + " " + num[1];
        // System.out.println(resultado);

        // scanner.close();


        // EJERCICIO 2
        // Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa 
        // que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio
        // La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, 
        // pero tambien puede ser del tipo int.
        // Si la capacidad actual es 70 litros: imprimir Estanque lleno
        // Si está entre 60 y menor a 70: imprimir Estanque casi lleno
        // Si está entre 40 y menor a 60: imprimir Estanque  3/4
        // Si está entre 35 y menor a 40: imprimir Medio Estanque 
        // Si está entre 20 y menor a 35: imprimir Suficiente
        // Si está entre 1 y menor a 20: imprimir Insuficiente

        // int ca;
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Ingrese la medida actual del tanque: ");
        // ca = scanner.nextInt();
        
        // String capacidad =  ca==70?  "Estanque lleno":
        //                         ca>= 60 && ca <70?  "Estanque casi lleno":
        //                         ca>= 40 && ca <60?  "Estanque 3/4":
        //                         ca>= 35 && ca <40?  "Medio Estanque":
        //                         ca>= 20 && ca <35?  "Suficiente":
        //                         ca>=  1 && ca <20?  "Insuficiente":
        //                                             "Vacio";

        // System.out.println(capacidad);
        // scanner.close();

        // EJERCICIO 3
        // Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
        // Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros 
        // de la familia o amigos usando la clase JOptionPane y método showInputDialog().
        // Calcular e Imprimir el nombre de la persona que tenga el nombre más largo 
        // (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
        // Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y
        // con el indice cero accedemos al nombre de la persona.
        // Restricción no usar loops en el desarrollo de la tarea.
        // Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
        
        String[] nombres = new String[3];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el " + (i+1) + " nombre: ");
            nombres[i] = JOptionPane.showInputDialog(null,("Ingrese el " + (i+1) + " nombre: "));
        }

        String  max = nombres[0].split(" ")[0].length() > nombres[1].split(" ")[0].length() ? nombres[0]: nombres[1];
                max = max.split(" ")[0].length() > nombres[2].split(" ")[0].length() ? max: nombres[2];

        JOptionPane.showMessageDialog(null,"El nombre con mayor longitud es " +  max);
    }

}

package Practica.Seccion_08_ClaseDateAndCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjParseJavaUtilDate {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con fomrato 'yyyy-MM-dd': ");

        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("fecha1 (del usuario) es después que la fecha2 (fecha actual)");
            }else if(fecha.before(fecha2)){
                System.out.println("fecha1 (del usuario) es anterior que fecha2 (fecha actual)");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha1 (del usuario) es igual que fecha2 (fecha actual)");
            }


            if (fecha.compareTo(fecha2) > 0){
                System.out.println("fecha1 (del usuario) es después que la fecha2 (fecha actual)");
            }else if(fecha.compareTo(fecha2) < 0){
                System.out.println("fecha1 (del usuario) es anterior que fecha2 (fecha actual)");
            }else if(fecha.compareTo(fecha2) == 0){
                System.out.println("fecha1 (del usuario) es igual que fecha2 (fecha actual)");
            }
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}

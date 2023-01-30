package Practica.Seccion_08_ClaseDateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaseDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        Date fecha2 = new Date();

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM 'del 'yyyy");
        String fechaStr = df.format(fecha);

        System.out.println("formato 1 = " + fechaStr);
        
        SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
        String fechaStr2 = df2.format(fecha2);

        System.out.println("formato 2 = " + fechaStr2);

        //getTime retorna un tipo long que representa una fecha en milisegundos desde enero de 1970
        long j = 0;
        for (int i = 0; i < 10000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha3 = new Date();
        long tiempoFinal = fecha3.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for " + tiempoFinal);

    }
}

package org.asaezcarbonell.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Día: " + fechaActual.getDayOfMonth());
        Month mes = fechaActual.getMonth();
        System.out.println("Mes: " + mes);
        System.out.println("Número del mes: " + mes.getValue());
        System.out.println("Mes español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        System.out.println("Numero del día: " + diaSemana.getValue());
        System.out.println("Nombre del día: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Día del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());
        
        fechaActual = LocalDate.of(2023, 01, 01);
        System.out.println("fechaActual = " + fechaActual);
        
        fechaActual = LocalDate.of(2023, Month.JANUARY, 1);
        System.out.println("fechaActual = " + fechaActual);
        
        fechaActual = LocalDate.parse("2023-01-02");
        System.out.println("fechaActual = " + fechaActual);
        
        LocalDate diaDeManiana = LocalDate.now().plusDays(1);
        System.out.println("diaDeMañana = " + diaDeManiana);
        
        LocalDate mesAnterioMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnterioMismoDia = " + mesAnterioMismoDia);

        DayOfWeek lunes = LocalDate.parse("2023-01-02").getDayOfWeek();
        System.out.println("Lunes = " + lunes);

        int uno = LocalDate.of(2023, 01, 01).getDayOfMonth();
        System.out.println(uno);
        
        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);
        
        boolean esAntes = LocalDate.of(2023, 01, 01).isBefore(LocalDate.parse("2023-01-05"));
        System.out.println("esAntes = " + esAntes);
        
        boolean esDespues = LocalDate.parse("2023-01-01").isAfter(LocalDate.parse("2023-01-10"));
        System.out.println("esDespues = " + esDespues);
        
        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("esDespues = " + esDespues);
    }
}

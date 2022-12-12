package serializables01;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salir="no";
        int ejercicio=0;
        while (!salir.equals("si")){
            System.out.println(" 1. Grabar Personas.");
            System.out.println(" 2. Grabar Empleados.");
            System.out.println(" 3. Leer Personas.");
            System.out.println(" 4. Leer Empleados.");
            System.out.print("Que ejercicio quieres hacer (salir = 0)? (1-4): ");
            boolean repetir=false;
            do{
                repetir=false;
                try {
                    ejercicio = sc.nextInt(); 
                } catch (NumberFormatException ex) {
                    repetir=true;
                    System.out.println(ex.getMessage());
                } 
            }while(repetir);
            System.out.println("");

            switch(ejercicio){
                case 1:
                        Funciones.GrabarPersonas();
                        System.out.println(); 
                        break;
                case 2:
                        Funciones.GrabarEmpleados();
                        System.out.println();
                        break;
                case 3:
                        Funciones.LeerPersonas();
                        System.out.println();
                        break;
                case 4:
                        Funciones.LeerEmpleados();
                        System.out.println();
                        break;
                default:
                        if (ejercicio==0)
                            break; 
                        else  System.out.println("Ejercicio incorrecto");
            }      

            System.out.print("Desea salir (' '/*)? ");
            salir = sc.next();
            }
     }           //Fin while (!salir.equals("si"))
}


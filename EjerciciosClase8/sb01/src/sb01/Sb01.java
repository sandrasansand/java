package sb01;

import java.util.Scanner;

public class Sb01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        long numero = sc.nextLong();
        StringBuilder cadena = new StringBuilder(Long.toString(numero));
        StringBuilder cadena1 = new StringBuilder(cadena);
        cadena1.reverse();
        int numPuntos = (int)(cadena1.length()/3);
        if ((int)(cadena1.length()%3)==0) numPuntos--;
        for(int i=1; i<=numPuntos;i++){
            cadena1.insert(4*i-1, '.');
        }
        System.out.println(cadena1.reverse());
        
        
        cadena1 = new StringBuilder(cadena);
        cadena1.reverse();
        for(int i=3;i<cadena1.length();i=i+4){
            cadena1.insert(i, '.');
        }
        System.out.println(cadena1.reverse());
    }
}

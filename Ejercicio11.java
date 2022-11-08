import java.util.Scanner;

/*
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.
 */


public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una hora y sus minutos");
        float hora = sc.nextFloat();
        float minutos = sc.nextFloat();
        float segundos = 0;
        hora = 3600;
        minutos = 60;
        
        System.out.print("Quedan " + segundos + "para media noche");
        segundos = (hora+minutos)-(28800);
        sc.close();
    }
}

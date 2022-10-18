import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        System.out.print("Introduzca un dia de la semana");
        Scanner sc = new Scanner(System.in);
        String dia =  sc.next();
        switch (dia) {
            case "lunes":
            System.out.print("Programacion");
            break;
            case "martes":
            System.out.print("Sistemas Informaticos");
            break;
            case "miercoles":
            System.out.print("Entornos Desarollo");
            break;
            case "jueves":
            System.out.print("Programacion");
            break;
            case "viernes":
            System.out.print("Fol");
            break; 
            default:
            System.out.println("Tinene que ser un dia de lunes a viernes"); 

        }
        sc.close();
    }
}
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor para a");
        float a = sc.nextFloat();
        System.out.println("Introduzca un valor para b");
        float b = sc.nextFloat();
        System.out.println("Introduzca un valor para c");
        float c = sc.nextFloat();
        System.out.println("El primer valor de x es " + ((-b)+Math.sqrt(b*b-4*a*c)/(2*a)));
        System.out.println("El segundo valor de x es " + ((-b)-Math.sqrt(b*b-4*a*c)/(2*a)));
    }   
}

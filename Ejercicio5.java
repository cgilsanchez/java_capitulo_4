import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el valor de a: ");
        float a = sc.nextFloat();
        System.out.print("Introduzca el valor de b:  ");
        float b = sc.nextFloat();
        System.out.println("El valor de x es " + (-b/a));
        sc.close();
    }
}
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura desde la que desea tirar el objeto");
        Double altura = sc.nextDouble();
        Double g = 9.81;
        System.out.print("El tiempo que tardara el objeto en caer sera de " + (Math.sqrt(2*altura/g)) + " segundos");
        
        sc.close();
    }
}

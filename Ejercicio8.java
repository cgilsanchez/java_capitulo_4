import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera nota");
        float n1 = sc.nextFloat();
        System.out.println("Introduzca la segunda nota");
        float n2 = sc.nextFloat();
        System.out.println("Introduzca la tercera nota");
        float n3 = sc.nextFloat();
        float nota = (n1+n2+n3)/(3);
        System.out.print("La media es de " + nota);
        
        
        
        if (nota>=1 && nota<5) {
            System.out.print("Insuficiente");
        }else if (nota==5){
            System.out.print("Suficente");
        } else if (nota==6){
            System.out.print("Bien");
        } else if (nota>=7 && nota<9){
            System.out.print("Notable");
        } else if (nota>=9 && nota<=10){
            System.out.print("Sobresaliente");
        }else if (nota>10) {
        System.out.print("Esa nmedia no esta definida");
        }
        
        
    }
}
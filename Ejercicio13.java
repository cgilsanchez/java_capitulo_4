import java.util.Scanner;

/*Escribe un programa que ordene tres números enteros introducidos por teclado. */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        int n2 = sc.nextInt();
        System.out.println("Introduzca el tercer numero");
        int n3 = sc.nextInt();
        if(n1>n2 && n1>n3 && n2>n3){
            System.out.println(n1 + " " + n2 + " " + n3 );
        }else{
            if(n2>n1 && n2>n3 && n1>n3){
                System.out.println(n2+ " " + n1 + " " + n3);
            }
        }if(n3>n1 && n3>n2 && n2>n1){
                System.out.println(n3 + " " + n2 + " " + n1);
        }else{
            if(n3>n2 && n1>n2 && n3>n1){
                System.out.println(n3 + " " + n1 + " " + n2);
            }
        }if (n1>n3 && n1>n2 && n3>n2){
            System.out.println(n1+ " " + n3 + " " + n2);

        }else{
            if(n2>n1 && n2>n3 && n3>n1){
                System.out.println(n2 + " " + n3 + " " + n1);
            }
        }
        sc.close();
    }
}

import java.util.Scanner;
/*Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un caracter:  ");
        String c = sc.next();
        System.out.println("Como desea que se imprima la piramide");
        System.out.println("1.vertice hacia arriba");
        System.out.println("2.vertice hacia abajo");
        System.out.println("3.vertice hacia la izquierda");
        System.out.println("4.vertice hacia la derecha");
        System.out.println("Escriba una de las opciones anteriores");
        String vertice = sc.next();
        switch (vertice) {
            case "1":
            System.out.println(   c);
            System.out.println( c+c+c);
            System.out.println(c+c+c+c+c);
            break;
            case "2":
            System.out.println(c+c+c+c+c);
            System.out.println( c+c+c);
            System.out.println(   c);
            break;
            case "3":
            System.out.println(    c);
            System.out.println(  c+c);
            System.out.println(c+c+c);
            System.out.println(  c+c);
            System.out.println(    c);
            break;
            case "4":
            System.out.println(c);
            System.out.println(c+""+c);
            System.out.println(c+""+c+""+c);
            System.out.println(c+""+c);
            System.out.println(c);
            break;
            default:
            System.out.println("No es ninguna de las opciones anteriores");

            
        }
        sc.close();
    }
}

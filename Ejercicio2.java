import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una hora del dia: ");
        int hora = sc.nextInt();
        if(hora>=6 && hora<=12){
            System.out.print("Buenos Dias");
        }else if (hora>=13 && hora<=20){
        System.out.print("Buenas Tardes");
        }else {
            System.out.print("Buenas Noches");
        }
    sc.close();
    }
    
}

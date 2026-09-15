package EVA1_12_Primos;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int salir = 1;
        while (salir != 0){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = input.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
        metodo2();
        System.out.println("Ingrese 0 para salir o cualquier otro numero para continuar: ");
        salir = input.nextInt();
        
    }
}
    public static void metodo2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero para el metodo de la raiz: ");
        int num;
        num = input.nextInt();
        boolean esPrimo = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }

            if (esPrimo) {
                System.out.println(num + " es primo");
            } else {
                System.out.println(num + " no es primo");
            }
    }
}



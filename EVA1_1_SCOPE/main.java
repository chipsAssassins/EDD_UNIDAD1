public class main {

    public static void main(String[] args) {
        int x=100; //Existe dento del bloque del main()
        for (int i = 0; i < 10; i++){ // existe solo dentro del for

            System.out.println ("i = " + i);
            x++; //visible dentro del for

        }
        System.out.println("valor final de la i = " + i);//ya no existe
        System.out.println("valor final de la x = " + x);//todavia existe

    }
    public static void OtraDuncion(){
        System.out.println("Valor de x = " + x); //No existe

    }
}
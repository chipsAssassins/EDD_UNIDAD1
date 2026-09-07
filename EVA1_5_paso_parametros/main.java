package EVA1_5_paso_parametros;

public class main {
    public static void main(String[] args) {
        int i =5;
        System.out.println("valor de i = "+ i );
        incrementar(i);
        System.err.println("Valor de i (despues de incrementar) = "+i);

    }

    public static void incrementar (int valor){
        valor ++ ;
    }
}

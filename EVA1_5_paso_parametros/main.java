package EVA1_5_paso_parametros;

public class main {
    public static void main(String[] args) {
        int i =5;
        System.out.println("valor de i = "+ i );
        incrementar(i);
        System.err.println("Valor de i (despues de incrementar) = "+i);
        //Ahora paso por referencia
        Prueba prueba = new Prueba();
        System.out.println("valor de prueba.y = " + prueba.y);
        incrementarObj(prueba);
        System.err.println("Valor de prueba.y (despues de incrementar) = " + prueba.y);

    }

    public static void incrementar (int valor){
        valor ++ ;
    }
    public static void incrementarObj(Prueba objeto){
        objeto.y++;
    }
}
    class Prueba{
        int y =5;
    }

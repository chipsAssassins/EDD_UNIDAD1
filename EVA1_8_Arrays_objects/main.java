package EVA1_8_Arrays_objects;

public class main {
    
    public static void main(String[] args) {
        Ejemplo[] arreglo = null;
        System.out.println("Arreglo = " + arreglo); 
        //System.out.println("Arreglo = " + arreglo); 
        arreglo = new Ejemplo[2];
        System.out.println("Arreglo[0] = " + arreglo[0]);
        System.out.println("Arreglo[1] = " + arreglo[1]);  
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        System.out.println("Arreglo[0] = " + arreglo[0]);
        System.out.println("Arreglo[1] = " + arreglo[1]);

        System.out.println("Arreglo[0] = " + arreglo[0].i);
        System.out.println("Arreglo[1] = " + arreglo[1].i);
    }
}
    class Ejemplo{
        int i = 5;
    }
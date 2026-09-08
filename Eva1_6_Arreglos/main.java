package Eva1_6_Arreglos;

public class main {
    public static void main(String[] args) {
        
        int[] datos = new int[1000000000]; //4gb
        System.out.println(datos);
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random() * 100);
  
    }
}
}

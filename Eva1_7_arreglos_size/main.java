package Eva1_7_arreglos_size;

public class main {
    public static void main(String[] args) {
        int[] original = new int [10];

        for (int i = 0; i < original.length; i++) { //Llenar con datos aleatrio
            original[i] = (int)(Math.random() * 100);           
        }
        for (int i = 0; i < original.length; i++){ //Imprimir
            System.out.println("[" + original + "]");
        } 
        
        System.out.println("");
                //cambiar el tamaño no se puede
        //copia que hice
        int [] copia = new int[5];// Copio la direccion del arreglo original


        for (int i = 0; i < original.length; i++) { //Imprime el arreglo original
            System.out.println("["+ original +"]"); 
            copia = original;           
        }
        System.out.println("");

        original = copia; //Esto copia el arreglo original al arreglo copia

        original = new int [5];
        for (int i = 0; i <original.length ; i++) { //Imprimir el arreglo modificado
            System.out.println("["+ original+"]");            
        }

    }
    
}
/*
solucion del profe 
int[ copia = original;
original = new int[5];
System.out.println(original);]
for (int i = 0; i < original.length; i++) {
    System.out.println("[" + copia[i] + "]");
 */

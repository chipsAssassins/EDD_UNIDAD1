package EVA1_4_Objects;
public class main {
    public static void main(String[] args){

        //TODO code application logic here
        
        Prueba prueba = new Prueba();

        System.out.println(prueba);
        //Eliminar prueba:
        //termina el programa -> carbage collector elimina automaticamente la memoria no usada ya
        //eliminar "directamente" el objeto
        prueba = null;
        //todos los objetos se producen en el heap y se guardan en el stack 


    }
    
}

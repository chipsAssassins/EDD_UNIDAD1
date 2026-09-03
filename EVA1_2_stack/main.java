public class main{
    public static void main(String[] args){
        System.out.println("inicia main");
        A();
        
        System.out.println("termina main");

    }

    public static void A(){
        System.out.println("inicia (a)");
        B();
        System.out.println("termina (a)");
        
    }

    public static void B(){
        System.out.println("inicia (b)");
        int i=5;
        double d= 5.5;
        System.out.println("termina (a)");
    }
    
}
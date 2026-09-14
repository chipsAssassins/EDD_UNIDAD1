package EVA1_10_4DIMENSIONESArray;

public class Main {
    public static void main( String [] args){
        int [][][][] array4D = new int [2][2][2][2];// almacena 16 enteros
        
        for (int i = 0; i < array4D.length; i++){ // Primera dimension
            for ( int j =0; j <array4D[i].length; j++){ // Segunda dimension
                for ( int k =0; k <array4D[i][j].length; k++){ // Tercera dimension
                    for ( int l =0; l <array4D[i][j][k].length; l++){ // Cuarta dimension
                        array4D[i][j][k][l] = (int)(Math.random() * 100);
                    }
                }
            }
        }
        for (int i = 0; i < array4D.length; i++){ // Primera dimension
            for ( int j =0; j <array4D[i].length; j++){ // Segunda dimension
                for ( int k =0; k <array4D[i][j].length; k++){ // Tercera dimension
                    for ( int l =0; l <array4D[i][j][k].length; l++){ // Cuarta dimension
                        System.out.print("[" + array4D[i][j][k][l] + "]");
                    }
                }
            }
        }
    }
}
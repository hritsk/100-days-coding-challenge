import java.util.*;
public class twoDArrays {
    public static boolean search( int matrix[][], int key){
        for( int i=0 ; i<matrix.length ; i++){
            for( int j=0; j<matrix[0].length ; j++){
                if(matrix[i][j]== key){
                    System.out.println("found at cell(" + i + "," + j + ")");
                    return true;
                }  
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt(); 
        
        int matrix [] [] = new int [rows][cols];

        for( int i=0 ; i<rows ; i++){
            for( int j=0; j<cols ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for( int i=0 ; i<rows ; i++){
            for( int j=0; j<cols ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 3);
    }
}

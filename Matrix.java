import java.util.Scanner;
public class Matrix
{
    int m = 3;
    int n = 3;
	public static void main(String[] args) {
		Main M = new Main();
		System.out.println("Enter matrix 1: ");
		int [][] A = M.getMat();
		System.out.println("Enter matrix 2: ");
		int [][] B = M.getMat();
		
		System.out.println("Addition: ");
		int [][] C = M.addMat(A,B);
		M.printMat(C);
		
		System.out.println("Multiplication: ");
		int [][] C = M.mulMat(A,B);
		M.printMat(C);
		
	}
	
	public int [][] getMat(){
	    int [][] arr = new int [m][n];
	    Scanner sc = new Scanner(System.in);
	    for (int i = 0; i < m; i++){
	        for (int j = 0; j < n; j++){
	            arr[i][j] = sc.nextInt();
	        }
	    }
	    return arr;
	}
	
	public void printMat(int[][] A){
	    for (int i = 0; i < m; i++){
	        for (int j = 0; j < n; j++){
	            System.out.print(A[i][j] + " ");
	        }
	        System.out.println("");
	    }
	}
	
	public int [][] addMat(int [][] A, int [][] B){
	    int [][] C = new int [m][n];
	    for (int i = 0; i < m; i++){
	        for (int j = 0; j < n; j++){
	            C[i][j] = A[i][j] + B[i][j];
	        }
	    }
	    return C;
	}
	
	public int [][] mulMat(int [][] A, int [][] B){
	    int [][] C = new int [m][n];
	    for (int i = 0; i < m; i++){
	        for (int j = 0; j < n; j++){
	            C[i][j] = 0;
	            for (int k = 0; k < m; k++){
	                C[i][j] += A[i][k] * B[k][j];
	            }
	        }
	    }
	    return C;
	}
}

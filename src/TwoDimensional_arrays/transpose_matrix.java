package TwoDimensional_arrays;

import java.util.Scanner;

public class transpose_matrix {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter columns: ");
	        int cols = sc.nextInt();

	        int[][] arr = new int[rows][cols];

	        System.out.println("Enter matrix elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                arr[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("Matrix:");
	        for (int[] row : arr) {
	            for (int val : row) System.out.print(val + " ");
	            System.out.println();
	        }
    
	        int[][] trans_mat = new int[cols][rows];
	        for (int i = 0; i < cols; i++) {
	            for (int j = 0; j < rows; j++) {
	                trans_mat[i][j] = arr[j][i];
	            }
	        }
	        
	        System.out.println("Transpose Matrix:");
	        for (int[] row : trans_mat) {
	            for (int val : row) System.out.print(val + " ");
	            System.out.println();
	        }
	        
	        sc.close();
	}

}

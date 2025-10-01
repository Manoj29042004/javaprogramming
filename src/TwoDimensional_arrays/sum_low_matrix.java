package TwoDimensional_arrays;

import java.util.Scanner;

public class sum_low_matrix {

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
	        
	        int sum = 0;
	        for(int i = 0;i < arr.length; i++) {
	        	for(int j = 0;j < arr[i].length; j++) {
	        		if(j <= i) sum += arr[i][j];
	        	}
	        }
	        
	        System.out.println("sum of upper triangle of matrix is: "+ sum);
	        sc.close();

	}

}


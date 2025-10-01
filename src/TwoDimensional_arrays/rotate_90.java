package TwoDimensional_arrays;

import java.util.Scanner;

public class rotate_90 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int[][] arr = new int[n][n];

	        for (int i = 0; i < n; i++)
	            for (int j = 0; j < n; j++)
	                arr[i][j] = sc.nextInt();

	       
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                int temp = arr[i][j];
	                arr[i][j] = arr[j][i];
	                arr[j][i] = temp;
	            }
	        }


	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n / 2; j++) {
	                int temp = arr[i][j];
	                arr[i][j] = arr[i][n - 1 - j];
	                arr[i][n - 1 - j] = temp;
	            }
	        }

	        System.out.println("Rotated Matrix:");
	        for (int[] row : arr) {
	            for (int val : row) System.out.print(val + " ");
	            System.out.println();
	        }
	        
	        sc.close();
	    }
	    
}

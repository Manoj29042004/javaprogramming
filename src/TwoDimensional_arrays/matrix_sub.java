package TwoDimensional_arrays;

import java.util.Scanner; 

public class matrix_sub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];

        System.out.println("\nEnter 1st matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nEnter 2nd matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n1st Matrix:");
        for (int[] row : arr1) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
        
        System.out.println("\n2nd Matrix:");
        for (int[] row : arr2) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
        
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr1[i][j]-arr2[i][j];
            }
        }
        
        System.out.println("\nsubtraction  of two Matrix:");
        for (int[] row : result) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
        
        sc.close();

	}

}

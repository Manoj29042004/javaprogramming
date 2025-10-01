package TwoDimensional_arrays;

import java.util.Scanner; 

public class matrix_mul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st matrix rows: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter 1st matrix columns: ");
        int cols1 = sc.nextInt();
        
        System.out.print("Enter 2nd matrix rows: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter 2nd matrix columns: ");
        int cols2 = sc.nextInt();
        
        if(cols1!=rows2) System.out.println("Multiplication is not possible");
        
        else {
        int[][] arr1 = new int[rows1][cols1];
        int[][] arr2 = new int[rows2][cols2];

        System.out.println("\nEnter 1st matrix elements:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nEnter 2nd matrix elements:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
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
        
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
            	for(int k = 0;k < cols1; k++) {
            		result[i][j] += arr1[i][k] * arr2[k][j];
            	}     
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

}

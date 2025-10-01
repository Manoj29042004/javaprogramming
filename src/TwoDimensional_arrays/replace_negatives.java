package TwoDimensional_arrays;

import java.util.Scanner;

public class replace_negatives {
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
        
        System.out.println("Matrix before replacing negatives:");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	if (arr[i][j] < 0) arr[i][j] = 0;
            }
        }

        System.out.println("Matrix after replacing negatives:");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
        
        sc.close();
    }
}


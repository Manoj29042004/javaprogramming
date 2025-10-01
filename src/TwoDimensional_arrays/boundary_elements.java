package TwoDimensional_arrays;

import java.util.Scanner;

public class boundary_elements {
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

        System.out.print("Boundary Elements: ");
        for (int j = 0; j < cols; j++) System.out.print(arr[0][j] + " ");
        for (int i = 1; i < rows; i++) System.out.print(arr[i][cols - 1] + " ");
        for (int j = cols - 2; j >= 0; j--) System.out.print(arr[rows - 1][j] + " ");
        for (int i = rows - 2; i > 0; i--) System.out.print(arr[i][0] + " ");
        
        sc.close();
    }
}


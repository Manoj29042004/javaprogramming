package TwoDimensional_arrays;

import java.util.Scanner;

public class left_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n x n): ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        System.out.print("Left Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][i] + " ");
        }
        
        sc.close();
    }
}

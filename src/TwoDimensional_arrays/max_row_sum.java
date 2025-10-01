package TwoDimensional_arrays;

import java.util.Scanner;

public class max_row_sum {
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

        int maxSum = 0;
        int maxRow = 0;

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) sum += arr[i][j];
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i + 1;
            }
        }

        System.out.println("Row " + maxRow + " has maximum sum = " + maxSum);
        sc.close();
    }
}


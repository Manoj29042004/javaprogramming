package TwoDimensional_arrays;

import java.util.Scanner;

public class min_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int min = arr[0][0];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] < min) min = arr[i][j];
            }
        }

        System.out.println("Matrix:");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        System.out.println("Min = " + min);
        sc.close();
    }
}


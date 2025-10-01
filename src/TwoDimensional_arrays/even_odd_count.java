package TwoDimensional_arrays;

import java.util.Scanner;

public class even_odd_count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int even_count = 0, odd_count = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] % 2 == 0) even_count++;
                else odd_count++;
            }
        }

        System.out.println("Matrix:");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        System.out.println("Even = " + even_count + ", Odd = " + odd_count);
        sc.close();
    }
}

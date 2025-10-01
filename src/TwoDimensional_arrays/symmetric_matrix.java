package TwoDimensional_arrays;

import java.util.Scanner;

public class symmetric_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n): ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean symmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        System.out.println("Matrix:");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        if (symmetric) System.out.println("Symmetric");
        else System.out.println("Not Symmetric");
        sc.close();
    }
}


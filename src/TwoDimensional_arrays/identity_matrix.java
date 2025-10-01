package TwoDimensional_arrays;

import java.util.Scanner;

public class identity_matrix {
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

        boolean identity = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j && arr[i][j] != 1) || (i != j && arr[i][j] != 0)) {
                    identity = false;
                    break;
                }
            }
        }

        System.out.println("Matrix:");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        if (identity) System.out.println("Identity Matrix");
        else System.out.println("Not Identity Matrix");
        
        sc.close();
    }
}

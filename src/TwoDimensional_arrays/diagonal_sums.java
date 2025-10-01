package TwoDimensional_arrays;

import java.util.Scanner;

public class diagonal_sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < n; i++) {
            leftSum += arr[i][i];
            rightSum += arr[i][n - 1 - i];
        }

        System.out.println("Left Diagonal Sum = " + leftSum);
        System.out.println("Right Diagonal Sum = " + rightSum);
        sc.close();
    }
}

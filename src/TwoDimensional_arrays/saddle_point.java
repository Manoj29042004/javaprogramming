package TwoDimensional_arrays;

import java.util.Scanner;

public class saddle_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            int rowMin = arr[i][0], colIndex = 0;
            for (int j = 1; j < n; j++) {
                if (arr[i][j] < rowMin) {
                    rowMin = arr[i][j];
                    colIndex = j;
                }
            }
            boolean saddle = true;
            for (int k = 0; k < n; k++) {
                if (arr[k][colIndex] > rowMin) {
                    saddle = false;
                    break;
                }
            }
            if (saddle) {
                System.out.println("Saddle Point = " + rowMin);
                found = true;
            }
        }
        if (!found) System.out.println("No Saddle Point");
        sc.close();
    }
}

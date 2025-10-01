package TwoDimensional_arrays;

import java.util.Scanner;

public class magic_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        int sum = 0;
        for (int j = 0; j < n; j++) sum += arr[0][j];

        boolean magic = true;

        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) rowSum += arr[i][j];
            if (rowSum != sum) magic = false;
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) colSum += arr[i][j];
            if (colSum != sum) magic = false;
        }

        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += arr[i][i];
            diag2 += arr[i][n - 1 - i];
        }
        if (diag1 != sum || diag2 != sum) magic = false;

        System.out.println(magic ? "Magic Square" : "Not Magic Square");
        sc.close();
    }
}

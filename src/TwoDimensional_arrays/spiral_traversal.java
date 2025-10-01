package TwoDimensional_arrays;

import java.util.Scanner;

public class spiral_traversal {
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

        System.out.println("Spiral Order:");
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) System.out.print(arr[top][j] + " ");
            top++;
            for (int i = top; i <= bottom; i++) System.out.print(arr[i][right] + " ");
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) System.out.print(arr[bottom][j] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(arr[i][left] + " ");
                left++;
            }
        }
        
        sc.close();
    }
}

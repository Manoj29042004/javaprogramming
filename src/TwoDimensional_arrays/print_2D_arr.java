package TwoDimensional_arrays;

import java.util.*;

public class print_2D_arr {
    public static void create_arr() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no.of Rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter no.of Columns: ");
        int cols = sc.nextInt(); 

        int[][] arr = new int[rows][cols]; 

        System.out.print("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nArray :\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void main(String[] args) {
        create_arr();
    }
}


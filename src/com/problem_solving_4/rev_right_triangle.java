package com.problem_solving_4;

import java.util.Scanner;

public class rev_right_triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Pattern: ");
	    int size = sc.nextInt();
	    System.out.println("\nPattern: \n");
	    for(int i=1; i<=size;i++) {
	    	for(int j=1;j<=size;j++) {
	    		if(j<i) System.out.print("  ");
	    		else System.out.print("* ");
	    	}
	    	System.out.println();
	    }
		sc.close();
	}

}

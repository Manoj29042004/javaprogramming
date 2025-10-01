package com.problem_solving_4;

import java.util.Scanner;

public class square_pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Pattern: ");
	    int size = sc.nextInt();
	    System.out.println("\nPattern: \n");
	    for(int i = 0;i < size; i++) {
	    	for(int j = 0;j < size; j++) {
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    } 
		sc.close();
	}

}

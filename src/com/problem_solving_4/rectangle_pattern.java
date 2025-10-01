package com.problem_solving_4;

import java.util.Scanner;

public class rectangle_pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of Pattern: ");
	    int length = sc.nextInt();
	    System.out.print("Enter the width of Pattern: ");
	    int width = sc.nextInt();
	    System.out.println("\nPattern: \n");
	    for(int i = 0;i < length; i++) {
	    	for(int j = 0;j < width; j++) {
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    } 
		sc.close();

	}

}

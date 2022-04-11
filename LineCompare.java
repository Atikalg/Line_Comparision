package com.bridgelab.Assignment_8;

import java.util.Scanner;

/**
 * @author atik Line comparision program
 */
public class LineCompare {
	int x11;
	int x12;
	int y11;
	int y12;
	int x21;
	int x22;
	int y21;
	int y22;

	// Taking input from user
	public void Input() {
		System.out.println("Enter points of lines ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x11 of line 1 ");
		x11 = sc.nextInt();
		System.out.println("Enter the value of x12 of line 1");
		x12 = sc.nextInt();
		System.out.println("Enter the value of y11 of line 1 ");
		y11 = sc.nextInt();
		System.out.println("Enter the value of y12 of line 1 ");
		y12 = sc.nextInt();
		System.out.println("Enter the value of x21 of line 2");
		x21 = sc.nextInt();
		System.out.println("Enter the value of x22 of line 2 ");
		x22 = sc.nextInt();
		System.out.println("Enter the value of y21 of line 2 ");
		y21 = sc.nextInt();
		System.out.println("Enter the value of y22 of line 2 ");
		y22 = sc.nextInt();
	}

	// checking lines are equal or not
	public void compareTo() {
		
		int lengthOfLine1 = (int) Math
				.sqrt((x12 - x11) * (x12 - x11) + (y12 - y11) * (y12 - y11));
		int lengthOfLine2 = (int) Math
				.sqrt((x22 - x21) * (x22 - x21) + (y22 - y21) * (y22 - y21));
		if (lengthOfLine1 == lengthOfLine2)
			System.out.println("Equal");
		if (lengthOfLine1 > lengthOfLine2)
			System.out.println("Line1 is greater than of Line2.");
		if (lengthOfLine1 < lengthOfLine2)
			System.out.println("Line1 is less than of Line2");
	}

	 public void equals()
	    {
	        int m1,m2;
	        m1 = (y12-y11)/(x12-x11);
	        m2 = (y22-y21)/(x22-x21);
	        if(m1 == m2)
	            System.out.println("Two lines are equal.");
	        else
	            System.out.println("Two lines are not equal.");
	    }
	 
	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program ");
		LineCompare obj = new LineCompare();
		obj.Input();
		obj.equals();
		obj.compareTo();
	}
}

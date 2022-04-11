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
		LineCompare obj = new LineCompare();
		int lengthOfLine1 = (int) Math
				.sqrt((obj.x12 - obj.x11) * (obj.x12 - obj.x11) + (obj.y12 - obj.y11) * (obj.y12 - obj.y11));
		int lengthOfLine2 = (int) Math
				.sqrt((obj.x22 - obj.x21) * (obj.x22 - obj.x21) + (obj.y22 - obj.y21) * (obj.y22 - obj.y21));
		if (lengthOfLine1 == lengthOfLine2)
			System.out.println("Equal");
		if (lengthOfLine1 > lengthOfLine2)
			System.out.println("Line1 is greater than of Line2.");
		if (lengthOfLine1 < lengthOfLine2)
			System.out.println("Line1 is less than of Line2");
	}

	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program ");
		LineCompare obj = new LineCompare();
		obj.Input();
		obj.compareTo();
	}
}

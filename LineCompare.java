package com.bridgelab.Assignment_8;

import java.util.Scanner;

/**
 * @author atik
 * Line comparision program
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
	 //Taking input from user
	 public void Input() {
       	 System.out.println("Enter points of lines ");
       	 Scanner sc = new Scanner(System.in); 
       	 System.out.println("Enter the value of x11 of line 1 ");
            x11 = sc.nextInt();
            System.out.println("Enter the value of x12 of line 1");
            int x12 = sc.nextInt();
            System.out.println("Enter the value of y11 of line 1 ");
            int y11 = sc.nextInt();
            System.out.println("Enter the value of y12 of line 1 ");
            int y12 = sc.nextInt();
            System.out.println("Enter the value of x21 of line 2");
            int x21 = sc.nextInt();
            System.out.println("Enter the value of x22 of line 2 ");
            int x22 = sc.nextInt();
            System.out.println("Enter the value of y21 of line 2 ");
            int y21 = sc.nextInt();
            System.out.println("Enter the value of y22 of line 2 ");
            int y22 = sc.nextInt();
       	}
	    public static void main(String args[])
	    {
	        System.out.println("Welcome to Line Comparison Computation Program ");     
	        LineCompare obj = new LineCompare();
	        obj.Input();
	   	//Calculating length of lines
			 int lengthOfLine1=(int) Math.sqrt((obj.x12-obj.x11) * (obj.x12-obj.x11) + (obj.y12-obj.y11) * (obj.y12-obj.y11));
		     System.out.println("Length of Line1 is:"+lengthOfLine1);
	        int lengthOfLine2=(int) Math.sqrt((obj.x22-obj.x21) * (obj.x22-obj.x21) + (obj.y22-obj.y21) * (obj.y22-obj.y21));
	        System.out.println("Length of Line2:"+lengthOfLine2);
	        
	    }
}


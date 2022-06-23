package com.javaprograms;

import java.util.Scanner;

public class EqualityOfLines {
	public static void main(String[] args) {
	Scanner x1 = new Scanner (System.in);
	Scanner x2 = new Scanner (System.in);
	Scanner y1 = new Scanner (System.in);
	Scanner y2 = new Scanner (System.in);
	System.out.println("Enter line1 coordinates: ");
	double num = x1.nextDouble();
	double num2 = x2.nextDouble();
	double num3 = y1.nextDouble();
	double num4 = y2.nextDouble();
	double diff1 = num2-num;
	double diff2 = num4-num3;
	double length1 = Math.sqrt((diff1 * diff1) + (diff2 * diff2));
	System.out.println("length of line1 is" +length1);
	Double l1 = new Double(length1);
	Scanner x3 = new Scanner (System.in);
	Scanner x4 = new Scanner (System.in);
	Scanner y3 = new Scanner (System.in);
	Scanner y4 = new Scanner (System.in);
	System.out.println("Enter line2 coordinates: ");
	double num5 = x3.nextDouble();
	double num6 = x4.nextDouble();
	double num7 = y3.nextDouble();
	double num8 = y4.nextDouble();
	double diff3 = num6-num5;
	double diff4 = num8-num7;
	double length2 = Math.sqrt((diff3 * diff3) + (diff4 * diff4));
	System.out.println("length of line2 is" +length2);
	Double l2 = new Double(length2);
			if(l1.equals(l2))
	System.out.println("Lines are Equal");
	else
	System.out.println("Lines are not Equal");
	
	}

}

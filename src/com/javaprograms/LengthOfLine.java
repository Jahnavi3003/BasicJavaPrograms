package com.javaprograms;

import java.util.Scanner;

public class LengthOfLine {
	public static void main(String[] args) {
	Scanner x1 = new Scanner (System.in);
	Scanner x2 = new Scanner (System.in);
	Scanner y1 = new Scanner (System.in);
	Scanner y2 = new Scanner (System.in);
	System.out.println("Enter 4 values: x coordinates and y coordinates");
	double num = x1.nextDouble();
	double num2 = x2.nextDouble();
	double num3 = y1.nextDouble();
	double num4 = y2.nextDouble();
	double diff1 = num2-num;
	double diff2 = num4-num3;
	double length = Math.sqrt((diff1 * diff1) + (diff2 * diff2));
	System.out.println(length);
	
	}

}

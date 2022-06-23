package com.javaprograms;

public class EmpAttendance {

	public static void main (String[] args) {
		 
		int fulltime = 1;
		double check = Math.floor(Math.random() * 2);
		if (check == fulltime)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}

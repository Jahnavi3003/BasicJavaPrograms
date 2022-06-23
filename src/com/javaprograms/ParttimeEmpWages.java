package com.javaprograms;

public class ParttimeEmpWages {

		public static void main (String[] args) {
			 
			int fulltime = 1;
			int parttime = 2;
			int wageperhour=20;
			int wages=0;
			int Emphrs=0;
			double check = Math.floor(Math.random() * 3);
			if (check == fulltime)
				Emphrs=8;
			else if (check == parttime)
	            Emphrs=4;
			else
				Emphrs=0;
			    wages= Emphrs * wageperhour;
			System.out.println("Employee Daily Wage is " +wages );
	}
}

package com.javaprograms;

public class WagesUsingSwitch {
	public static final int fulltime = 1;
	public static final int parttime = 2;
	
	public static void main (String[] args) {
		 
		int wageperhour=20;
		int wages=0;
		int Emphrs=0;
		int check = (int) Math.floor(Math.random() * 3);
	    switch (check) {
	    case fulltime :
	                   Emphrs=8;
	                   break;
	    case parttime :
		               Emphrs=4;
		               break;
		     default:
			           Emphrs=0;
	    }
		    wages= Emphrs * wageperhour;
		System.out.println("Employee Daily Wage is " +wages );
}

}

	package com.javaprograms;

	public class FixedHrsAndDays {
		
		public static final int fulltime = 1;
		public static final int parttime = 2;
		public static final int totalworkdays = 20;
		public static final int totalworkhrs = 100;
		public static final int wageperhour=20;

			public static void main (String[] args) {
				 
				int totalwages=0;
				int totalhrs=0;
				int Emphrs=0;
				int totalworkingdays=0;
			    while (totalhrs<=totalworkhrs && totalworkingdays < totalworkdays) {
			    totalworkingdays++;
			   
				int rand = (int) Math.floor(Math.random() * 10);
			    switch (rand) {
			    case fulltime:
					          Emphrs=8;
					          break;
			    case parttime:
		                      Emphrs=4;
				              break;
				default:
					          Emphrs=0;
			    }
			    
				totalhrs = totalhrs + Emphrs;
				System.out.println(" Day" + totalworkingdays + " Emp Hours: " + Emphrs);
			   }
				
			    totalwages = totalhrs * wageperhour;
        		System.out.println("Total Employee Wage is " +totalwages );
		}

}

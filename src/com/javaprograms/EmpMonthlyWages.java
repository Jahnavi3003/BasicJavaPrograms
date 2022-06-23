	package com.javaprograms;

	public class EmpMonthlyWages {
		
		public static final int fulltime = 1;
		public static final int parttime = 2;
		public static final int totalworkdays = 20;
		public static final int wageperhour=20;

			public static void main (String[] args) {
				 
				int totalwages=0;
				int wages=0;
				int Emphrs=0;
			    for (int i=1; i<totalworkdays; i++) {
			   
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
			    
				wages= Emphrs * wageperhour;
				totalwages = totalwages + wages;
				System.out.println(" Daily Employee Wage is " +wages );
				
			}
			    
        		System.out.println("Total Employee Wage is " +totalwages );
		}

}
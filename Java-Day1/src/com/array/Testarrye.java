package com.array;

public class Testarrye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int[] Studentage = new int[5];
//		
//		  Studentage[0] =32;
//		  Studentage[1] =21;
//		  Studentage[2] =23;
//		  Studentage[3] =34;
//		  Studentage[4] =24;
//		  
//		  for(int i=0; i<Studentage.length;i++) {
//			  System.out.println("Studentage:" +Studentage[i]);
//		  }

		 double [] StudentMarks = {70,56,90,65,85};
		 
		 double sum = 0 ;
		 double ave =0;
		 
		 for(int i =0; i<StudentMarks.length; i++) {
			 sum = sum + StudentMarks[i];
		 }
		ave = sum / StudentMarks.length;
		System.out.println("The sum of student mark is " + sum);
		System.out.println("The average of student mark is " + ave);
	}
}
	
		


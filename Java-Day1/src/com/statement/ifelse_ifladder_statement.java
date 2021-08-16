package com.statement;

import java.util.Scanner;

public class ifelse_ifladder_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int marks = 80;
//		if(marks < 50) {
//			System.out.println("fail");
//		}
//		else if (marks >= 50 && marks <60) {
//			System.out.println("D");
//		}
//		else if (marks >=60 && marks < 70) {
//			System.out.println("C");
//		}
//		else if (marks >= 70 && marks <80) {
//			System.out.println("B");
//		}
//		else if (marks >=80 && marks < 90) {
//			System.out.println("A");
//		}
//		else if(marks >=90 && marks <100) {
//			System.out.println("A+");
//		}
//		else {
//			System.out.println("Invalid");
//		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your day:");
		int day = input.nextInt();

	

		 if(day == 7) {
			System.out.println("Sunday");
		}
		else if(day ==6) {
			System.out.println("Saturday");
		}
		else if(day==5) {
			System.out.println("Friday");
		}
		else if(day ==4) {
			System.out.println("Thursday");
			
		}
		else if(day == 3) {
			System.out.println("Wensday");
		}
		else if(day==2) {
			System.out.println("Tuseday");
		}
		else if(day==1) {
			System.out.println("Monday");
		}
		else {
			System.out.println("Invalid");
		}
	}

}

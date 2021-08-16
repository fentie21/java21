package com.statement;

import java.util.Scanner;

public class ifelse_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int marks = 50;
//		if (marks > 65) {
//			
//			System.out.println("Passed");
//		}
//		else {
//			System.out.println("Fail");
//		}

//	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your student maeks:");
		int marks = input.nextInt();
		

		if (marks > 65) {
			
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
//		}
		
		
	}	}
}



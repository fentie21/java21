package com.statement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int day = 5;
//		String dayName;
//		switch(day) {
//		
//		case 1:
//		dayName = "Today is Monday";
//		break;
//		
//		case 2:
//			dayName = "Today is Tuesday";
//			break;
//			
//		case 3:
//			dayName = "Today is Wednesday";
//			break;
//			
//		case 4:
//			dayName = "Today is Thursday";
//			break;
//			
//		case 5:
//			dayName = "Today is Firday";
//			break;
//			
//		case 6:
//			dayName = "Today is Saturday";
//			break;
//			
//		case 7:
//			dayName = "Today is Sunday";
//			break;
//			
//			default:
//				dayName = "Invalid";
//				break;
//		}
//				
//				System.out.println(dayName);
		
		Scanner input = new Scanner(System.in);
		System.out.println("pls enter day");
		int day = input.nextInt();
		
		String dayName;
		switch (day) {
	
		case 1:
			System.out.println ("Monday:");
			break;
		case 2:
		System.out.println("Tuesday: ");
			break;
		case 3:
		System.out.println ("Wednesday:");
			break;
		case 4:
			System.out.println("Thursday:");
			break;
		case 5:
			System.out.println("Friday:");
			break;
		case 6:
			System.out.println("Satrday:");
			break;
		case 7:
	System.out.println("Sunday:");
			break;
			default:
				
				System.out.println("Invalid");
				}
		
		
	}

}

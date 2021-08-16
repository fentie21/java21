package com.statement;

import java.util.Scanner;

public class swich_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         int day = 2;
//		String dayName;
//		switch (day) {
//		
//		case 1:
//			dayName = "Monday";
//			break;
//		case 2:
//			dayName = "Tuesday";
//			break;
//		case 3:
//			dayName = "Wednesday";
//			break;
//		case 4:
//			dayName = "Thursday";
//			break;
//		case 5:
//			dayName = "Friday";
//			break;
//		case 6:
//			dayName = "Satrday";
//			break;
//		case 7:
//			dayName = "Sunday";
//			break;
//			default:
//				dayName ="Invalid";
//				
//		}
//		System.out.println(dayName);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your day");
		int day =input.nextInt();
				
		 
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



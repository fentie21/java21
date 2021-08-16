package com.array;

import java.util.Scanner;

public class Testarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arraySize = input.nextInt();
	
		int arrayElement [] = new int[arraySize];
		
		for(int i = 0;i<arrayElement.length;i++) {
		System.out.println("Enter the " + i+1 + "Element");
		arrayElement[i] = input.nextInt();
		}
		
//		for(int i = 0;i<arrayElement.length;i++) {
//			System.out.println(arrayElement[i] + " ,");
//		}
	}
}

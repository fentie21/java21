package com.icrafe;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("pls enter your fullname:");
	    String fullName = in.nextLine();
	    
	    System.out.println("pls enter your age:");
	    int age = in.nextInt();
	    
	    System.out.println("pls enter your salary:");
	    double salary = in.nextDouble();
	    
	    System.out.println("pls enter your bonus:");
	    double bonus = in.nextDouble();
	    
	    double totalSalary = in.nextDouble();
	    
	    System.out.println("fullName:" + fullName);
		System.out.println("age:" + age);
		System.out.println("salary:" + salary);
		System.out.println("bonus:" + bonus);
		System.out.println("totalSalary:" + totalSalary); 
		

	}
	
}

package com.practies;

import java.util.Scanner;

public class FirstLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          System.out.println("hello world:");       //first lab
		
//		String name = "Alex";                         // second lab
//		int age = 29;
//		double salary = 2000;
//		
//		System.out.println(" Name :" + name);
//		System.out.println("Age : " + age);
//		System.out.println("Salary : " +salary);
		
		Scanner in = new Scanner(System.in);           //thired lab
		
		System.out.println("pls enter your name");
		String name = in.nextLine();
		
		
		System.out.println("pls enter your age");
		int age = in.nextInt();
		
		
		System.out.println("pls enter your salary");
		double salary = in.nextDouble();
		
		System.out.println("Name :" + name);
		System.out.println("age :" + age);
		System.out.println("salary :" + salary);
		
		in.close();
	}

}

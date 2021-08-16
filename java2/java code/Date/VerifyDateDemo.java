package com.Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class VerifyDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("pls enter Date: ");
		String input = in.nextLine();
		
		System.out.println("Given date is " + input);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		
		try {
			Date dt = sdf.parse(input);
			System.out.println(dt);
		}
		catch(Exception e) {
			System.out.println("Invalid date :" + input);
			
		}
	
	}

}

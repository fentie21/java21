package com.Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompairingDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("pls enter the first Date ->dd-MM-yyyy ");
		String input1 = in.nextLine();
		
		System.out.println("pls enter the second Date ->dd-MM-yyyy ");
		String input2 = in.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		
		try {
			Date d1 = sdf.parse(input1);
			Date d2 = sdf.parse(input2);
			System.out.println(d1.compareTo(d2));
		}
		catch(Exception e) {
			System.out.println("Invalid date :");
			
		}
	}

}

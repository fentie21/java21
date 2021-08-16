package com.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		System.out.println("current date " + date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String str1 = sdf.format(date);
		
		System.out.println("current date " + str1);

		SimpleDateFormat sdf2 =  new SimpleDateFormat("ss:mm:hh");
		
		String str2 = sdf2.format(date);
		
		System.out.println("current hour " + str2);
	}

}

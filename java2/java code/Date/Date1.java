package com.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Date date = new Date();
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//		
//		String date1 = sdf.format(date);		
//		
//		System.out.println("curent date " + date1);
		
//	Date date2 = new Date();
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
//		
//		String time = sdf.format(date2);		
//		
//		System.out.println("curent time " + time);
		
//		  SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
//			      sdf.setLenient(false);
//			      String input = "31-02-2018"; 
//			      System.out.print("Given Date is:"+ input); 
//			      Date  dt;
//			      try {
//			         dt = sdf.parse(input); 
//			          System.out.println(dt); 
//			      } catch (ParseException e) { 
//			         System.out.println("Invalid date entered :" + input); 
//			      }
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
		   String str1 = "12-02-2021";
		   String str2 = "12-02-2021";
		   try{
		   Date d1 =sdf.parse(str1);
		   Date d2 = sdf.parse(str2);
		   System.out.println(d1.compareTo(d2));
		     }
		catch(ParseException pe){System.out.println("Invalid date given");}

	}

}

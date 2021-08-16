package com.String;

public class TestStringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Concatenation by + (string concatenation) operator

//		String a = "Alex" + "Tsgu";
		
//		System.out.println(a);      // AlexTsgu
		
//		String a = 30 +50 + "Tsgu" + 40 + 50;
		
//		System.out.println(a);                        //80Tsgu4050
		
		
		//String Concatenation by concat() method
		
//		String a = "Alex";
//		String b = "Tsgu";
//		
//		System.out.println(a.concat(b));
		
		String a = "Alex";
		String b = "Tsgu";
		String c = b.concat(b);
		
		System.out.println(c);
	}

}

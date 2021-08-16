package com.String;

public class TestStringComparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
             //By using equals()method
		
		
//		String s1 = "alex";
//		String s2 = "tsgu";
//		String s3 = new String("tsgu");
//		String s4 = "alex";
//		
//		
//		System.out.println(s1.equals(s2));  // false
//		System.out.println(s1.equals(s4));  //true
//		System.out.println(s2.equals(s3));  //true
		
		// equalsIgnoreCase
		
//		String a = "alex";
//		String b = "ALEX";
//		String c = "tsgu";
//		
//		System.out.println(a.equals(b));               // false
//		System.out.println(a.equalsIgnoreCase(b));     // true
//		System.out.println(a.equalsIgnoreCase(c));     //false
		
		
		//By using == operator
		
//		  String s1="alex";  
//		   String s2="alex";  
//		   String s3=new String("alex");  
//		   System.out.println(s1==s2);//true (because both refer to same instance)  
//		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
		   
		   // By Using compareTo() method
		
		String a = "Alex";
		String b = "Tsgu";
		String c = new String("Alex");
		
		System.out.println(a.compareTo(b));       //-
		System.out.println(a.compareTo(c));       //0
		System.out.println(b.compareTo(a));       //+
		
	}

}

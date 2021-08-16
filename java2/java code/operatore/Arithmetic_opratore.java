package com.operatore;

public class Arithmetic_opratore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;
		int b = 2;
		
	   int c = a + b;
	   System.out.println("add: " + c);
	   
	    c = a - b;
	    System.out.println("sub: " + c);
	    
	    c = a / b;
	    System.out.println("div: " + c);
	    
	    c = a * b;
	    System.out.println("mult: " + c);
	    
	     b = 3;
	    c = a%b;
	    System.out.println("remender: " + c);
	    
	    a = ++a;
	    System.out.println("incriment: " + a);
	    
	    a = --a;
	    System.out.println("decriment: " + a);
	    
	}

}

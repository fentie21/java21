package com.operatore;

public class Assignment_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a , b , c;
		a = 20;
		b = 10;
		c = 0;
		 
		c = a + b;
		System.out.println("a + b =" +c);
		
		c +=a;
		System.out.println("c +=a =" + c);
		
		c -=a;
		System.out.println("c -=a =" + c);
		
		c *=a;
		System.out.println("c *=a =" + c);
		
		c /=a;
		System.out.println("c /=a =" + c);
		
		a = 3;
		c = 20;
		
		c %=a;
		System.out.println("c %=a =" + c);
		
	      c <<= 2 ;
	      System.out.println("c <<= 2 = " + c );
	            c >>= 2 ;
	      System.out.println("c >>= 2 = " + c );
	            c >>= 2 ;
	      System.out.println("c >>= 2 = " + c );
	            c &= a ;
	      System.out.println("c &= a  = " + c );
	            c ^= a ;
	      System.out.println("c ^= a   = " + c );
	            c |= a ;
	      System.out.println("c |= a   = " + c );

	}

}

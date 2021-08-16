package com.operatore;

public class Bitwise_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a , b , c ;
		a = 4;
		b = 3;
		c = 0;
		
		c = a | b;
		System.out.println("a | b =" + (a | b));
		
		c = a & b;
		System.out.println("a & b =" + (a & b));
		
		c = a ^ b;
		System.out.println("a ^ b =" + (a ^ b));
		
		a = a >> 2;
		System.out.println("a >> 2 =" + (a >> 2));
		
		a = a << 2;
		System.out.println("a << 2 =" + (a << 2));
		
		a = ~ a;
		System.out.println("a = ~ a =" +(a = ~a));
	}

}

package com.variable1;

public class InstanceVariable {

	String name = "Alex";                                   //instance variable
	
	public void mthode1() {
		
		int a = 5;                                    // local variable
		System.out.println("value of a: " +a);
		System.out.println("value of name " + name);
	}
	
	public void method2() {
		int b = 4;
		System.out.println("value of b " + b);
		System.out.println("value of name " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariable y1 = new InstanceVariable();
		
		y1.mthode1();
		y1.method2();

	}

}

package com.variable1;


public class LocalVariable {

	public void methodOne() {
		int j = 20;                              //local variable
		System.out.println("j :" + j);
	
	}
	public void methodTwo() {
		int k = 12;
		System.out.println("k :" + k);
//		System.out.println("j :" + j);             //error
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalVariable m1 = new LocalVariable();
		
		m1.methodOne();
		m1.methodTwo();
		
		
	}

}

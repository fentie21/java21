package com.variable;

public class LocaleVariableDemo {

	public void methodOne() {
		int j = 25; //local variable
		System.out.println("The value of j:" + j);
		}
	public void methodTwo() {
		int k =30;   // local variable
		System.out.println("The value of k:" + k);
//		System.out.println("The value of j:" + j);
	}
	public static void main(String[] args) {
//		TODO Auto-generated method stub
		
		LocaleVariableDemo m1 = new LocaleVariableDemo();
		
	m1.methodOne();
	m1.methodTwo();
	}

}

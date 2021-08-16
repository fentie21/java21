package com.overload;

public class MethodOverloadDemo {

	public int add(int a) {
		return a+a;
	}
		public int add(int a, int b) {
			return a+b;
		
	}
		public double add(int a, double b) {
			return a + b;
		}
		public int add(int a, int b,int c) {
			return a+b+c;
		}
		public int add(int a, int b,int c,int d) {
			return a+b+c+d;
					
		}
		public double add(int a, double b,int c) {
			return a+b+c;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MethodOverloadDemo m1 = new  MethodOverloadDemo();
     
     double returnVall = m1.add(10,20,3);
     System.out.println("add of number:" +returnVall);
     
     int returnadd = m1.add(20,45,70,30);
     System.out.println("Add vall :" +returnadd);
     
	}

}

package com.variable;

public class InstanceVariableDemo {
  int age =32; //<--- InstanceVriable
  public void methodOne() {
	  int i = 10;  // local variable
	  System.out.println("Value of i:" + i);
	  System.out.println("Value of age:" + age);
  }
public void methodTwo() {
	int k =30; // local variable
	System.out.println("Value of k:" + k);
	System.out.println("Value of age:" + age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InstanceVariableDemo m1 = new InstanceVariableDemo();
m1.age = 22;
m1.methodTwo();
System.out.println();
InstanceVariableDemo m2 = new InstanceVariableDemo();
m2.methodOne();
	}

}

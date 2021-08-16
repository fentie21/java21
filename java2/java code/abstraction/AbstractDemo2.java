package com.abstraction;

abstract class Figuer1{
	double dim1,dim2;
	
	 Figuer1(double a,double b){
		dim1 =a;
		dim2 =b;
	}
	abstract double area();
}
class Rectangle extends Figuer1{

	Rectangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
	       System.out.println("Inside area of rectangle");
		// TODO Auto-generated method stub
		return dim1 * dim2;
	}		
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Figuer1 fg = new Rectangle(9,5);
	     System.out.println(fg.area());


	}

}

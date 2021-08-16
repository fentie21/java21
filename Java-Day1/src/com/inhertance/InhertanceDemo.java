package com.inhertance;

class Calculation{
	int z;
	public void addation(int x , int y) {
		z = x +y;
		System.out.println("Addation :" +z);
	}
	public void substraction(int x, int y) {
		z =x -y;
		System.out.println("sub :" +z);
	}
}

class My_Calculation extends Calculation{
	int z;
	public void multiplication(int x,int y) {
		z = x * y;
		System.out.println("mult :" +z);
	}
	
}
class My_Calculation2 extends My_Calculation{
	int z;
	public void division(int x,int y) {
		z = x / y;
		System.out.println("div :" + z);
	}
}
public class InhertanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_Calculation2 calc = new My_Calculation2();
		calc.addation(20, 10);
		calc.division(40, 2);
		calc.multiplication(20, 2);
		calc.substraction(40, 20);

	}

}

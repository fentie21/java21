package com.abstraction;

abstract class Figer{
	abstract void calcArea(int length,int wedth);
	
}
class FigerImp extends Figer{

	@Override
	void calcArea(int length, int wedth) {
		// TODO Auto-generated method stub
		double rectArea = length * wedth;
		System.out.println("The rectArea " + rectArea);
	}
	
}

public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FigerImp a = new FigerImp();
		a.calcArea(20, 30);
	}

}




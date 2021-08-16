package com.statement;

public class IfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark = 90;
		if(mark < 50) {
			System.out.println("Fail");
		}
		else if(mark >= 50 && mark <60){
			System.out.println("grade D");
		}
		else if(mark >= 60 && mark < 70){
			System.out.println("grade C");
		}
		else if(mark >=70 && mark < 80){
			System.out.println("grade B");
		}
		else if(mark >= 80 && mark <90){
			System.out.println("grade A");
		}
		else if(mark >=90 && mark <= 100){
			System.out.println("grade A+");
		}
		else {
			System.out.println("Invalid");
		}
	}

}

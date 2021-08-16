package com.statement;

public class ReturnStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k =25; k< 31; k++){
			new ReturnStatement().checkEven(k);
		}
	}
	public boolean checkEven(int a){
		if (a%2 == 0){
			System.out.println(a + " is even number");
			return true;
		}
		System.out.println(a + " is odd number");
		return false;
	}

}

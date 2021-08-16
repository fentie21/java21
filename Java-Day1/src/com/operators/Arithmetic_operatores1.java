package com.operators;

public class Arithmetic_operatores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       int a,b,c;
       a = 30;
       b = 10;
       
       c = a + b;
       System.out.println("Add : " +c);
       
       c = a - b;
       System.out.println("sub : " + c);
       
       c = a/b;
       System.out.println("div : " + c);
       
       c = a* b;
       System.out.println("mult : " + c);
       
       b = 7;
        c =a%b;
        System.out.println("reminder : " + c);
        
        a = ++a;
        System.out.println("increment :" + a);
        
        a = --a;
        System.out.println("decrement : " + a);
	}

}

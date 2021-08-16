package com.statement;

public class ContinuStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		for(int i =1; i <= 10; i++ ) {
//			if(i == 5) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		int i=1;	                                       //continue in while loop
    	while (i < 10) {
    	  if (i == 5) {
    	    i++;
    	    continue;
    	  }
    	  System.out.println(i);
    	  i++;
    	}
	}

}

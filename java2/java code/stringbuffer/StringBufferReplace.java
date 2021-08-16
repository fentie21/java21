package com.stringbuffer;

public class StringBufferReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer b = new StringBuffer("Hello");
		b.replace(1, 4, "Alex");
		
		System.out.println(b);
	}

}

package com.fileinoutput;

import java.io.FileInputStream;
import java.io.PrintStream;

public class BytStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream in = new FileInputStream("C:\\Users\\Alex\\Documents\\file\\.input.txt"); 
			FileInputStream out = new FileInputStream("C:\\Users\\Alex\\Documents\\file\\output.txt");
			
			int i;
			
			while((i = in.read()) != -1) {
//				System.out.println((char)i);
                    out.write(i);
			}
			in.close();
			
					}catch(Exception ex) {
						System.out.println("Enter in file write/read " + ex.getMessage());
					}
	}

}

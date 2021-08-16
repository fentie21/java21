package com.statement;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		for(int i=1;i<=10;i++){             // break statement
//	        if(i==8){
//
//	            break;  
//	        }  
//	System.out.println(i);  	
//	    }  

//		int i=1;                         //break in do while loop
//		do{  
//			if(i==15){  
//			i++;  
//				break; 
//			}  
//			System.out.println(i);  
//			i++;  
//		}while(i<=20); 
		
		for(int i=1;i<=2;i++){                      //break in innermost loop
            for (int j = 0; j <=3; j++) {
				if(j==2)
					break;
				System.out.println(j);
			}          
        }

	}

}

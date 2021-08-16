package com.array;

public class TwoDimensionArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int student [] [] = { {50,65,70},
                {55 ,68,75},
                {57,61,78},
                {59 ,60,71}};
	  System.out.println(" student marks");
	  
//	  try {
//     student[2][3] =12;
//     System.out.println(2/3);
//	  }
//	  catch(Exception e) {
//		  System.out.println("The index is invalid");
//	  }
     
            for(int i=0;i<student.length;i++){
        
      System.out.println("Student:"+ i+1);
            for(int j=0;j<student[i].length;j++){
          
      System.out.println(student[i][j] + " ");
        }
       System.out.println();
    }

	}

}

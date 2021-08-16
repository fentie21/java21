package com.variable; 

public class StaticVariableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//       System.out.println("emloy city: " + InfoClass.city);
//       System.out.println("emloy name: " + InfoClass.name);
//       System.out.println("emloy age: " + InfoClass.age);
        
        InfoClass m1 = new InfoClass();
        
        m1.city =" adiss";
        m1.name = "marta";
        
      System.out.println("emloy city in m1: " + m1.city);
      System.out.println("emloy name in m1: " + m1.name);
      System.out.println("emloy age in m1: " + m1.age);
      
      InfoClass m2 = new InfoClass();
      
      System.out.println("emloy city in m2: " + m2.city);
      System.out.println("emloy name in m2: " + m2.name);
      System.out.println("emloy age in m2: " + m2.age);
        
	}       

}

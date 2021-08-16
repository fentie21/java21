package com.abstraction;

abstract class Figure {
    abstract  void calcArea(double length);
      }  

class FigureImpl extends Figure{
   void calcArea(double length){
            double result = length * length;
            System.out.println("Area of rectangle is:"+result);
               }
          }

public class CalcDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FigureImpl fimpl = new FigureImpl();
        fimpl.calcArea(25);
	}

}

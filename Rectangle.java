package com.Chapter_3_ko_Assignment;
/*8.Write a program to print the area of two rectangle having sides(4,5) and (5,8)
    respectively by creating a class named 'Rectangle' with a method named 'returnArea'
    which returns the area and length and breadth passed as parameter to it's constructors. */

public class Rectangle {
	int length,breadth;

	
     Rectangle(int l,int b)
	{
		
		length = l;
	    breadth = b;
	}
    float returnArea()
     {
    	 return length*breadth;
     }
	
	public static void main(String[] args) {
		Rectangle rect =new Rectangle(4,5);
		Rectangle recta =new Rectangle(5,8);
		
		
		System.out.println("\nThe Area of first rectangle is:"+rect.returnArea());
		System.out.println("\nThe Area of second rectangle is:"+recta.returnArea());
			

	}

}

package com.Chapter_3_ko_Assignment;
/*7.Write a program to print the area of rectangle by creating a class named 'Area' taking  
    values of it's length and breadth as parameter of it's constructor and having a method 
    named 'returnArea' which returns the area of rectangle.Length and breadth of rectangle
     are entered through keyboard. */

import java.util.Scanner;

public class Area {
	int length,breadth;
	
	Area(int l, int b)
	{
		length=l;
		breadth=b;
	}
	float returnArea()
	{
		return length*breadth;
	}
	void display()
	{
		System.out.print("\nThe Area of Rectangle is:"+returnArea());
	}

	public static void main(String[] args) {
		
		
		Scanner a =new Scanner(System.in);
		System.out.print("Enter the length:");
		int l=a.nextInt();
		System.out.print("Enter the breadth:");
		int b=a.nextInt();
		Area rect = new Area(l,b);
			
		rect.display();		
		

	}

}

package com.Chapter_3_ko_Assignment;

public class Count {
	static int counter=0;
	Count()
	{
		counter++;
	}
	void disp()
	{
		System.out.println("There are"+" "+counter+" "+"object.");
	}
	public static void main (String[]args)
	{
		Count a= new Count();
		Count b= new Count();
		Count c= new Count();
		
		c.disp();
		
	}

}

package com.dev;

public class DataTypeCasting {

	public static void main(String[] args) {
		int num=10; //integer
		double myDouble=num; //wide or automatic type cast, small to large
		System.out.println("The output is" +num); 
		System.out.println("The output is" +myDouble);
		
		double myDouble1=9.876; //double
		int myInt=(int)myDouble; //narrow cast large to small
		System.out.println("The Value  is" +myDouble);
		System.out.println("The Value is" +myInt);	
	}
}

package com.dev;
import java.util.Scanner;
public class ConvertDataType {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numeric string");
		String str=s.nextLine();
		
		int myInt=Integer.parseInt(str);
		float myFloat=Float.parseFloat(str);
		double myDouble=Double.parseDouble(str);
		long myLong=Long.parseLong(str);
		 
		System.out.println("Integer is " +myInt);
		System.out.println("Float is " +myFloat);
		System.out.println("Double is " +myDouble);
		System.out.println("Long is " +myLong);
	
	}

}

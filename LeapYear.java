package com.dev;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=scan.nextInt();
		if(year%4==0)
		{
			System.out.println("This is a leap year");
		}
		if (year%4!=0)
		{
		System.out.println("This is not a leap year");
	}
}
}

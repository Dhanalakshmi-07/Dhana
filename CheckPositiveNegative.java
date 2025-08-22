package com.dev;
import java.util.Scanner;
public class CheckPositiveNegative {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		if(num>0)
		{
			System.out.println("This is positive number");
		}
		if(num<0)
		{
			System.out.println("This is  negative number");
		}
		if(num==0)
		{
			System.out.println("The number is Zero");
		}
		
		
	}

}

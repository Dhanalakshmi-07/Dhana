package com.dev;
import java.util.Scanner;
public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int val=scan.nextInt();
		if(val%2==0)
		{
			System.out.println("The numbe is Even");
		}
		if(val%2!=0)
		{
			System.out.println("The numbe is Odd");
		}
	}

}

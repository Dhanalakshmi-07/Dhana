package com.dev;

public class WrapperClass {

	public static void main(String[] args) {
	 int num=50;
	 byte b=10;
	 short s=20;
	 long l=50;
	 float f= 2.67f;
	 char c='A';
	boolean b1=true;
	double d=23.678d;
	
	//Autoboxinig : convert primitive data type to object
	
  Integer intobj=num; //Integer is class of int data type
  Byte bytobj=b;  //Byte is class of byte data type
  Short shotobj=s;  //Short is class of short data type
  Long longobj=l;  //Long is class of long  data type
  Float floatobj=f;   //Float is class of float data type
  Character charobj=c;  //Character is class of char data type
  Boolean boolobj=b1;  //Boolean is class of bool data type
  Double doubobj=d;   //Double is class of double  data type
  
  System.out.println("Autoboxing");
  System.out.println();
  System.out.println("Integer value is " +intobj);
  System.out.println("Byte value is " +bytobj);
  System.out.println("Short value is " +shotobj);
  System.out.println("Long value is " +longobj);
  System.out.println("Float value is " +floatobj);
  System.out.println("Character value is " +charobj);
  System.out.println("Boolean value is " + boolobj);
  System.out.println("Double value is " +doubobj);
		
  System.out.println();
  System.out.println("Unboxing");
  //unboxing : convert obj to primitive data type
  System.out.println();
Integer intval=intobj;
Byte bytval=bytobj;
Short shotval=shotobj;
Long longval=longobj;
Float floatval=floatobj;
Character charval=charobj;
Boolean boolval=boolobj;
Double doubval=doubobj;


System.out.println("Integer value is " +intval);
System.out.println("Byte value is " +bytval);
System.out.println("Short value is " +shotval);
System.out.println("Long value is " +longval);
System.out.println("Float value is " +floatval);
System.out.println("Character value is " +charval);
System.out.println("Boolean value is " + boolval);
System.out.println("Double value is " +doubval);

	}

}

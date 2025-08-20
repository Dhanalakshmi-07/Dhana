package com.dev;

public class CelciusKelvinFahrenheit {

	public static void main(String[] args) {
		int Celcius=20,kelvin=15,Fahrenheit=10;
		
		float Celcius1=(Celcius*9/5)+3;
		float Celcius2= Celcius+273.15f;
		float kelvin1 = kelvin-273.15f;
		float kelvin2=(kelvin-273.15f)*9/5+32;
		float Fahrenheit1=(Fahrenheit-32)*5/9;
		float Fahrenheit2=(Fahrenheit-32)*5/9+273.15f;
		
		double myDouble=Celcius1;
		double myDouble1=Celcius2;
		double myDouble2=kelvin1;
		double myDoule3=kelvin2;
		double myDoule4=Fahrenheit1;
		double myDoule5=Fahrenheit2;
		
		System.out.println("Celcius convert to Fahrenheit " +Celcius1+ "°F" );
		System.out.println("Celcius convert to kelvin " +Celcius2+ "°K");
		System.out.println("kelvin convert to celsius " +kelvin1+ "°C");
		System.out.println("kelvin convert to Fahrenheit " +kelvin2+ "°F");
		System.out.println("Fahrenheit convert to celcius " +Fahrenheit1+ "°C");
		System.out.println("Fahrenheit convert to kelvin " +Fahrenheit2+ "°K");
		
		
	}

}

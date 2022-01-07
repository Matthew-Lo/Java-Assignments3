package com.perscholas.java_basics;

import java.util.Scanner;

public class TimeTempFloat {

	public static void main(String[] args) {
		//displaying time
		System.out.println("Enter time in Seconds: ");
		Scanner input = new Scanner(System.in);
		int tempTime=input.nextInt();
		System.out.println(tempTime/60+"min and "+ tempTime%60+"sec");
		
		//Converting Temperature
		System.out.println("enter temperature in fahrenheit: ");
		double fahrenheit=input.nextDouble();
		double celsius = (5.0 / 9.0) * (fahrenheit-32.0);
		System.out.println("fahrenheit: "+fahrenheit+"\ncelsius: "+celsius);
		
		//floating point sales tax
		System.out.println("enter price : ");
		double sales=input.nextDouble();
		System.out.printf("$%.2f",sales*(8.875/100.0));
	}

}

package com.perscholas.java_basics;

import java.util.Random;
import java.util.Scanner;

public class ConditionalStatementsSlides {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		System.out.println("Slide 12: ");
//		number12(input.nextInt());
//		
//		System.out.println("Slide 15: ");
//		number15(input.nextInt());
//		
//		System.out.println("Slide 23: ");
//		number23(input);
//
		System.out.println("Slide 43: ");
		number43(input);

		System.out.println("Slide 47: ");
		number47(input);
		
		input.close();
	}
	private static void number12(int input)
	{
		int num=input;
		if (num%2==0 && num%3==0)
		{
			System.out.println("\t"+num+" is divisable by 2 AND 3");
		}
		if (num%2==0 || num%3==0)
		{
			
			System.out.println("\t"+num+" is divisable by 2 OR 3");
		}
		if(num%2==0 ^ num%3==0)
		{
			System.out.println("\t"+num+" is divisable by 2 XOR 3");
		}
	}
	private static void number15(int input) {
		int year = input;
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if (isLeapYear)
			System.out.println("\tLeap Year");
		else
			System.out.println("\tNot a Leap Year");
	}
	private static void number23(Scanner input) {
		Random rand=new Random();
		int intRandom=rand.nextInt(100);
		System.out.println("\tFor Testing: "+intRandom);
		int guess= input.nextInt();
		if (guess>=100)
		{
			System.out.println("\tNumber is too big");
		}
		else if (guess==intRandom)
		{
			System.out.println("\t$5,000");
		}
		else if (intRandom%10==guess/10 && intRandom/10==guess%10) {
			System.out.println("\t$1,000");
		}
		else if(intRandom%10==guess/10 || intRandom%10==guess%10 ||
				intRandom/10==guess/10 || intRandom/10==guess%10) 
		{
			System.out.println("\t$250");
		}
		else {
			System.out.println("\t$0");
		}
	}
	private static void number43(Scanner input)
	{
		System.out.println("\tEnter weight in kg: ");
		double weight= input.nextDouble();
		System.out.println("\tEnter height in meters: ");
		double height=input.nextDouble();
		double bmi= weight/(height*height);
		if (bmi<18.5)
		{
			System.out.println("\tUnderweight");
		}
		else if (bmi<25)
		{
			System.out.println("\tNormal");
		}
		else if (bmi<30)
		{
			System.out.println("\tOverweight");			
		}
		else if (bmi>=30)
		{
			System.out.println("\tObese");			
		}
	}
	private static double filer1(double income)
	{
		if (income<8350)
		{
			return income*0.1;
		}
		else if (income< 33950)
		{
			return income*0.15;
		}
		else if (income< 82250)
		{
			return income*0.25;
		}
		else if (income< 171550)
		{
			return income*0.28;
		}
		else if (income< 372950)
		{
			return income*0.33;			
		}
		return income*0.35;
	}
	private static double filer2(double income)
	{
		if (income<16700)
		{
			return income*0.1;
		}
		else if (income< 67900)
		{
			return income*0.15;
		}
		else if (income< 137050)
		{
			return income*0.25;
		}
		else if (income< 208850)
		{
			return income*0.28;
		}
		else if (income< 372950)
		{
			return income*0.33;			
		}
		return income*0.35;
	}
	private static double filer3(double income)
	{
		if (income<8350)
		{
			return income*0.1;
		}
		else if (income< 33950)
		{
			return income*0.15;
		}
		else if (income< 68525)
		{
			return income*0.25;
		}
		else if (income< 104425)
		{
			return income*0.28;
		}
		else if (income< 186475)
		{
			return income*0.33;			
		}
		return income*0.35;
	}
	private static double filer4(double income)
	{
		if (income<11950)
		{
			return income*0.1;
		}
		else if (income< 45500)
		{
			return income*0.15;
		}
		else if (income< 117450)
		{
			return income*0.25;
		}
		else if (income< 190200)
		{
			return income*0.28;
		}
		else if (income< 372950)
		{
			return income*0.33;			
		}
		return income*0.35;
	}
	private static void number47(Scanner input)
	{
		System.out.println("\tFiling status:\n\t\t1: Single\t2: Married"
				+ "\t3: Married Filing Separately\t4: Head of Household");
		int fStatus=input.nextInt();
		System.out.println("\tEnter Taxable Income: ");
		int income=input.nextInt();
		switch (fStatus)
		{
			//you probably ought to 
			case 1: System.out.println("\t"+filer1((double)income)); break;
			case 2: System.out.println("\t"+filer2(income)); break;
			case 3: System.out.println("\t"+filer3(income)); break;
			case 4: System.out.println("\t"+filer4(income)); break;
		}
	}
}

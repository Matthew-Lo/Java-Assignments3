package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlowConditionalStatements {

	public static void main(String[] args) {
		System.out.println("Question 1: ");
		question1();
		System.out.println("Question 2: ");
		question2();
		System.out.println("Question 3: ");
		question3();
		System.out.println("Question 4: ");
		question4();
		Scanner scan = new Scanner(System.in);
		System.out.println("Question 5: ");
		question5(scan);
		System.out.println("Question 6: ");
		question6(scan);
		scan.close();
	}
	private static void question1() {
		int x =7;
		//x=15;
		if (x<10)
		{
			System.out.println("\tLess than 10");
		}	
	}
	private static void question2() {
		int x=7;
		x=15;
		if (x<10)
		{
			System.out.println("\tLess than 10");
		}
		else
		{
			System.out.println("\tGreater than 10");
		}
	}
	private static void question3()
	{
		int x =15;
		x=50;
		if (x<10)
		{
			System.out.println("\tLess than 10");
		}
		else if (x>=10 && x<20)
		{
			System.out.println("\tBetween 10 (inclusive) and 20");
		}
		else if (x>=20)
		{
			System.out.println("\tGreater than 20");
		}
	}
	private static void question4()
	{
		int x =15;
//		x=5;
		if (x<10 && x>20)
		{
			System.out.println("\tOut of range");
		}
		else
		{
			System.out.println("\tin range");
		}
	}
	private static void question5(Scanner scan)
	{
		int x= scan.nextInt();
		if (x<=100 &&x >=90)
		{
			System.out.println("\tA");
		}
		else if(x >=80 && x<90)
		{
			System.out.println("\tB");
		}
		else if(x >=70 && x<80)
		{
			System.out.println("\tC");
		}
		else if(x>=60 && x<70)
		{
			System.out.println("\tD");
		}
		else if(x<60 &&x >=0)
		{
			System.out.println("\tF");
		}
		else
		{
			System.out.println("\tScore out of range.");
		}			
	}
	private static void question6(Scanner scan) {
		int x=scan.nextInt();
		switch(x)
		{
			case 1: System.out.println("\tSunday"); break;
			case 2: System.out.println("\tMonday"); break;
			case 3: System.out.println("\tTuesday"); break;
			case 4: System.out.println("\tWednesday"); break;
			case 5: System.out.println("\tThursday"); break;
			case 6: System.out.println("\tFriday"); break;
			case 7: System.out.println("\tSaturday"); break;
			default: System.out.println("\tOut of range");
		}
	}
}

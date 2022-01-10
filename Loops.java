package com.perscholas.java_basics;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Question 1: ");
		question1();
		System.out.println("Question 2: ");
		question2();
		System.out.println("Question 3: ");
		question3();
		System.out.println("Question 4: ");
		question4();
		System.out.println("Question 5: ");
		question5();
		System.out.println("Question 6: ");
		question6();
		System.out.println("Question 7: ");
		question7();
		System.out.println("Question 8: ");
		question8();
		System.out.println("Question 9: ");
		question9();
	}
	private static void question1()
	{
		for (int i=1; i<=10; i++)
		{
			System.out.println("\t"+i);
		}
	}
	private static void question2() {
		int i=0;
		while (i<=100)
		{
			System.out.println("\t"+i);
			i+=10;
		}
	}
	private static void question3() {
		int i=1;
		do 
		{
			System.out.println("\t"+i);
			i++;
		}while(i<=10);
	}
	private static void question4() {
		for (int i=1; i<=100; i++)
		{
			if((i>=25&&i<=75)||(i%5!=0))
			{
				continue;
			}
			System.out.println("\t"+i);
		}
	}
	private static void question5() {
		for (int i=1; i<=100; i++)
		{
			if(i>50)
			{
				break;
			}
			else if(i%5!=0)
			{
				continue;
			}			
			System.out.println("\t"+i);
		}
	}
	private static void question6() {
		for(int i=1; i<=2; i++)
		{
			System.out.println("\tWeek "+i+":");
			for(int j=1; j<=5; j++)
			{
				System.out.println("\tDay "+j);
			}
			System.out.println();
		}
	}
	private static void question7() {
		boolean flag=true;
		for (int i=10; i<=200; i++)
		{
			String converted=String.valueOf(i);
			int j=converted.length();
			for (int k=0;k<j/2;k++)
			{
				if (converted.charAt(k)!=converted.charAt(converted.length()-1-k))
				{
					flag=false;
					break;
				}
				flag=true;
			}
			if (flag)
			{
				System.out.println("\t"+i);
			}
		}
	}
	private static void question8() {
		int i=0;
		int j=1;
		System.out.print("\t");
		System.out.print(i+", "+j);
		do{
			int temp=i+j;
			i=j;
			j=temp;
			System.out.print(", "+temp);
		}while (i+j<=50);
		System.out.println();
	}
	private static void question9() {
		for (int i =0; i<10; i++)
		{
			for (int j=0; j<10; j++)
			{
				System.out.println("\toutter: " + i + ", inner: " + j);				
			}
		}
	}
	
}

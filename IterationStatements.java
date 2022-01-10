package com.perscholas.java_basics;

import java.util.Random;
import java.util.Scanner;

public class IterationStatements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Slide 22: ");
		slide22(scan);
		System.out.println("Slide 23: ");
		slide23(scan);
		System.out.println("Slide 50: ");
		slide50();
		System.out.println("Slide 52: ");
		slide52();
		scan.close();
	}
	private static void slide22(Scanner scan)
	{
		Random rand= new Random();
		while(true)
		{
			int val1=rand.nextInt(100)+1;
			int val2=rand.nextInt(100)+1;
			System.out.println("\tWhat is "+val1+" + "+val2);
			if (!scan.hasNextInt())
			{
				scan.next();
				break;
			}
			else if (val1+val2==scan.nextInt())
			{
				System.out.println("\tCorrect");
			}
			else
			{
				System.out.println("\tIncorrect");
			}
		}
	}
	private static void slide23(Scanner scan)
	{
		Random rand=new Random();
		int val1=rand.nextInt(101);
		System.out.println("\tGuess the number between 0 and 100");
		while (true)
		{
			int userVal=scan.nextInt();
			if (userVal<val1)
			{
				System.out.println("\tYour guess what too low");
			}
			else if(userVal>val1)
			{
				System.out.println("\tYour guess was too high");
			}
			else
			{
				System.out.println("\tCongratulations! You got it!");
				System.out.println("\tDo you want to play again? Yes or [other]?");
				if (scan.next().equalsIgnoreCase("yes"))
				{
					slide23(scan);
				}
				break;				
			}
		}
			
	}
	private static void slide50()
	{
		for (int outter=1; outter<=12; outter++)
		{
			for (int inner=1; inner<=12; inner++)
			{
				System.out.print("\t"+outter*inner);
			}
			System.out.println();
		}
	}
	private static void slide52() {
		double tuition =10000;
		double tutitionDoubled=2*tuition;
		int count=0;
		while (tuition<tutitionDoubled)
		{
			System.out.println("\tYear "+count+": "+tuition);
			count++;
			tuition=tuition*1.07;
		}
		System.out.println("\tYear "+count+": "+tuition);
	}
}

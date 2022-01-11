package com.perscholas.java_basics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysSlidesExercises {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Slide 33: ");
		slide33(scan);
		System.out.println("Slide 43: ");
		slide43();
		
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
	private static void slide33(Scanner scan) {
		String [][] arr = new String [4][52];
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<52; j++)
			{
				
				int suit=j/13;
				int number = j%13;
				String sSuit="";
				switch (suit)
				{
					case 0: sSuit="Spades"; break;
					case 1: sSuit="Hearts"; break;
					case 2: sSuit="Diamonds"; break;
					case 3: sSuit="Clubs"; break;
				}
				switch (number)
				{
					case 0: arr[i][j]="Ace of "+ sSuit; break;
					case 10: arr[i][j]="Jack of "+ sSuit; break;
					case 11: arr[i][j]="Queen of "+ sSuit; break;
					case 12: arr[i][j]="King of "+ sSuit; break;
					default: arr[i][j]=(number+1)+" of "+ sSuit;
				}

			}
		}
		System.out.println("\tpick a card");
		while(scan.hasNextInt())
		{
			int card=scan.nextInt();
			int suit=card/13;
			int number = card%13;
			try
			{
				System.out.println("\t"+arr[suit][number]);				
			}
			catch (Exception io)
			{
				System.out.println("\tEntry Out of Bounds. Try Again");
			}
			System.out.println("\tpick a card");
		}
	}
	private static void slide43()
	{
		
		int [][]arr2=new int[2][3];
		Random rand= new Random();
		for (int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				arr2[i][j]=rand.nextInt(100);
			}
		}
		System.out.println("\t"+Arrays.deepToString(arr2));
	}
	private static void question1()
	{
		int [] arr= {1,2,3};
		for(int i: arr)
		{
			System.out.println("\t"+i);
		}
	}
	private static void question2()
	{
		int []arr= {13, 5, 7, 68, 2};
		System.out.println("\t"+arr[arr.length/2]);
	}
	private static void question3() {
		String [] arr= {"red", "green", "blue", "yellow"};
		System.out.println("\t"+arr.length);
		String [] arr2= arr.clone();
		System.out.println("\t"+Arrays.toString(arr2));
	}
	private static void question4()
	{
		int []arr= {32,3,32,4,324};
		System.out.println("\t"+arr[0]);
		System.out.println("\t"+arr[arr.length-1]);
		try
		{
			System.out.println("\t"+arr[arr.length]);
		}
		catch (Exception e)
		{
			System.out.println("\t"+ e.getMessage());
		}
		try
		{
			arr[5]=89;
		}
		catch(Exception e)
		{
			System.out.println("\t"+e.getMessage());
		}
	}
	private static void question5() {
		int arr[]= new int[5];
		for (int i=0; i< arr.length; i++)
		{
			arr[i]=i*2;
		}
		System.out.println("\t"+Arrays.toString(arr));
	}
	private static void question6() {
		int arr[]= {1,2,3,4,5};
		System.out.print("\t");
		for(int i=0; i<arr.length; i++)
		{
			if (i==arr.length/2)
			{
				continue;
			}
			System.out.print(arr[i]+" ");
		}
	}
	private static void question7() {
		String arr[]= {"this", "is", "my", "array", "?"};
		System.out.println("\t"+ Arrays.toString(arr));
		String temp=arr[0];
		arr[0]=arr[arr.length/2];
		arr[arr.length/2]=temp;
		System.out.println("\t"+Arrays.toString(arr));
	}
	private static void question8() {
		int [] arr = {4, 2, 9, 13, 1, 0};
		System.out.println("\tOriginal order: "+ Arrays.toString(arr));
		int temp=0;
		for(int i=0; i<arr.length; i++)
		{
			temp=i;
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[temp]>arr[j])
				{
					temp=j;
				}
			}
			int temp2=arr[i];
			arr[i]=arr[temp];
			arr[temp]=temp2;
		}
		System.out.println("\tArray in ascending order: "+ Arrays.toString(arr));
		System.out.println("\tThe smallest number is: "+ arr[0]);
		System.out.println("\tThe largest number is: "+ arr[arr.length-1]);
	}
	private static void question9() {
		Object arr[]= {1,"three","two","one",1.1};
		System.out.println("\t"+Arrays.toString(arr));
	}
}

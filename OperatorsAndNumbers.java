package com.perscholas.java_basics;

import java.util.Random;

public class OperatorsAndNumbers {

	public static void main(String[] args) {
		//do the first 3 
		System.out.println("Question 1:");
		question1();
		System.out.println("Question 2:");
		question2();
		System.out.println("Question 3:");
		question3();
		System.out.println("Question 4:");
		question4();
		System.out.println("Question 5:");
		question5();
		System.out.println("Question 6:");
		question6();
		System.out.println("Question 7:");
		question7();
		System.out.println("Question 8:");
		question8();
		
	}
	private static void question1() {
		int [] arr=new int [] {1,8,33,78,787,32767,33987,65535};
		for (int i=0; i<arr.length; i++)
		{
			double resultInt=0;
			double power=0;
			//since bit positions translate to 2^x, find max x position first
			while (resultInt<=arr[i])
			{
				power++;
				resultInt=Math.pow(2, power);
			}
			//since 0 is included in power arithmetic, always off by one, 
			//so decrement by 1
			power--;
			String resultString="";
			int power2=(int)power;
			double resultInt2=0;
			
			//adds 1 or 0 to string depending on whether resultInt2 is <= or > 
			//value being tested
			for (int j=0; j<=power; j++)
			{
				resultInt2=(Math.pow(2, power2)+resultInt2);
				if (resultInt2<=arr[i])
				{
					resultString+="1";
				}
				if (resultInt2>arr[i])
				{
					resultInt2-=Math.pow(2, power2);
					resultString+="0";
				}
				power2--;
			}
			System.out.println("\t"+arr[i]+"\t"+resultString);
		}
	}
	private static void question2()
	{
		String [] arr = new String [] {"0010","1001","0011 0100","0111 0010",
				"0010 0001 1111","0010 1100 0110 0111"};
		for (int i=0; i<arr.length; i++)
		{
			String temp=arr[i].replaceAll("\\s", "");
			double _decimal=0;
			int power=0;
			for (int j=temp.length()-1; j>=0; j--)
			{
				int binary=Character.getNumericValue(temp.charAt(j));
				_decimal=Math.pow(2, power)*(binary)+_decimal;
				power++;
			}
			//System.out.println("\t"+arr[i]+"\t"+_decimal+"\t"+Integer.parseInt(temp,2));
			System.out.println("\t"+(int)_decimal+"\t"+Integer.parseInt(temp,2));
			//turns out there is a built in function that parses out ints from string and can be read as Binary, decimal, octodecimal, and hexadecimal
		}
	}
	private static void question3()
	{
		int x=2;
		System.out.println("\t"+Integer.toBinaryString(x));
		x<<=1;
		System.out.println("\t"+x+"\t"+Integer.toBinaryString(x));
		int arr[]=new int [] {9,17,88};
		for (int i=0; i<arr.length; i++)
		{
			int j= arr[i]<<1;
			System.out.println("\toriginal: "+arr[i]+"\toriginal bits: "+
			Integer.toBinaryString(arr[i])+"\tshifted: "+j+"\tshifted to bits: "
					+Integer.toBinaryString(j));
		}
	}
	private static void question4() {
		int x=150;
		System.out.println("\t"+Integer.toBinaryString(x));
		x>>=2;
		System.out.println("\t"+x+"\t"+Integer.toBinaryString(x));
		int arr[]=new int [] {225,1555,32456};
		for (int i=0; i<arr.length; i++)
		{
			int j= arr[i]>>2;
			System.out.println("\toriginal: "+arr[i]+"\toriginal bits: "+
			Integer.toBinaryString(arr[i])+"\tshifted: "+j+"\tshifted to bits: "
					+Integer.toBinaryString(j));
		}		
	}
	private static void question5() {
		int x=7, y=17, z;
		z= x&y;
		System.out.println("\t"+z);
		z=x|y;
		System.out.println("\t"+z);
	}
	private static void question6() {
		int x=9;
		System.out.println("\tBefore: "+x);
		x++;
		System.out.println("\tAfter: "+x);
	}
	private static void question7() {
		int x=9;
		System.out.println("\tBefore: \t"+x);
		x++;
		System.out.println("\tAfter x++: \t"+x);
		x+=1;
		System.out.println("\tAfter x+=1: \t"+x);
		x=x+1;
		System.out.println("\tAfter x=x+1: \t"+x);
	}
	private static void question8() {
		int x=5, y=8;
		int sum =(++x)+y;
		//reset value of x for next time
		x=5;
		System.out.println("\t"+sum);
		sum =(x++)+y;
		System.out.println("\t"+sum);		
	}
}

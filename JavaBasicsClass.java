package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		System.out.print("question 1: ");
		question1();
		System.out.print("question 2: ");
		question2();
		System.out.print("question 3: ");
		question3();
		System.out.print("question 4: ");
		question4();
		System.out.print("question 5: ");
		question5();
		System.out.print("question 6: ");
		question6();
		System.out.print("question 7: ");
		question7();
		System.out.print("question 8: ");
		question8();
	}
	private static void question1() {
		int a, b;
		a=5;
		b=6;
		int c=a+b;
		System.out.println(c);		
	}
	private static void question2() {
		double a, b;
		a=5.5;
		b=6.6;
		double c=a+b;
		System.out.println(c);		
	}
	private static void question3() {
		int a=5;
		double b=6.6;
		
		double c =a+b;
		System.out.print(c);
		System.out.println("\n\tthe sum has to be a double because you can convert "
				+ "an int to a double, but not the other way around");
	}
	private static void question4()
	{
		int a=4, b=10;
		int c=Math.max(a, b)/Math.min(a, b);
		System.out.println("\n\tpart 1 result: "+c);
		double d= Math.max(a, b);
		double e=d/Math.min(a, b);
		System.out.println("\tpart 2 result of decimal_max/int_min= "+ e);
		System.out.println("\tyou must save the max number to a double variable, "
				+ "then save the equation (max/min) to another double variable");
	}
	private static void question5()
	{
		double a=7.7,b=8.8;
		double c = Math.max(a, b)/Math.min(a, b);
		System.out.println("\n\tun-casted result: "+ c);
		int d = (int)c;
		System.out.println("\tcasted result: " + d);
	}
	private static void question6() {
		int x=5, y=6;
		double q=y/x;
		System.out.println("\n\t"+q);
		q=((double)y)/x;
		System.out.println("\t"+q);
	}
	private static void question7() {
		final int NUM;
		NUM=60*400;
		System.out.println(NUM/1000);
	}
	private static void question8() {
		double coffee=2.50, tea=2.0, scone=1.8;
		double subtotal=3*coffee+4*tea+2*scone;
		double SALES_TAX=0.08;
		double totalSale= (subtotal*SALES_TAX)+subtotal;
		System.out.printf("%.2f",totalSale);
	}

}

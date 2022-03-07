package com.lession1;

import java.util.Scanner;
public class SimpleCalculator{
	double a;
	double b;
	public void num()
	{
	Scanner sc= new Scanner(System.in);
	a=sc.nextDouble();
	b=sc.nextDouble();
	
	}
	public void Addition(){
	 double n=a+b;
	 System.out.println("Addition of "+a+" and "+b+" is:"+n);
	}
	public void Substraction(){
		 double n=a-b;
		 System.out.println("Substraction of "+a+" and "+b+" is:"+n);
		}
	public void Multiplication(){
		 double n=a*b;
		 System.out.println("Multiplication of "+a+" and "+b+" is:"+n);
		}
	public void Division(){
		 double n=a/b;
		 System.out.println("Division of "+a+" and "+b+" is:"+n);
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------Calculator-------");
		System.out.println("Enter the two no:");
		SimpleCalculator obj=new SimpleCalculator();
		obj.num();
		System.out.println("Enter your choice");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();

		switch(choice) 

		{
		 
			case 1:
				obj.Addition();
				break;
			case 2:
				obj.Substraction();
				break;
			case 3:
				obj.Multiplication();
				break;
			case 4:
				obj.Division();
				break;
			default:
				System.out.println("invilid input");
			    break;
		 }
	}

}

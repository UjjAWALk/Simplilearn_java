package com.lession1;
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner sc=new Scanner(System.in);
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a: "+a);
		System.out.println("Value of a in int: "+(int)a);
		System.out.println("Value of a in float: "+(float)a);
		System.out.println("Value of a in long: "+(long)a);
		System.out.println("Value of a in double: "+(double)a);
			
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=45.5;
		//int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of x in int: "+(int)x);

	}

}

package com.lession2;

public class ArraysEx {
	static void minimum(int x[]) {
		int value=x[0];
		for(int i=1;i<x.length;i++)
			if(value>x[i])
			value=x[i];
		System.out.println(value);
		}
		public static void main(String [] args) {
			int a[]= {38,92,5,3,534,35,53,54,43,54,43};
			minimum(a);
		}
}

package com.lession2;

public class StringEx {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	String str1=new String("java");
	String str4=new String("java");

	String str2="python";
	String str3="Python";
	System.out.println(str1.toString());
	System.out.println(str2);
	System.out.println(str1.equals(str4));
	System.out.println(str1==str4);//hash code address
	System.out.println(str2.equals(str3));
	System.out.println(str2==str3);

	str1=str1.concat(" language");//not modify existing object
	//create new oblect
	System.out.println(str1);
	str1=str1+ " Course";//create new object
	System.out.println(str1);
		}

	}



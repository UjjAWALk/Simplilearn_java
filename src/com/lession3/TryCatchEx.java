package com.lession3;

class MyException1 extends Exception{
	   String str1;
	   MyException1(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class TryCatchEx{
	   public static void main(String args[]){
		try{
			System.out.println("try block");
			// I'm throwing the custom exception using throw
			throw new MyException("This is My error Message");
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}


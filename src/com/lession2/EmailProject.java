package com.lession2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailProject {
    static String [] dataBase={"ujjawal@gmail.com","Kumar923@.outlook.com","Ravi1234@rediffmail.com","Sachin@Gmail.com"};


	public static void main(String[] args) {
        System.out.println("*****Welecome To Email_ID Verfication*****");
        Scanner sc= new Scanner(System.in);
        String Email_ID;
		while (true){
	     System.out.println("***Please Enter your Email_ID***");
	     Email_ID = sc.next();
	     while(VerfiyFormate(Email_ID))
	     {
		     System.out.println("***Please Enter your valid Email_ID***");
		     Email_ID = sc.next();
	     }
	     
	     VerfiyID(Email_ID);
	     
	     
	     System.out.println("");

		}
		
	}
	
	private static void VerfiyID(String ID)
	{
		boolean accessFlag= false;
	     for(String id : dataBase)
	     {
	    	 if(ID.equalsIgnoreCase(id))
	    	 {
	    		 accessFlag=true;
		    	 System.out.println("access granted "+ ID );
	    		 break;
	    	 }   	 
	    	 
	     }
	     
	     if(accessFlag==false)
	     {
	    	 System.out.println("access deined "+ ID);
	    	 
	     }
			
		
	}
	
	private static boolean VerfiyFormate(String ID)
	{
		String regex = "^[A-Za-z0-9+_.-]+@(.+)";

		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(ID);

		if(!matcher.matches())
		{
			return true;
			
		}else 
		{
			return false;
			
		}
		
	}

}
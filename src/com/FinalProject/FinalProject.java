package com.FinalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;


public class FinalProject{
	public static void main(String[] args) throws IOException {
	String name = null;
	Scanner scn = new Scanner(System.in);
	int count=0;
	System.out.println("************************************************\n");
	System.out.println("    Please Enter your name?");
	name=scn.nextLine();
	System.out.println("################################################\n");
	System.out.println("   Hey "+name+" Welcome to LockedMe.com\n"
	+"   Developed by Ujjawal kumar"+"\n ");
	System.out.println("################################################\n");
	while(true) {
	System.out.println("*****Enter your choice*****");
	System.out.println("1.Create New File");
	System.out.println("2.Show File List");
	System.out.println("3.Writing in File");
	System.out.println("4.Reading File");
	System.out.println("5.Searching File");
	System.out.println("6.Deleting File");
	System.out.println("7.Exit");
	FinalProject obj = new FinalProject();
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	switch(choice)
	{
		case 1:
		obj.Creating();
			break;
		case 2:
			obj.Showing();
			break;
		case 3:
			obj.Writing();
			break;
		case 4:
			obj.Reading();
			break;
		case 5:
			obj.Searching();
			break;
		case 6:
			obj.Deleting();
			break;
		case 7:
			System.out.println("Program terminated successfully.");
			System.exit(0);
		default:
			System.out.println("invilid input");
			break;
		}
	}

}

	public void Creating() throws IOException {
			
			System.out.println("Please enter the filename to Create\n"); 
			System.out.println("\tOR\n");
			System.out.println("If you want to cancel enter C");
			Scanner sc = new Scanner(System.in);
			String filename = sc.nextLine();
			
			if(filename.equalsIgnoreCase("c")) {
				System.out.println("You cancelled Adding File");
			}else {
				File Obj = new File("C:\\FinalProject", filename);


				if (Obj.createNewFile()) {														
					System.out.println("Successfully added the file: " + Obj.getName());
				} else {
					System.out.println("This file already exists.");
				}
			}
			
        
	}

	public void Showing() {
        String[] filenames;
        File f = new File("C:\\FinalProject");
        filenames = f.list();
        for (String x : filenames) {
            System.out.println(x);
        }
		
	}

	public void Writing() throws IOException{
		System.out.println("Please enter the filename to Write");
		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine().toLowerCase();
		File Obj = new File("C:\\FinalProject", filename);    
        FileWriter fileWriter = new FileWriter(Obj);
        String file = sc.nextLine().toLowerCase();
    	fileWriter.write(file);
        System.out.println("write sucessfully");
        fileWriter.close();

	}

	public void Reading() throws FileNotFoundException {
		System.out.println("Please enter the filename to reading");
		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine().toLowerCase();
			File Obj = new File("C:\\FinalProject", filename); 
        Scanner sc1 = new Scanner(Obj);
		while(sc1.hasNextLine()){
		    String line = sc1.nextLine();
		    System.out.println(line);
		}
		sc1.close();
		
	}

	public void Searching() {
		System.out.println("Please enter the filename to search");
		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine().toLowerCase();	
        File obj = new File("C:\\FinalProject");
        String[] filenames =obj.list();
        int count = 0;
        for (String x : filenames) {
                  
                   if(x.equalsIgnoreCase(filename)) {
                  	System.out.println("File "+filename+" is founded");
                  	break;
                  }else {
                  	count++;
                  }
                  if(count == filenames.length) {
                  	System.out.println("File not found");
                  }
              }
        }

	public void Deleting() {
		System.out.println("Please enter the filename to delete");
		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine().toLowerCase();
			File Obj = new File("C:\\FinalProject", filename); 
		    if (Obj.delete()) { 															
		      System.out.println("You Deleted the file: " + Obj.getName());
		    } else {
		      System.out.println("Failed to delete the file.");
		    }
		}
		
	}

	

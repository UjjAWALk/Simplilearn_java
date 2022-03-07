package com.lession3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingProject {
    public static void main(String[] args) {

        File NewFile = new File("file1.txt");
        try {
            NewFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
        	System.out.println("File not created.");
            e.printStackTrace();
        }
    System.out.println("***WELCOME TO FILE HANDLING***");
    System.out.println("Enter your choice");
    System.out.println("1.Writing");
    System.out.println("2.Reading");
    System.out.println("3.Deleting");
    FileHandlingProject obj=new FileHandlingProject();
    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
    switch(choice) {
    case 1:
		obj.Writing1();
		break;
	case 2:
		obj.Reading1();
		break;
	case 3:
		obj.Deleting1();
		break;

	default:
		System.out.println("invilid input");
	    break;
    }
    }

	public void Reading1() {
		// TODO Auto-generated method stub
		File NewFile = new File("file1.txt");
        try {
            Scanner sc1 = new Scanner(NewFile);
            while(sc1.hasNextLine()){
                String line = sc1.nextLine();
                System.out.println(line);
            }
            sc1.close();
        } catch (FileNotFoundException e) {
        	System.out.println("file not found");
            e.printStackTrace();
        }
	}

	public void Deleting1() {
		// TODO Auto-generated method stub
		File NewFile = new File("file1.txt");
        if(NewFile.delete()){
            System.out.println("I have deleted: " + NewFile.getName());
        }
        else{
            System.out.println("Problem occurred try again");
        }
	}

	public void Writing1() {
		// TODO Auto-generated method stub
		File NewFile = new File("file1.txt");
        try {
            FileWriter fileWriter = new FileWriter("file1.txt");
            fileWriter.write("Hello Coder..  You all are doing great job.");
            System.out.println("write sucessfully");
            fileWriter.close();
        } catch (IOException e) {
        	System.out.println("file not found");
            e.printStackTrace();
        }
	}

	
}

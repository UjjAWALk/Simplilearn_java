package com.lession2;

class EmpInfo{
	int id=12;
	String name="uk";

void display() {
	System.out.println(id+" "+name);
	}
}


public class ConstructorsEx {
public static void main(String[] args) {

	EmpInfo std1=new EmpInfo();
	
	std1.display();
	
		}

}

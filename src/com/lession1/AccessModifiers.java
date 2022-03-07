package com.lession1;
class Parents{
	public void methodA(){//dectare an instance method
		System.out.println("parent class");
	}
}
class Childclass extends Parents{
	protected void methodB() {
		System.out.println("child class");
	}
}
class Subchildclass extends Childclass{
	public void methodC() {
		System.out.println("subchild class");
	}
}
class Subchildclass1 extends Subchildclass{
	private void methodD() {
		System.out.println("subchild1 class");
	}
}
public class AccessModifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Subchildclass obj=new Subchildclass();
obj.methodA();
obj.methodB();//protected is accessible
obj.methodC();
//obj.methodD();//The method methodD() is undefined for the type Subchildclass
	}

}


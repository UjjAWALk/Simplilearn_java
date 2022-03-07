package com.lession3;


class planet{
	//Overriden method
	public void earth() {
		System.out.println("Earth is a planet");
	}
}
class pluto extends planet{
	//overriding method
	public void earth() {
		System.out.println("pluto ia also a planet");
	}
}
public class Opps1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pluto obj=new pluto();
obj.earth();

	}

}

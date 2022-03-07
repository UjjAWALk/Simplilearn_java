package com.lession3;

class sum{
static int add(int x, int y) {
return x+y;
}
static int add(int x,int y, int z) {
	return x+y+z;
}
}
public class OppsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum.add(10,20));
System.out.println(sum.add(48,50,45));
	}

}

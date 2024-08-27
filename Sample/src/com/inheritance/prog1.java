 //WAP IN MULTILEVEL INHERITANCE.
package com.inheritance;

class maths1
{
	void add(int a,int b)
	{
		System.out.println("add result: " +(a+b));
	}
}
class maths2 extends maths1
{
	void mul(int a,int b)
	{
		System.out.println("mul result: "+(a*b));
	}
}
class maths3 extends maths2
{
	void div(int a,int b)
	{
		System.out.println("div result:" +(a/b));
	}
}
public class prog1 {
	public static void main(String args[]) {
		maths3 obj=new maths3();
		obj.add(20,30);
		obj.mul(7,7);
		obj.div(20, 7);
	}
}
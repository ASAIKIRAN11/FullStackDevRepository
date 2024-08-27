//WAP IN HIEARARICHAL INHERITANCE
package com.inheritance;

class cse1
{
	void addition(int a,int s)
	{
		System.out.println("final is:" +(a+s));
	}
}
class cse2 extends cse1
{
	void modulus(int a,int s)
	{
		System.out.println("final is:" +(a%s));
	}
}
class cse3 extends cse1
{
	void multiplication(int a,int s)
	{
		System.out.println("final is:" +(a*s));
	}
}
public class prog3{
	public static void main(String args[]) {
		cse2 obj1=new cse2();
		obj1.addition(77,33);
		obj1.modulus(33,2);
		cse3 obj2=new cse3();
		obj2.addition(134,557);
		obj2.multiplication(17,17);
	}
}
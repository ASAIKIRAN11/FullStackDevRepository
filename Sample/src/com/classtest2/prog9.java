//2
package com.classtest2;

class mathematics
{
	void  add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is:" +sum);
	}
	void sub()
	{
		int a=10;
		int b=5;
		int sub=a-b;
		System.out.println("sub is:" +sub);
	}
}
class colleg
{
	int sem;
	colleg(int sem)
	{
		mathematics obj=new mathematics();
		obj.add();
		obj.sub();
		this.sem=sem;
		System.out.println("maths version is:" +sem);
	}
}
public class prog9 {
	public static void main(String[] args) {
		colleg obj=new colleg(4);
	}
}
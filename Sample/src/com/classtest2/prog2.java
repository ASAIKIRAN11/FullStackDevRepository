//5th
package com.classtest2;

class mulstatic
{
	static
	{
		System.out.println("this is first static block");
	}
	static
	{
		System.out.println("this is a second static block");
	}
	static 
	{
		System.out.println("this is a third static block");
	}
}
public class prog2 {
	public static void main(String[] args) {
		mulstatic obj=new mulstatic();
	}
}

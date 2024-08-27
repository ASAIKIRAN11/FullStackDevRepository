//1st
package com.classtest2;

class college
{
	{
		String collegename="GCEM";
		int collegeid=001;
		System.out.println("college name is:" +collegename);
		System.out.println("college id is:" +collegeid);
	}
	college()
	{
		System.out.println("This is  no-args constructor");
	}
}
public class prog4{
	public static void main(String[] args) {
		college obj=new college();
	}
}
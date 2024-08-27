//WAP IN WHICH OUTER CLASS CONTAINS TWO INNER STATIC CLASSES, AND EXECUTE MEMBERS OF ALL THE CLASSES.
package com.nested;

class outer3
{
	String name;
	inner1 obj1=new inner1();
	inner2 obj2=new inner2();
	
	void showphoneno1()
	{
		obj1.phoneno1=12345;
		System.out.println("phoneno1 :" +obj1.phoneno1);
	}
	void showphoneno2()
	{
		obj2.phoneno2=23456;
		System.out.println("phoneno2 :" +obj2.phoneno2);
	}
	
	static class inner1
	{
		int phoneno1;
	}
	static class inner2
	{
		int phoneno2;
	}
	
	void showname()
	{
		name="nagaraja";
		System.out.println("name :" +name);
	}
}
public class prg4{
	public static void main(String args[]) {
		outer3 obj=new outer3();
		obj.showname();
		obj.showphoneno1();
		obj.showphoneno2();
	}
}
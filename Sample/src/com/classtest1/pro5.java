package com.classtest1;

class outer
{
	String firstname;
	inner obj=new inner();
	void showage()
	{
		obj.age=22;
		System.out.println("age :" +obj.age);
	}
	class inner
	{
		int age;
		void showfirstname()
		{
			firstname="saikiran";
			System.out.println("name is:" +firstname);
		}
	}
}
public class pro5 {
	public static void main(String[] args) {
		outer obj1=new outer();
		obj1.showage();
		obj1.obj.showfirstname();
	}
}
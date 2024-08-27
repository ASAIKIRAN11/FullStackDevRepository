//3
package com.classtest2;

class professor
{
	String name;
	String subject;
	static int salary;
	static int age;
}
class puccollege
{
	puccollege()
	{
		professor obj=new professor();
		obj.name="rajshekar";
		obj.subject="physics";
		professor.salary=70000;
		professor.age=40;
		System.out.println("name :" +obj.name);
		System.out.println("subject :" +obj.subject);
		System.out.println("salary :" +professor.salary);
		System.out.println("age :" +professor.age);
	}
}
public class prog10 {
	public static void main(String[] args) {
		puccollege obj1=new puccollege();
	}
}

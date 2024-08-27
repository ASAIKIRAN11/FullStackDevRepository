//WAP IN WHICH OUTER CLASS CONTAINS TWO INNER PRIVATE CLASSES, EXECUTE MEMBERS OF ALL THE CLASSES.
package com.nested;

class outer2
{
	int age;
	inner1 obj1=new inner1();
	inner2 obj2=new inner2();
	
	void showfirstname()
	{
		obj1.firstname="anu";
		System.out.println("firstname :" +obj1.firstname);
	}
	void showlastname()
	{
		obj2.lastname="radha";
		System.out.println("lastname :" +obj2.lastname);
	}
	
	private class inner1
	{
		String firstname;
		public String getfirstname()
		{
			return firstname;
		}
		public void setfirstname()
		{
			this.firstname=firstname;
		}
	}
	private class inner2
	{
		String lastname;
		public String getlastname()
		{
			return lastname;
		}
		public void setlastname(String lastname)
		{
			this.lastname=lastname;
		}
	}
	void showage()
	{
		age=22;
		System.out.println("age :" +age);
	}
}
public class prg3{
	public static void main(String args[]) {
		outer2 obj=new outer2();
		obj.showage();
		obj.showlastname();
		obj.showfirstname();
	}
}
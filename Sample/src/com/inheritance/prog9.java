//IF SUPERCLASS CONTAINS PARAMETERIZED CONSTRUCTOR HOW TO EXECUTE PARAMETERIZED SUPERCLASS CONSTRUCTOR.
package com.inheritance;

class empl
{
	empl(String ename,String jobname)
	{
		System.out.println("emplo name :" +ename);
		System.out.println("emplo jobname :" +jobname);
	}
}
class departmen extends empl
{
	String depname;
	departmen(String ename,String jobname,String dname)
	{
		super(ename,jobname);
		depname=dname;
		System.out.println("departmen name :" +depname);
	}
}
public class prog9 {
	public static void main(String[] args) {
		departmen obj=new departmen("sai","developer","gaming");
		departmen obj1=new departmen("kiran","developer","hacking");
	}
}

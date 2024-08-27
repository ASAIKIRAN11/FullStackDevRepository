package com.strings;

class employee
{
	String firstname;
	String jobname;
	employee(String firstname,String jobname)
	{
		this.firstname=firstname;
		this.jobname=jobname;
	}
	@Override
	public String toString()
	{
		return "name of employee : " +firstname+ ", job is : " +jobname;
	}
}
public class tostring {
	public static void main(String[] args) {
		employee obj=new employee("santhosh","manager");
		System.out.println(obj);
	}
}
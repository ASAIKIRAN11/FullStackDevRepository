package com.classtest1;

class employee
{
	String empname;
	employee(String empname)
	{
		this.empname=empname;
		System.out.println("empname is:" +empname);
	}
}
class department extends employee
{
	String depname;
	int depid;
	department(String empname,String depname,int depid)
	{
		super(empname);
		this.depname=depname;
		this.depid=depid;
		System.out.println("deptname is:" +depname);
		System.out.println("depid is:" +depid);
	}
}
class manager extends department
{
	int salary;
	manager(String empname,String depname,int depid,int salary)
	{
		super(empname,depname,depid);
		System.out.println("this is manager constructor");
	}
}
public class pro1{
	public static void main(String args[]){
		manager obj=new manager("sai","develop",001,45000);
	}
}

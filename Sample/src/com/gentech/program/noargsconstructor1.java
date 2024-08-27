package com.gentech.program;

class employee1
{
	int employeeid;
	String employeename;
	String designation;
	int salary;
	employee1()
	{
		employeeid=1;
		employeename="deepak";
		designation="manager";
		salary=45000;
		System.out.println(employeeid+" ");
		System.out.println(employeename+" ");
		System.out.println(designation+" ");
		System.out.println(salary+" ");
		System.out.println("************************");
	}
}
class department1
{
	int deptid;
	String deptname;
	String role;
	int salary;
	department1()
	{
		deptid=2;
		deptname="CSE";
		role="HOD";
		salary=40000;
		System.out.println(deptid+" ");
		System.out.println(deptname+" ");
		System.out.println(role+" ");
		System.out.println(salary+" ");
		System.out.println("************************");
	}
}
class insurance1
{
	int insuranceid;
	String insurancetype;
	int money;
	insurance1()
	{
		insuranceid=1;
		insurancetype="saving";
		money=1000000;
		System.out.println(insuranceid+" ");
		System.out.println(insurancetype+" ");
		System.out.println(money+" ");
		System.out.println("************************");
	}
}

public class noargsconstructor1 {
	public static void main(String args[]) {
		employee1 obj1=new employee1();
		department1 obj2=new department1();
		insurance1 obj3=new insurance1();
	}

}

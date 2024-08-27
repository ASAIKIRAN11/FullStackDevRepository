//IF A ABSTRACT CLASS CONTAIN MULTIPLE STATIC METHODS, WRITE PROGRAM TO EXECUTE THEM.
package com.abstaract;

abstract class Employee
{
	static String empName;
	static String jobName;
	static double salary;
	static int empId;
	
	static void empDetails(String name,String job)
	{
		Employee.empName=name;
		Employee.jobName=job;
		System.out.println("employee name :"+empName);
		System.out.println("employee job :"+jobName);
	}
	static void empDetails2(double salary,int id)
	{
		empDetails("sai","Developer");
		Employee.salary=salary;
		Employee.empId=id;
		System.out.println("employee salary :"+Employee.salary);
		System.out.println("employee id :"+Employee.empId);
	}
}
public class exp1 {
	public static void main(String[] args) {
		Employee.empDetails2(45000,001);
		System.out.println();
		Employee.empDetails("vignesh","Developer");
	}
}
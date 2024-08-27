//IN MULTILEVEL SUPERCLASS CONTAINS PARAMETERIZED CONSTRUCTOR BASED ON OBJECT EXECUTE SUPERCLASS PARAMETERIZED CONSTRUCTOR.
package com.inheritance;

class Employee 
{
    Employee(String ename,String jobname) 
    {
        System.out.println("Employee Name : " + ename);
        System.out.println("Job Name is : " + jobname);
    }
}
class Department extends Employee 
{
    Department(String dname,int did) 
    {
        super("vignesh","developer");
        System.out.println("dept name : " + dname);
        System.out.println("dept ID : " +did);
    }
}
class Employeecity extends Department 
{
    String empcity;
    Employeecity () 
    {
        super("gaming site",11);
        empcity = "Bengaluru";
        System.out.println("Employee City Name : " + empcity);
    }
}
public class prog4 {
    public static void main (String [] args) {
        Employeecity Obj1=new Employeecity();
    }
}
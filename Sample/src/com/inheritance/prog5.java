//IN MULTILEVEL INHERITANCE SUPERCLASS CONTAINS CONSTRUCTOR OVERLOADING BASED ON THE SUBCLASS CONSTRUCTOR EXECUTE ALL SIGNATURE OF OVERLOADING CONSTRUCTOR.
package com.inheritance;

class emp
{
    String ename;
    int emp_id;
    emp()
    {
        System.out.println("This is a Employee constructor");
    }
    emp(String ename,int emp_id)
    {
        this.ename=ename;
        this.emp_id=emp_id;
        System.out.println("emp name is : "+this.ename);
        System.out.println("emp id is : "+this.emp_id);
    }
}
class dept extends emp
{
    String deptName;
    int dept_id;
    dept()
    {
        super();
        System.out.println("--------------------------------------------");
        System.out.println("This is a Department constructor");
    }
    dept(String ename,int emp_id,String deptName,int dept_id)
    {
        super(ename,emp_id);
        System.out.println("---------------------------------------------");
        this.deptName=deptName;
        this.dept_id=dept_id;
        System.out.println("dept name is : "+this.deptName);
        System.out.println("dept id is : "+this.dept_id);
    }
}
class Project extends dept
{
    String pName;
    int p_id;
    Project()
    {
        super();
        System.out.println("--------------------------------------------");
        System.out.println("This is Project Constructor");
    }
    Project(String ename, int emp_id,String deptName,int dept_id,String pName,int p_id)
    {
        super(ename,emp_id,deptName,dept_id);
        System.out.println("---------------------------------------------");
        this.pName=pName;
        this.p_id=p_id;
        System.out.println("Project name is : "+this.pName);
        System.out.println("Project id is : "+this.p_id);
    }
}
public class prog5 {
    public static void main(String[] args) {
        Project obj1=new Project();
        Project obj2=new Project("saikiran",2002,"statistics manager",100,"Tally",200);
    }
}
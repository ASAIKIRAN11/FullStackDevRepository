//IN HYBRID INHERITANCE SUPERCLASS CONTAINS PARAMETERIZED CONSTRUCTOR BASED ON ALL AVAILABLE SUBCLASS OBJECTS EXECUTE SUPERCLASS PARAMETERIZED CONSTRUCTOR.
package com.inheritance;

class emp1
{
    emp1(String ename,String jobname) 
    {
        System.out.println("Emp1 Name : " + ename);
        System.out.println("Job Name is : " + jobname);
    }
}
class dept1 extends emp1 
{
    dept1(String dname,int dept_id) 
    {
        super("punith","aero engineer");
        System.out.println("dept Name : " + dname);
        System.out.println("dept ID : " + dept_id);
    }
}
class empcity extends dept1 
{
    String empcity;
    empcity(String cityname,String State) 
    {
        super("jr engineer",21);
        empcity = "mumbai";
        System.out.println("emp city name: " +empcity);
    }
}
class deptbranch extends empcity 
{
    String deptbranch;
    deptbranch () 
    {
        super("mumbai","Maharashtra");
        deptbranch="wankade";
        System.out.println("deptbranch : " +deptbranch);
    }
}
public class prog6 {
    public static void main (String [] args) {
        deptbranch obj1 = new deptbranch();
    }
}
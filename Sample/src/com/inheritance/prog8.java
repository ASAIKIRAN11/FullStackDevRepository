//In Multilevel Inheritance each class Contains same variable name with datatype, based on the subclass object execute all the variables.
package com.inheritance;

class employ 
{
    String ename="A";
    String getename() 
    {
        return ename;
    }
}
class depart extends employ 
{
    String ename="sai";
    String getdepartename() 
    {
        return ename;
    }
}
class proj extends depart 
{
    String ename="kiran";
    String getprojename() 
    {
        return ename;
    }
}
public class prog8 {
    public static void main(String[] args) {
        proj obj=new proj();
        System.out.println("employ details:" +obj.getename());
        System.out.println("depart details:" +obj.getdepartename());
        System.out.println("proj details:" +obj.getprojename());
    }
}
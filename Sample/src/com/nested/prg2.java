//WAP FRO NESTED CLASS IN WHICH INNER CLASS IS STATIC EXECUTE MEMBERS OF OUTER AND INNER CLASS.
package com.nested;

class Outer1
{
    int age;
    InnerStatic obj1=new InnerStatic();
    void showName()
    {
        obj1.name="namratha";
        System.out.println("Name:" +obj1.name);
    }
    static class InnerStatic
    {
        String name;
    }
    void showAge()
    {
        age=23;
        System.out.println("age:" +age);
    }
}
public class prg2 {
    public static void main(String[] args) {
        Outer1 obj=new Outer1();
        obj.showAge();
        obj.showName();
    }
}
//WRITE A NESTED CLASS IN WHICH INNER CLASS IS PRIVATE AND EXECUTE OUTER AND INNER CLASS MEMEBERS.
package com.nested;

class Outer
{
    String firstName;
    Inner obj1=new Inner();
    void showage()
    {
        obj1.age=21;
        System.out.println("Age:" +obj1.age);
    }
    private class Inner
    {
        private int age;
        public int getAge() 
        {
            return age;
        }
        public void setAge(int age) 
        {
            this.age = age;
        }
    }
    void showfirstname()
    {
        firstName="Saikiran";
        System.out.println("FirstName:"+firstName);
    }
}
public class prg1 {
    public static void main(String[] args) {
        Outer obj=new Outer();
        obj.showfirstname();
        obj.showage();
    }
}
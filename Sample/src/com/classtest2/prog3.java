//6th
package com.classtest2;

class firstclass 
{
    static 
    {
        System.out.println("Static block of firstclass");
    }
}
class secondclass extends firstclass
{
    static 
    {
        System.out.println("Static block of secondclass");
    }
}
public class prog3 {
    public static void main(String[] args) {
       secondclass obj=new secondclass();
    }
}
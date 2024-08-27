package com.classtest;

class four
{
    static int length=5;
    static int breadth=5;
    static int area()
    {
        int res=length*breadth;
        return res;
    }
}
public class pr4 {
    public static void main(String[] args) {
        int val=four.area();
        System.out.println(val);
    }
}
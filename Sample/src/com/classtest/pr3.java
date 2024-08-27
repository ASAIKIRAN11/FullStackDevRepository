package com.classtest;

class three
{
    static int rad=10;
    static double area()
    {
        double area=3.14*rad*rad;
        return area;
    }
}
public class pr3 {
    public static void main(String[] args) {
        double res=three.area();
        System.out.println(res);
    }
}
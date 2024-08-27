package com.classtest;

class twelve
{
    int largeNumber(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
}
public class pr13 {
    public static void main(String[] args) {
        twelve obj=new twelve();
        int val=obj.largeNumber(10,20);
        System.out.println(val);
    }
}
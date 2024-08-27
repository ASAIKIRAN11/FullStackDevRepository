package com.classtest;

class five
{
    static String voting()
    {
        int age=10;
        if(age>=18)
            return "person can vote";
        else
            return "person can't vote";
    }
}
public class pr5 {
    public static void main(String[] args) {
        String val=five.voting();
        System.out.println(val);
    }
}
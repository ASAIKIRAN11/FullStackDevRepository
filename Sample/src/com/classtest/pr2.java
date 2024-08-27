package com.classtest;

class second
{
    static String laptopBrand()
    {
        String Name="ASUS";
        return Name;
    }
}
public class pr2 {
    public static void main(String[] args) {
        String val=second.laptopBrand();
        System.out.println(val);
    }
}
package com.classtest;

class six
{
    boolean val(int a,int b)
    {
        if(a>=50 && b<100)
            return true;
        else
            return false;
    }
}
public class pr6 {
    public static void main(String[] args) {
        six obj=new six();
        boolean res=obj.val(51,99);
        System.out.println(res);
    }
}
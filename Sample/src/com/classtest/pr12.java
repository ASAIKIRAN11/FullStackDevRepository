package com.classtest;

class eleven
{
    String[] birdName()
    {
        String[] a={"eagle","pigeon","parrot"};
        return a;
    }
}
public class pr12 {
    public static void main(String[] args) {
        eleven obj=new eleven();
        String[] val=obj.birdName();
        for(int i=0;i<val.length;i++)
        {
            System.out.println(val[i]);
        }
    }
}
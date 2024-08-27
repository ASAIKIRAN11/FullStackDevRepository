package com.classtest;

class first
{
    static boolean[] arr()
    {
        boolean[] arr={true,false,true,true,false,false};
        return arr;
    }
}
public class pr1 {
    public static void main(String[] args) {
        boolean[] val=first.arr();
        for(int i=0;i<val.length;i++)
        {
        	System.out.println(val[i]);
        }
    }
}
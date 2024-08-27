package com.classtest;

class eight
{
    byte[] arr()
    {
        byte[] a={10,20,30,40,50};
        return a;
    }
}
public class pr8 {
    public static void main(String[] args) {
        eight obj=new eight();
        byte[] val=obj.arr();
        for(int i=0;i<val.length;i++)
        {
        	System.out.print(val[i]+ " ");
        }
    }
}
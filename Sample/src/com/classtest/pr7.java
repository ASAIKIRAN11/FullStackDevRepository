package com.classtest;

class seven
{
    int table(int num)
    {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum+=2*i;
        }
        return sum;
    }
}
public class pr7 {
    public static void main(String[] args) {
        seven obj=new seven();
        int res=obj.table(2);
        System.out.println(res);
    }
}
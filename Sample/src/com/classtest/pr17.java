package com.classtest;

class sixteen
{
    static String concat()
    {
        String[] arr={"A","Sai","Kiran","vigi","sanil","dhanush"};
        String res="";
        for(int i=0;i<arr.length/2;i++)
        {
            res+=arr[i];
        }
        return res;
    }
}
public class pr17 {
    public static void main(String[] args) {
        String val=sixteen.concat();
        System.out.println(val);
    }
}
package com.classtest;

class nine 
{
    int element() 
    {
        int count = 0;
        for(int i=21;i>=11;i--) 
        {
            if(i%2!=0) 
            {  
                count++;
            }
        }
        return count;
    }
}
public class pr11 {
    public static void main(String[] args) {
        nine obj = new nine();
        int val = obj.element();
        System.out.println(val);
    }
}
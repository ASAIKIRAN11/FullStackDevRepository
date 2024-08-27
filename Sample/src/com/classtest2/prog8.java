//8th
package com.classtest2;

class maths
{
    void add(int a,int b)
    {
    	int c=a+b;
        System.out.println(c);
    }
    {
    	add(77,33);
        System.out.println("instance bolck");
    }
}
public class prog8{
    public static void main(String[] args){
        maths obj=new maths();
    }
}
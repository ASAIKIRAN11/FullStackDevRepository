//THE CONCATENATE OF ALL ELEMENTS FROM GIVEN 1D STRING ARRAY.
package com.returnmethod;

class concatenate
{
	String concate(String arr[])
	{
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			s+=arr[i];
		}
		return s;
	}
}
public class progr11 {
	public static void main(String[] args) {
		String arr[]={"A","nagaraja","p","anuradha","A","namratha","A","saikiran"};
		concatenate ob1=new concatenate();
		String val=ob1.concate(arr);
		System.out.println(val);
	}
}
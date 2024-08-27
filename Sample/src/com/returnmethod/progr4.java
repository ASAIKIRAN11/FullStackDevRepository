//THE METHOD HAS TO RETURN REVERSE OF THE ELEMENT FROM 1-D DOUBLE ARRAY.
package com.returnmethod;

class reverse
{
	double[] rever(double arr[])
	{
		double[] a=new double[arr.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			a[j]=arr[i];
			j++;
		}
		return a;
	}
}
public class progr4 {
	public static void main(String[] args) {
		double[] arr= {1.1,2.2,3.3,4.4,5.5,6.6};
		reverse obj1=new reverse();
		double[] val=obj1.rever(arr);
		for(int i=0;i<val.length;i++)
		{
			System.out.println(val[i]);
		}
	}
}

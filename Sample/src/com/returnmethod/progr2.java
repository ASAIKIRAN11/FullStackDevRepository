//THE METHOD HAS TO RETURN SUM OF ALL ELEMENTS FROM GIVEN 1-D INTEGER ARRAY.
package com.returnmethod;

class onedelement
{
	int total(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
}
public class progr2 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		onedelement obj1=new onedelement();
		int val=obj1.total(arr);
		System.out.println(val);
	}
}
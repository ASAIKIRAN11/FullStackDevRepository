//THE METHOD HAS TO RETURN 1ST ROW OF ELEMENTS FROM GIVEN 2D ARRAY.
package com.returnmethod;

class firstrow
{
	int[] first(int arr[][])
	{
		int a[]=new int[arr[0].length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=arr[0][i];
		}
		return a;
	}
}
public class progr7 {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{5,6,7,8}};
		firstrow obj1=new firstrow();
		int[] val=obj1.first(arr);
		for(int i=0;i<val.length;i++)
		{
			System.out.println(val[i]);
		}
	}
}
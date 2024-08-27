//THE METHOD HAS TO RETURN 1ST HALF OF THE ELEMENT FROM 1-D INTEGER ARRAY.
package com.returnmethod;

class firsthalf
{
	int[] first(int[] arr)
	{
		int a[]=new int[arr.length/2];
		for(int i=0;i<arr.length/2;i++)
		{
			a[i]=arr[i];
		}
		return a;
	}
}
public class progr1 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		firsthalf obj1=new firsthalf();
		int[] val=obj1.first(arr);
		for(int i=0;i<val.length;i++)
		{
			System.out.print(val[i]);
		}
	}
}

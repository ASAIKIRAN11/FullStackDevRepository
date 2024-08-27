//THE METHOD HAS TO RETURN 2ND HALF OF THE ELEMENT FROM 1-D SHORT ARRAY.
package com.returnmethod;

class twohalf
{
	short[] twoelement(short[] arr)
	{
		short a[]=new short[arr.length/2];
		int j=0;
		for(int i=a.length;i<arr.length;i++)
		{
			a[j]=arr[i];
			j++;
		}
		return a;
	}
}
public class progr3 {
	public static void main(String[] args) {
		short[] arr= {1,2,3,4,5,6};
		twohalf obj1=new twohalf();
		short[] val=obj1.twoelement(arr);
		for(int i=0;i<val.length;i++)
		{
			System.out.println(val[i]);
		}
	}
}

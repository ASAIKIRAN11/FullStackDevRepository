//THE METHOD HAS TO RETURN DIAGONAL ELEMENTS FROM GIVEN 2-D SHORT ARRAY.
package com.returnmethod;

class diagonal
{
	short[] diagon(short arr[][])
	{
		short diag[]=new short[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			diag[i]=arr[i][i];
		}
		return diag;		
	}
}
public class progr10 {
	public static void main(String[] args){
		short arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
		diagonal ob1=new diagonal();
		short[] val=ob1.diagon(arr);
		for(int i=0;i<val.length;i++)
		{
			System.out.println(val[i]);
		}
	}
}

//4th
package com.classtest2;

class trans
{
	static int[][] arr(int a[][])
	{
		int[][] res=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				res[j][i]=a[i][j];
			}
		}
		return res;
	}
}
public class prog1 {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] val=trans.arr(a);
		for(int i=0;i<val.length;i++)
		{
			for(int j=0;j<val[i].length;j++)
			{
				System.out.print(val[i][j]);
			}
			System.out.println();
		}
	}
}
package com.returnmethod;

class maths
{
	int[][] matrixaddition(int x[][],int y[][])
	{
		int[][] res=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				res[i][j]=x[i][j]+y[i][j];
			}
		}
		return res;
	}
}
public class Demo {
	public static void main(String[] args) {
		maths obj1=new maths();
		int x[][]= {{10,20,30},{50,60,70}};
		int y[][]= {{2,4,6},{1,3,5}};
		int c[][]=obj1.matrixaddition(x,y);
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
		
		//Sum of all result element
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				sum+=c[i][j];
			}
		}
		System.out.println(sum+ " ");
		
		//Display the 1st row of the element
		for(int i=0;i<c[0].length;i++)
		{
			System.out.print(c[0][i]+" ");
		}
		System.out.println();
	}
}

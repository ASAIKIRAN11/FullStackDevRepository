package com.classtest;

class fourteen
{
	int countarrayelement(short arr[][])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				count++;
			}
		}
		return count;
	}
}
public class pr15 {
	public static void main(String args[]) {
		short[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		fourteen obj=new fourteen();
		int val=obj.countarrayelement(arr);
		System.out.println(val);
	}
}
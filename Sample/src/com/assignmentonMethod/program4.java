//GIVEN 3X3 2D INTEGER ARRAY, TRANSPOSE THE ELEMENTS.
package com.assignmentonMethod;

class twod3x3
{
	void arr(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}
public class program4 {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		twod3x3 obj1=new twod3x3();
		obj1.arr(a);
	}
}



/*class twod3x3 
{
    int[][] arr(int[][] a)
    {
        int[][] transposed = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                transposed[j][i] = a[i][j];
            }
        }
        return transposed;
    }
}

public class program4 {
    public static void main(String[] args)
    {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        twod3x3 obj1 = new twod3x3();
        int[][] result = obj1.arr(a);
        for (int i = 0; i < result.length; i++) 
        {
            for (int j = 0; j < result[i].length; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

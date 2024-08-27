//THE METHOD HAS TO DISPLAY CUBE OF EACH ELEMENT.
package com.assignmentonMethod;

class cubeofno
{
	void cube(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]*a[i]*a[i]);
		}
	}
}
public class program10 {
	public static void main(String[] args) {
		int a[]={1,2,3,4};
		cubeofno obj1=new cubeofno();
		obj1.cube(a);
	}
}



/*class CubeOfNo 
{
    int[] cube(int[] a) 
    {
        int[] cubes = new int[a.length];
        for (int i = 0; i < a.length; i++) 
        {
            cubes[i] = a[i] * a[i] * a[i];
        }
        return cubes;
    }
}
public class program10 {
    public static void main(String[] args) 
    {
        int[] a = {1, 2, 3, 4};
        CubeOfNo obj1 = new CubeOfNo();
        int[] val = obj1.cube(a);
        for(int i=0;i<val.length;i++){
            System.out.println(val[i]);
        }
    }
}*/

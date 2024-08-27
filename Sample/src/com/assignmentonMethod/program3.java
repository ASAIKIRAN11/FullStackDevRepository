//GIVEN BOOLEAN 1D ARRAY, DISPLAY ELEMENTS IN REVERSE ORDER.
package com.assignmentonMethod;

class onedboolean
{
	void arr(boolean a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+ " ");
		}
	}
}
public class program3 {
	public static void main(String[] args) {
		boolean a[]= {true,false,false,true,true,true,false,true};
		onedboolean obj1=new onedboolean();
		obj1.arr(a);
	}
}


/*class onedboolean {
    boolean[] arr(boolean[] a) {
        boolean[] reversed = new boolean[a.length];
        int j=0;
        for (int i=a.length-1;i>=0;i--) {
            reversed[j] = a[i];
            j++;
        }
        return reversed;
    }
}

public class program3 {
    public static void main(String[] args) {
        boolean[] a = {true, false, false, true, true, true, false, true};
        onedboolean obj1 = new onedboolean();
        boolean[] val = obj1.arr(a);

        for(int i=0;i<val.length;i++) {
            System.out.println(val[i] + " ");
        }
    }
}*/
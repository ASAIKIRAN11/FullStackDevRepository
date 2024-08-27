//
package com.strings;

class DayString
{
    static String dayString(String str)
    {
        String s1="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='Y') 
            {
                s1+=str.charAt(i);
                if(i<str.length()-2)
                    s1 += ", ";
            }
            else 
            {
                s1+=str.charAt(i);
            }
        }
        return s1;
    }
}
public class four {
    public static void main(String[] args) {
        String res=DayString.dayString("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");
        System.out.println(res);
    }
}
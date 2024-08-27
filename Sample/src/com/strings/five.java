//
package com.strings;

class DeleteDayString
{
    static String deleteEachOccurenceOfDay(String str)
    {
        String s1="";
        int firstIndex=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='D'&& str.charAt(i+1)=='A'&& str.charAt(i+2)=='Y')
            {
                s1+=str.substring(firstIndex,i)+" ";
                firstIndex=i+3;
                i+=2;
            }
        }
        return s1;
    }
}
public class five {
    public static void main(String[] args) {
        String res=DeleteDayString.deleteEachOccurenceOfDay("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");
        System.out.println(res);
    }
}
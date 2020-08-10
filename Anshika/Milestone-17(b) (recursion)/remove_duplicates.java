//https://codezen.codingninjas.com/practice/468/91/remove-duplicates

import java.util.*;
class remove_duplicates
{

    public static String removeConsecutiveDuplicates(String s)
    {
        return recur(s,0);
    }

    static String recur (String s, int i)
    {
        if (i==s.length())
            return "";
        else
        {
            if (i>0 && s.charAt(i)==s.charAt(i-1))
                return "" + recur(s,i+1);
            else
                return s.charAt(i)+recur(s,i+1);
        }
    }

    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a string");
        String s=sc.nextLine();

        String n=removeConsecutiveDuplicates(s);
        System.out.println ("String after removing duplicates : "+n);
    }
}
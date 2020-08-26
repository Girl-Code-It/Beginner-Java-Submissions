//https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string/0

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collections;

class Permutation_of_a_given_String
 {
    
    static ArrayList<String> permutation (String s, int i, int j, ArrayList<String> li)
    {
        if (i==s.length()-1)
        {
            li.add(s);
            return li;
        }
        if (j==s.length())
        {
            return li;
        }
        else
        {
            char temp;
            char[] ch=s.toCharArray();
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            permutation(String.valueOf(ch),i+1,i+1,li);
            permutation(s,i,j+1,li);

        }
        return li;
    }
    
	public static void main (String[] args) {
	    
		//code
		Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        
        while (t>0)
        {
        String s=sc.nextLine();
        ArrayList<String> li=new ArrayList<String>();

        li=permutation (s,0,0,li);
        Collections.sort(li);
        
        for (int i=0; i<li.size(); i++)
        {
            System.out.print (li.get(i)+" ");
        }
        System.out.println ();
        t--;
        }
	}
}
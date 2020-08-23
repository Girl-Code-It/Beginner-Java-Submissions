//https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/pizza-confusion/description/?layout=old


import java.util.*;
import java.util.Collections;

class Pizz_Confusion {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        int ar[]=new int[n];
        for (int i=0; i<n; i++)
        {
            s[i]=sc.next();
            ar[i]=sc.nextInt();
        }

        int max=ar[0];

        for (int i=0; i<n; i++)
        {
            if (ar[i]>max)
            max=ar[i];
        }

        ArrayList<String> li=new ArrayList<String>();

        for (int i=0; i<n; i++)
        {
            if (max==ar[i])
            {
                li.add(s[i]);
            }
        }

        String temp;
        for (int i=0; i<li.size(); i++)
        {
            for (int j=0; j<li.size()-1-i; j++)
            {
                if (li.get(j).compareTo(li.get(j+1))>0)
                {
                    temp=li.get(j);
                    li.set(j,li.get(j+1));
                    li.set(j+1,temp);
                }
            }
        }
        System.out.println (li.get(0));

    }
}
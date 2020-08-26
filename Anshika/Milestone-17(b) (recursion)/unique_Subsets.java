import java.util.*;
import java.util.Collections;

class unique_Subsets
{
    static ArrayList<String> sub (String s, int i, int l, ArrayList<String> li)
    {
        if (i==l)
        {
            li.add(s);
        }
        else
        {
             sub (s.substring(0,i)+s.substring(i+1),i,l-1,li);
             sub (s,i+1,l,li);
        }
        return li;
    }

    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a string");
        String s=sc.nextLine();
        
        ArrayList<String> li=new ArrayList<String>();

        li=sub (s,0,s.length(),li);
        Collections.sort(li);
        
        ArrayList<String> l=new ArrayList<String>();
        String store=li.get(0);
        for (int i=1; i<li.size(); i++)
        {
            if (store.equals(li.get(i)))
            {
                continue;
            }
            else
            {
                l.add(store);
                store=li.get(i);
            }
        }
        l.add(store);
        System.out.println (l);
        
    }
}
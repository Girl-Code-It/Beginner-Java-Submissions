import java.util.*;
class Subsets
{
    static void sub (String s, int i, int l)
    {
        if (i==l)
        {
            System.out.println (s);
            return;
        }
        else
        {
            sub (s.substring(0,i)+s.substring(i+1),i,l-1);
            sub (s,i+1,l);
        }
    }

    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a string");
        String s=sc.nextLine();

        sub (s,0,s.length());
    }
}
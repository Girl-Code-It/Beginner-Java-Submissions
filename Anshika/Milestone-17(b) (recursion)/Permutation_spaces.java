     import java.util.*;
class Permutation_spaces
{
    static void permutation (String s, int i, int l)
    {
        if (i==l)
        {
            System.out.println (s);
            return;
        }
        else
        {
            permutation (s.substring(0,i)+" "+s.substring(i),i+2,l+1);
            permutation (s,i+1,l);
        }
    }

    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a string");
        String s=sc.nextLine();

        permutation (s,1,s.length());
    }
}
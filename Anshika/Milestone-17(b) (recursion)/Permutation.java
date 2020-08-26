import java.util.*;
import java.util.Arrays;
class Permutation
{
    static void permutation (String s, int i, int j)
    {
        if (i==s.length()-1)
        {
            System.out.println (s);
            return;
        }
        if (j==s.length())
        {
            return;
        }
        else
        {
            char temp;
            char[] ch=s.toCharArray();
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            permutation(String.valueOf(ch),i+1,i+1);
            permutation(s,i,j+1);

        }
    }

    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a string");
        String s=sc.nextLine();

        permutation (s,0,0);
    }
}
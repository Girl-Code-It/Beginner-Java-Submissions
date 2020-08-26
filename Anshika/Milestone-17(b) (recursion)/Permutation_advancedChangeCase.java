import java.util.*;
class Permutation_advancedChangeCase
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
            if (Character.isDigit(s.charAt(i)))
                permutation (s,i+1,l);
            else
            {
                if (Character.isLowerCase(s.charAt(i)))
                {
                    permutation (s.substring(0,i)+Character.toUpperCase(s.charAt(i))+s.substring(i+1),i+1,l);
                    permutation (s,i+1,l);
                }
                else
                {
                    permutation (s.substring(0,i)+Character.toLowerCase(s.charAt(i))+s.substring(i+1),i+1,l);
                    permutation (s,i+1,l);

                }
            }
        }
    }

        public static void main (String args[])
        {
            Scanner sc=new Scanner (System.in);
            System.out.println ("Enter a string");
            String s=sc.nextLine();

            permutation (s,0,s.length());
        }
    }
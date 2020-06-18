/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/secret-messages/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class SecretMessages {
    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt ();

            int value, extra;
            char ch[]=new char[n];

            String s=sc.next();
            ch=s.toCharArray();

            int l=k%26, d=k%10;

            for (int i=0; i<n; i++)
            {
            
            value=(int)ch[i];

                if (Character.isLetter(ch[i])==true)
                {
                    
                    if (Character.isUpperCase(ch[i])==true)
                    {
                        if (value+l>90)
                        {
                            extra=value+l-90;
                            value=64+extra;// we can also write in such  a case that if (value+l>90) then value+l-26;
                        }
                        else
                        value=value+l;                       
                    }

                    else
                    {
                        if (value+l>122)
                        {
                            extra=value+l-122;
                            value=96+extra;
                        }
                        else
                        value=value+l;
                    }
                }
                else if (Character.isDigit(ch[i])==true)
                {
                    if (value+d>57)
                    {
                        extra=value+d-57;
                        value=extra+47;// we can also write that if (value+d>57)then the new value is value+d-10;
                    }
                    else
                    value=value+d;
                }
                else
                continue;

                ch[i]=(char)value;
            }

            for (int i=0; i<n; i++)
            {
                System.out.print (ch[i]);
            }
            System.out.println ();
            

            t--;
        }
        // Write your code here

    }
}

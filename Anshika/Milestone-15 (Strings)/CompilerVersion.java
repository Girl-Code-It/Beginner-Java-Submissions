/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/compiler-version-2/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class CompilerVersion {
    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        while (sc.hasNextLine())
        {
            String n="";
            char ch, ch1;
            boolean flag=false;

            for (int i=0; i<s.length()-1; i++)
            {
               ch=s.charAt(i);
               ch1=s.charAt(i+1);

               if (ch=='/'&&ch1=='/')
               {
                  n=n+s.substring(i);
                  flag=true;
                  break;
               }
               else if (ch=='-'&&ch1=='>')
               {
                  n=n+".";
                  i++;
               }
               else
                  n=n+ch;
                  
            }
            if (flag==true)
            System.out.println (n);
            else if (s.endsWith("->"))
            System.out.println (n);
            else
            System.out.println (n+s.charAt(s.length()-1));
            s=sc.nextLine();
        }
        String n="";
            char ch, ch1;
            boolean flag=false;

            for (int i=0; i<s.length()-1; i++)
            {
               ch=s.charAt(i);
               ch1=s.charAt(i+1);

               if (ch=='/'&&ch1=='/')
               {
                  n=n+s.substring(i);
                  flag=true;
                  break;
               }
               else if (ch=='-'&&ch1=='>')
               {
                  n=n+".";
                  i++;
               }
               else
                  n=n+ch;
            }
            if (flag==true )
            System.out.println (n);
            else
            System.out.println (n+s.charAt(s.length()-1));
        // Write your code here

    
    }
    
}

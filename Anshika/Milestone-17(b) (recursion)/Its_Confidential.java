//https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/its-confidential-f006e2c4/


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class Its_Confidential
 {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while (t>0)
        {
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();

            String ne=encrypt(s,n);

            System.out.println (ne);
            t--;
        }

    }

    static String encrypt (String s, int n)
    {
        if (s.isEmpty())
        return "";
        else
        {
            int c;
            if (s.length()%2==0)
            c=s.length()/2-1;
            else
            c=s.length()/2;
            return s.charAt(c) + encrypt (s.substring(0,c),s.substring(0,c).length()) + encrypt (s.substring(c+1),s.substring(c+1).length());
        }
    }
}

/*
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/breakup-app/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class BreakupApp {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int t=Integer.parseInt (br.readLine());
        int c19=0, c20=0, co=0;

        while (t>0)
        {
            String s=br.readLine();

            char ch1,ch2;
            int cnt19=0, cnt20=0, cnto=0;
            for (int i=3; i<s.length()-1; i++)
            {
                ch1=s.charAt(i);
                ch2=s.charAt(i+1);

                if (ch1=='1'&&ch2=='9')
                {
                    cnt19++;
                    i++;
                    
                }
                else if (ch1=='2'&&ch2=='0')
                {
                    cnt20++;
                    i++;
                    
                }
                else if (Character.isDigit(ch1) && Character.isDigit(ch2))
                {
                    cnto++;
                    i++;
                    
                }
                else if (Character.isDigit(ch1))
                {
                    cnto++;
                    
                }
            }

            if (s.charAt(0)=='G')
            {
                cnt19*=2;
                cnt20*=2;
                cnto*=2;
            }
            c19=c19+cnt19;
            c20=c20+cnt20;
            co=co+cnto;
            
            t--;
        }

        

        if (c19>co || c20>co && c19!=c20)
        System.out.println ("Date");
        else 
        System.out.println ("No Date");

        // Write your code here

    }
}

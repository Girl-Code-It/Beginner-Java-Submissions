/*
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/mannas-first-name-4/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class MannaFirstname
 {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt (br.readLine());
       while (t>0)
       {
           String s=br.readLine();
           int cnt1=0, cnt2=0;
           String store1="", store2="";

           for (int i=0; i<=s.length()-4; i++)
           {
               store1=s.substring(i,i+4);
               if (i+7<=s.length())
               {                   
                   store2=s.substring(i,i+7);
               }

               if (store1.equals("SUVO") && store2.equals("SUVOJIT")==false)
               {
                   cnt1++;                   
               }
               else if (store2.equals("SUVOJIT"))
               {
                   cnt2++;
                   store2="";
               }

           }

           System.out.println ("SUVO = "+cnt1+", SUVOJIT = "+cnt2);
           t--;
       }
    }
}

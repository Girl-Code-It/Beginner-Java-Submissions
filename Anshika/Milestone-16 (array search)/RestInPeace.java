/*
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/rest-in-peace-21-1/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class RestInPeace {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt (br.readLine());
        while (t>0)
        {
            int num=Integer.parseInt (br.readLine());
            if (num%21==0)
            {
                System.out.println ("The streak is broken!");
            }
            else
            {
                String s=Integer.toString(num);
                char ch[]=s.toCharArray();
                char c1, c2;
                boolean flag=false;

                for (int i=0; i<ch.length-1; i++)
                {
                    c1=ch[i];
                    c2=ch[i+1];

                    if (c1=='2' && c2=='1')
                    {
                        flag=true;
                        break;
                    }
                }

                if (flag==true)
                System.out.println ("The streak is broken!");
                else
                System.out.println ("The streak lives still in our heart!");
            }

            t--;
        }

        // Write your code here

    }
}

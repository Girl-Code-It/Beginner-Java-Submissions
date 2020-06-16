/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/capicua-2/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class Capicúa {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t>0)
        {
            String s=br.readLine();
            char ch[]=s.toCharArray();
            boolean flag=false;

            for (int i=0; i<ch.length/2; i++)
            {
                if (ch[i]!=ch[ch.length-1-i])
                {
                    flag=true;
                    break;
                }
            }

            if (flag==false)
            {
                System.out.println ("YES");
            }
            else
            {
                System.out.println ("NO");
            }

            t--;
        }

        // Write your code here

    }
}

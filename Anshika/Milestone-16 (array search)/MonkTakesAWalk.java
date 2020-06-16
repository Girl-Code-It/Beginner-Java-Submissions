/*
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/monk-takes-a-walk/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class MonkTakesAWalk {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt (br.readLine());

        while (t>0)
        {
            String s=br.readLine();
            s=s.toLowerCase();
            char ch[]=s.toCharArray();

            int cnt=0;
            for (int i=0; i<ch.length; i++)
            {
                if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
                cnt++;
            }

            System.out.println (cnt);
            t--;
        }

    }
}

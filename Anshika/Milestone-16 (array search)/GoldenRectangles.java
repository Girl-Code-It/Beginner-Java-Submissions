/*
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/almost-golden-rectangular-1c9d72c0/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class GoldenRectangles {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int cnt=0;

        while (t>0)
        {
            int w=sc.nextInt();
            int h=sc.nextInt();
            int max=Math.max(w,h);
            int min=Math.min(w,h);
            double ratio=(double)max/(double)min;
            
            if (ratio>=1.6 && ratio<=1.7)
            {
                cnt++;
                
            }
           

            t--;
        }

        System.out.println (cnt);

    }
}

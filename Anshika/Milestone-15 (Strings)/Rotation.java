/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/rotation-1-38ecf5a7/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Rotation{
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt (br.readLine());
        String s = br.readLine ();                // Reading input from STDIN
        char c[]=s.toCharArray();
        String ne = br.readLine ();
        char nn[]=ne.toCharArray();
        
        
        int cnt=0, x;
        String store, st;

        for (int j=0; j<n; j++)
        {
            store=s.substring (j);
            x=n-j;
            st=ne.substring (0,x);
            cnt++;
            if (store.equals(st))
            {
                break;
            }
        }

        System.out.println (cnt-1);
        // Write your code here

    }
}

/*
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/simple-search-4/
 */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class SimpleSearch {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for (int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int i=0;
        for ( i=0; i<n; i++)
        {
            if (a[i]==k)
            {
                break;
            }
        }
        System.out.println (i);

        // Write your code here

    }
}

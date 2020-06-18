/*
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/min-max-8/
 */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MinMax {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
       
       int n=sc.nextInt();
       int ar[]=new int[n];
       int sum=0;
       for (int i=0; i<n; i++)
       {
           ar[i]=sc.nextInt();
           sum=sum+ar[i];
       }

       int max=ar[0], min=ar[0];
       for (int i=0; i<n; i++)
       {
           if (ar[i]>max)
           {
               max=ar[i];
           }
           if (ar[i]<min)
           {
               min=ar[i];
           }
       }

       int minimum=sum-max;
       int maximum=sum-min;

       System.out.println (minimum+" "+maximum);

        // Write your code here

    }
}

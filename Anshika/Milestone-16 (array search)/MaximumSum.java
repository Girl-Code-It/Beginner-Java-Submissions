/*
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/maximum-sum-4-f8d12458/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class MaximumSum {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int ar[]=new int[n];
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }

        long cntp=0, sump=0, max=0;
        

        for (int i=0; i<n; i++)
        {
            if (ar[i]<0)
            {
                max=ar[i];
                
                break;
            }
        }
        


        for (int i=0; i<n; i++)
        {
            if(ar[i]>=0)
            {
                cntp++;
                sump=sump+ar[i];
            }
            else if (ar[i]<0)
            {
                
                if (ar[i]>max)
                {
                    max=ar[i];
                }
            }
            
            
        }
        
        if (cntp!=0)
        System.out.println (sump+" "+(cntp));
        else 
        System.out.println (max+" 1");
        

        // Write your code here

    }
}

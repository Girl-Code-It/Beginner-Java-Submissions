/*
 * https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/bishu-and-soldiers/description/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
import java.util.Arrays;

class BishuandSoldiers
{
    public static void main(String args[] ) throws Exception {
        
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int ar[]=new int[n];
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);

        int q=sc.nextInt();
        while (q>0)
        {
            int qr=sc.nextInt();
            int cnt=0, sum=0;
            
            for (int i=0; i<n; i++)
            {
                if (ar[i]>qr)
                break;
                cnt++;
                sum=sum+ar[i];
            }
                
            

            System.out.println (cnt+" "+sum);

            q--;
        }


    }
}

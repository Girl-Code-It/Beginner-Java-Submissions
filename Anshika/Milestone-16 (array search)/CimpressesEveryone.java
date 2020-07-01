/*
 * https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/c-impresses-everyone/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class CimpressesEveryone {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        int a[]=new int[n];
        int sum=0;
        for(int i=0; i<n; i++)
        {
            ar[i]=s.nextInt();
            sum=sum+ar[i];
            a[i]=sum;
        }
        
        int q=s.nextInt();
        while (q>0)
        {
            int qr=s.nextInt();
            int srch=sum-qr+1;
            int mid=0, max=n, min=0;
            
            while (min<=max)
            {
                mid=(min+max)/2;
                if (a[mid]>=srch && mid >=1 && a[mid-1]<srch )
                {
                    
                    break;
                }
                else if (a[mid]>=srch && mid==0)
                {
                    break;
                }
                else if (a[mid]<srch)
                {
                    min=mid+1;
                }
                else if (a[mid]>srch)
                max=mid-1;
            }

            
            
                if (mid%2==0)
                {
                    System.out.println ("A");
                }
                else
                System.out.println ("B");
            
            q--;
        }

    }
}

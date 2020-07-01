/*
 * https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/bags-of-coins-7b1d612c/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class Coins
 {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int ar[]=new int[n];
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }

        boolean flag=false;
        int min=0, max=ar[ar.length-1], mid;
        int sl=0, sr=0;
        for (int i=0; i<n-1; i++)
        {
            if (ar[i]>ar[i+1])
            {
                flag=true;
                break;
            }
        }

        if (flag==false)
        {
           while (min<=max)
           {
                mid=(min+max)/2;

                sl=0;
                sr=0;
                sl=sum_left(ar,mid);
                sr=sum_right(ar,mid);
                
                if (sl==sr && sl!=0 && sr!=0)
                {
                    System.out.println ("YES");
                    flag=true;
                    break;
                }
                else if (sl>sr)
                {
                    max=mid-1;
                }
                else
                {
                    min=mid+1;
                }
            }

            if (flag==false)
            System.out.println ("NO");
            
        }
        else
        System.out.println ("NO");
    }

    static int sum_left(int ar[], int x)
    {
        int i=0, sum=0;
        while (i<ar.length && ar[i]<x)
        {
            sum=sum+ar[i++];
        }
        return sum;
    }

    static int sum_right (int ar[], int x)
    {
        int i=ar.length-1, sum=0;
        while (i>=0 && ar[i]>x)
        {
            sum=sum+ar[i--];
        }
        return sum;
    }

}

//https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/criminals-little-deepu-and-little-kuldeep/


import java.util.*;
import java.util.Collections;

class Criminals {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);

        int t=sc.nextInt();
        while (t>0)
        {
            int n=sc.nextInt();
            int ar[]=new int[n];
            for (int i=0; i<n; i++)
            {
                ar[i]=sc.nextInt();
            }

            mergeSort(ar,0,n-1);

            ArrayList<Integer> li=new ArrayList<Integer>();

            int store=ar[0], cnt=1;

            for (int i=1; i<n; i++)
            {
                if (ar[i]==store)
                cnt++;
                else
                {
                    li.add(cnt);
                    store=ar[i];
                    cnt=1;
                }
            }
            li.add(cnt);

            Collections.sort(li);

            System.out.println (li.get(li.size()-1));

            t--;
        }

    }

    static void mergeSort (int[]ar, int min, int max)
    {
        if (min<max)
        {
            int mid=(min+max)/2;

            mergeSort(ar,min,mid);
            mergeSort(ar,mid+1,max);

            merge(ar,min,mid,max); 
        }
    }

    static void merge (int[] ar, int min, int mid, int max)
    {
        int i=min, j=mid+1, x=0;
        int a[]=new int[max-min+1];

        while (i<=mid && j<=max)
        {
            if (ar[i]<ar[j])
            {
                a[x]=ar[i];
                i++;
            }
            else
            {
                a[x]=ar[j];
                j++;
            }
            x++;
        }

        for (int k=i; k<=mid; k++)
        {
            a[x]=ar[k];
            x++;
        }

        for (int k=j; k<=max; k++)
        {
            a[x]=ar[k];
            x++;
        }
        
        int z=0;
        for (int k=min; k<=max; k++)
        {
            ar[k]=a[z++];
        }
    }
}

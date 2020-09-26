//hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/match-makers/


import java.util.*;

class Match_Makers
 {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while (t>0)
        {
            int n=sc.nextInt();
            int g[]=new int[n];
            int b[]=new int[n];
            for (int i=0; i<n; i++)
            {
                g[i]=sc.nextInt();
            }
            for (int i=0; i<n; i++)
            {
                b[i]=sc.nextInt();
            }

            mergeSort(g,0,n-1);
            Mergesort(b,0,n-1);

            int cnt=0;
            for (int i=0; i<n; i++)
            {
                if ((b[i]!=0 && g[i]%b[i]==0) || (g[i]!=0 && b[i]%g[i]==0))
                cnt++;
            }

            System.out.println (cnt);

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

    static void Mergesort (int[]ar, int min, int max)
    {
        if (min<max)
        {
            int mid=(min+max)/2;

            Mergesort(ar,min,mid);
            Mergesort(ar,mid+1,max);

           Merge(ar,min,mid,max); 
        }
    }

    static void Merge (int[] ar, int min, int mid, int max)
    {
        int i=min, j=mid+1, x=0;
        int a[]=new int[max-min+1];

        while (i<=mid && j<=max)
        {
            if (ar[i]>ar[j])
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

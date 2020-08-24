import java.util.*;
class Merge_Sort
{

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

    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array");
        int n=sc.nextInt();

        int ar[]=new int[n];
        System.out.println ("Enter values in array");
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }

        mergeSort(ar,0,n-1);

        System.out.println ("Sorted Array -");
        for (int i=0; i<n; i++)
        {
            System.out.print (ar[i]+" ");
        }
    }
}
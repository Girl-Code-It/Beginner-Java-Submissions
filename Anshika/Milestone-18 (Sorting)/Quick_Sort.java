import java.util.*;
class Quick_Sort
{

    static void quickSort (int[] ar, int min, int max)
    {
        if (min<max)
        {
            int p=partition (ar,min,max);

            quickSort(ar,min,p);
            quickSort(ar,p+1,max);
        }
    }

    static int partition(int[] ar, int min, int max)
    {

        int j=min;
        int k=max;
        while (j<k)
        {
            while (j<max+1 && ar[j]<ar[min])
            {
                j++;
            }

            while (k>=0 && ar[k]>ar[min])
            {
                k--;
            }
            if (j<k)
            {
                int temp=ar[j];
                ar[j]=ar[k];
                ar[k]=temp;
            }
        }

        int temp=ar[min];
        ar[min]=ar[k];
        ar[k]=temp;

        return k;
    }

    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array");
        int n=sc.nextInt();

        int ar[]=new int[n];
        System.out.println ("Enter elements in array");
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }

        quickSort(ar,0,n-1);

        System.out.println ("Sorted Array - ");
        for (int i=0; i<n; i++)
        {
            System.out.print (ar[i]+" ");
        }
    }
}
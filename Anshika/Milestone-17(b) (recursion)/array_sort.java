import java.util.*;
class array_sort
{

    static int[] sort (int[] ar, int i, int j, int l)
    {
        if (l==0)
            return ar;
        else if (j==l)
        {
            return sort (ar,0,1,l-1);
        }
        else if (ar[i]>ar[j])
        {
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;

            return sort (ar,i+1,j+1,l);
        }
        else
        {
            return sort (ar,i+1,j+1,l);
        }
    }

    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of the array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println ("Enter elements in unsorted array");
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }

        int a[]=sort(ar,0,1,n);
        System.out.println ("Sorted array -");
        for (int i=0; i<n; i++)
        {
            System.out.print (a[i]+" ");
        }
    }
}
import java.util.*;
class Bubble_Sort
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);

        System.out.println ("Enter size of the array");
        int n=sc.nextInt();

        int ar[]=new int[n];
        System.out.println ("Enter elements in the array");
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }

        int temp;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n-1-i; j++)
            {
                if (ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }

        System.out.println ("Sorted Array -");
        for (int i=0; i<n; i++)
        {
            System.out.print (ar[i]+" ");
        }
    }
}
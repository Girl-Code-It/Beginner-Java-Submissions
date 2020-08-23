import java.util.*;
class Insertion_Sort
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter length of array");
        int n=sc.nextInt();

        int ar[]=new int[n];
        System.out.println ("Enter elements");
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }
        
        int store, temp;
        for (int i=1; i<n; i++)
        {
            store=ar[i];
            temp=i;
            while (temp>0 &&  store<ar[temp-1])
            {
                ar[temp]=ar[temp-1];
                temp--;
            }
            ar[temp]=store;
        }

        System.out.println ("Sorted array -");
        for (int i=0; i<n; i++)
        {
            System.out.print (ar[i]+" ");
        }
    }
}

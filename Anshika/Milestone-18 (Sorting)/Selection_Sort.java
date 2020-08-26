import java.util.*;
class Selection_Sort
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

        int temp, min, index;
        for (int i=0; i<n-1; i++)
        {
            min=ar[i];
            index=i;
            for (int j=i+1; j<n; j++)
            {
                if (ar[j]<min)
                {
                    min=ar[j];
                    index=j;
                }
            }
            
            temp=ar[index];
            ar[index]=ar[i];
            ar[i]=temp;
        }

        System.out.println ("Sorted Array -");
        for (int i=0; i<n; i++)
        {
            System.out.print (ar[i]+" ");
        }
    }
}
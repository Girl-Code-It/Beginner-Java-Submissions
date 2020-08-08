//https://codezen.codingninjas.com/practice/468/712/find-floor-value
import java.util.*;
class find_floor_value
{
    public static int findFloor(int[] array, int element)
    {
        return recur(array,element,0);		
    }

    static int recur (int[] ar, int x, int i)
    {
        if (i==ar.length)
        {
            return ar[i-1];
        }
        else
        {
            if (ar[i]<x)
                return recur(ar,x,i+1);
            else
                return ar[i-1];
        }
    }

    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);

        System.out.println ("Enter size of array");
        int n=sc.nextInt();
        System.out.println ("Enter elements in ascending order");
        int ar[]=new int[n];
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }

        System.out.println ("Enter value of x");
        int x=sc.nextInt();

        int i=findFloor(ar,x);
        System.out.println ("required answer is : "+i);
    }
}
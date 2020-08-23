//https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/bubble-sort-15-8064c987/description/?layout=old


import java.util.*;


class Bubble_Sort_Hack {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int ar[]=new int[n];
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }

        int cnt=BubbleSort(ar);
        System.out.println (cnt);
    }

    static int BubbleSort (int[] ar)
    {
        int cnt=0;
        int n=ar.length;
        boolean swap=true;

        while (swap==true)
        {
            swap=false;
            cnt++;

            for (int i=0; i<n-1; i++)
            {
                if (ar[i]>ar[i+1])
                {
                    int temp=ar[i];
                    ar[i]=ar[i+1];
                    ar[i+1]=temp;

                    swap=true;
                }  
            }
        }

        return cnt;
    }
}
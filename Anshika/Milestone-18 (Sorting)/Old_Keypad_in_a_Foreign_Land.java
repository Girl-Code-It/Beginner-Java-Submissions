//https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/practice-problems/algorithm/old-keypad-in-a-foreign-land-24/


import java.util.*;
import java.util.Arrays;

class Old_Keypad_in_a_Foreign_Land
 {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);

        int n=sc.nextInt();
        int ar[]=new int[n];
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }

        int k=sc.nextInt();
        int kr[]=new int[k];
        int sum=0;
        for (int i=0; i<k; i++)
        {
            kr[i]=sc.nextInt();
            sum=sum+kr[i];
        }

        if (sum<n)
        {
            System.out.println ("-1");
        }
        else
        {
            Arrays.sort(ar);
            Arrays.sort(kr);

            int temp;
            for (int i=0; i<n/2; i++)
            {
                temp=ar[i];
                ar[i]=ar[n-1-i];
                ar[n-1-i]=temp;
            }
            for (int i=0; i<k/2; i++)
            {
                temp=kr[i];
                kr[i]=kr[k-1-i];
                kr[k-1-i]=temp;
            }
            

            ArrayList<ArrayList<Integer>> li=new ArrayList<ArrayList<Integer>>();

            int x=0,j=0;

            while (x<n)
            {
                li.add(new ArrayList<Integer>());

                for (int i=0; i<k; i++)
                {
                    if (j>kr[i]-1)
                    continue;
                    if (x!=n)
                    {
                        li.get(j).add(ar[x]);
                        x++;
                    }
                    else
                    break;
                }

                j++;
            }

            long ssum=0;
            for (int i=0; i<li.size(); i++)
            {
                for (j=0; j<li.get(i).size(); j++)
                {
                    ssum=ssum+(i+1)*li.get(i).get(j);
                }
            }

            System.out.println (ssum);
        }

    }
}

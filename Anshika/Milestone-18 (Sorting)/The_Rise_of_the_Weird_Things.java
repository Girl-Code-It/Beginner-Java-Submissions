//https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/practice-problems/algorithm/the-rise-of-the-weird-things-1/description/?layout=old


import java.util.*;

class The_Rise_of_the_Weird_Things
{
    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner (System.in);

        int n=sc.nextInt();
        int ar[]=new int[n];

        ArrayList<Integer> l1=new ArrayList<Integer>();
        ArrayList<Integer> l2=new ArrayList<Integer>();
        int sume=0, sumo=0;

        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
            if (ar[i]%2==0)
            {
                l2.add(ar[i]);
                sume=sume+ar[i];
            }
            else
            {
                l1.add(ar[i]);
                sumo=sumo+ar[i];
            }   
        }

        Collections.sort(l1);
        Collections.sort(l2);

        for (int i=0; i<l2.size(); i++)
        {
            System.out.print (l2.get(i)+" ");
        }
        System.out.print (sume+" ");
        
        for (int i=0; i<l1.size(); i++)
        {
            System.out.print (l1.get(i)+" ");
        }
        System.out.print (sumo+" ");


        System.out.println ();

    }
}
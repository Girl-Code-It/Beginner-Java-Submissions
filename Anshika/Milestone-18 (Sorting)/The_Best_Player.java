//https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/the-best-player-1/


import java.util.*;


class The_Best_Player {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);

        int n=sc.nextInt();
        int t=sc.nextInt();

        String s[]=new String[n];
        int ar[]=new int[n];

        for (int i=0; i<n; i++)
        {
            s[i]=sc.next();
            ar[i]=sc.nextInt();
        }

        int temp;
        String ss;

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n-1-i; j++)
            {
                if (ar[j]<ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;

                    ss=s[j];
                    s[j]=s[j+1];
                    s[j+1]=ss;
                }
            }
        }

       ArrayList<String> l3=new ArrayList<String>();
        ArrayList<ArrayList<String>> l2=new ArrayList<ArrayList<String>>();

        int store=ar[0], x=0;
        l2.add(new ArrayList<String>());
        l2.get(x).add(s[0]);

        for (int i=1; i<n; i++)
        {
            if (ar[i]==store)
            l2.get(x).add(s[i]);

            else
            {
                store=ar[i];
                l2.add(new ArrayList<String>());
                x++;
                l2.get(x).add(s[i]);
            }
        }


        for (int i=0; i<=x; i++)
        {
            Collections.sort(l2.get(i));
        }

        int k=0;
        boolean flag=false;
        for (int i=0; i<=x; i++)
        {
            for (int j=0; j<l2.get(i).size(); j++)
            {
                if (k==t)
                {
                    flag=true;
                    break;
                }
                l3.add(l2.get(i).get(j));
                k++;
            }
            if (flag==true)
            break;
        }

        for (int i=0; i<l3.size(); i++)
        {
            System.out.println (l3.get(i));
        }
        
    }
}

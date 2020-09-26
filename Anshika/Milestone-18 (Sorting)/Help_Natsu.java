//https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/help-natsu/


import java.util.*;


class Help_Natsu {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();

        while (t>0)
        {
            int n=sc.nextInt();
            String s[]=new String[n];
            for (int i=0; i<n; i++)
            {
                s[i]=sc.next();
            }

            mergeSort(s,0,n-1);

            ArrayList<String> l1=new ArrayList<String>();
            ArrayList<Integer> l2=new ArrayList<Integer>();

            String store=s[0];
            int cnt=1;

            for (int i=1; i<n; i++)
            {
                if (store.equals(s[i]))
                cnt++;
                else
                {
                    l1.add(store);
                    l2.add(cnt);
                    cnt=1;
                    store=s[i];
                }
            }
            l1.add(store);
            l2.add(cnt);

            int temp;
            for (int i=0; i<l1.size(); i++)
            {
                for (int j=0; j<l1.size()-1-i; j++)
                {
                    if (l2.get(j)>l2.get(j+1))
                    {
                        temp=l2.get(j);
                        l2.set(j,l2.get(j+1));
                        l2.set(j+1,temp);

                        store=l1.get(j);
                        l1.set(j,l1.get(j+1));
                        l1.set(j+1,store);
                    }
                    else if (l2.get(j)==l2.get(j+1))
                    {
                        if (l1.get(j).compareTo(l1.get(j+1))>0)
                        {
                            store=l1.get(j);
                            l1.set(j,l1.get(j+1));
                            l1.set(j+1,store);
                        }
                    }
                }
            }

            for (int i=0; i<l1.size(); i++)
            {
                System.out.println (l2.get(i)+" "+l1.get(i));
            }

            t--;
        }

    }

    static void mergeSort (String[]ar, int min, int max)
    {
        if (min<max)
        {
            int mid=(min+max)/2;

            mergeSort(ar,min,mid);
            mergeSort(ar,mid+1,max);

            merge(ar,min,mid,max); 
        }
    }

    static void merge (String[] ar, int min, int mid, int max)
    {
        int i=min, j=mid+1, x=0;
        String a[]=new String[max-min+1];

        while (i<=mid && j<=max)
        {
            if ((ar[i]).compareTo(ar[j])<0)
            {
                a[x]=ar[i];
                i++;
            }
            else
            {
                a[x]=ar[j];
                j++;
            }
            x++;
        }

        for (int k=i; k<=mid; k++)
        {
            a[x]=ar[k];
            x++;
        }

        for (int k=j; k<=max; k++)
        {
            a[x]=ar[k];
            x++;
        }
        
        int z=0;
        for (int k=min; k<=max; k++)
        {
            ar[k]=a[z++];
        }
    }
}

//https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/i-think-its-easy/


import java.util.*;


class I_Think_its_Easy {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();

        while (t>0)
        {
            String s=sc.nextLine();
            StringTokenizer st=new StringTokenizer(s);

            String ar[]=new String[st.countTokens()];
            int i=0;
            while (st.hasMoreTokens())
            {
                ar[i]=st.nextToken();
                i++;
            }

            String temp;
            for (i=0; i<ar.length; i++)
            {
                for (int j=0; j<ar.length-1-i; j++)
                {
                    if (ar[j].length()>ar[j+1].length())
                    {
                        temp=ar[j];
                        ar[j]=ar[j+1];
                        ar[j+1]=temp;
                    }
                }
            }

            for ( i=0; i<ar.length; i++)
            System.out.print (" "+ar[i]);

            System.out.println ();

            t--;
        }

    }
}

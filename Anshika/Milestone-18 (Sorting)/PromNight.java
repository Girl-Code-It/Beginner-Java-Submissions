//https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/practice-problems/algorithm/prom-night/


import java.util.*;


class PromNight {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();

        while (t-->0)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();

            int b[]=new int[m];
            int g[]=new int[n];
            for (int i=0; i<m; i++)
            {
                b[i]=sc.nextInt();
            }
            for (int i=0; i<n; i++)
            {
                g[i]=sc.nextInt();
            }

            if (m>n)
            {
                System.out.println ("NO");
            }
            else
            {
                Arrays.sort (b);
                Arrays.sort (g);

                if (m==n)
                {
                    boolean flag=false;
                    for (int i=n-1; i>=0; i--)
                {
                    if (b[i]<=g[i])
                    {
                        System.out.println ("NO");
                        flag=true;
                        break;
                    }
                }
                if (flag==false)
                System.out.println ("YES");
                }

                else if (m<n)
                {
                    int i=0, j=0;
                    boolean flag=false;
                    while (i<m)
                    {
                        if (b[i]>g[j])
                        {
                            i++;
                            j++;
                        }
                        else
                        {
                            System.out.println ("NO");
                            flag=true;
                            break;
                        }
                    }
                    if (flag==false)
                    System.out.println ("YES");

                }
            }
        }
    }
}

//https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/twisted-matrix/


import java.util.*;


class Twisted_Matrix {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);

        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        int a[]=new int[n*n];
        int x=0;

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                a[x++]=sc.nextInt();
            }
        }

        Arrays.sort(a);

        int u=0,t=0;
        while (t!=x)
        {
            for (int i=u; i<n-u; i++)
            {
                ar[u][i]=a[t++];
            }

            for (int i=1+u; i<n-u; i++)
            {
                ar[i][n-1-u]=a[t++];
            }

            for (int i=n-2-u; i>=u; i--)
            {
                ar[n-1-u][i]=a[t++];
            }

            for (int i=n-2-u; i>=1+u; i--)
            {
                ar[i][u]=a[t++];
            }

            u++;
        }

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print (ar[i][j]+" ");
            }
            System.out.println ();
        }
    }
}

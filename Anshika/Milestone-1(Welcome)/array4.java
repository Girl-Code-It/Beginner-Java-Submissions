import java.io.*;
class array4
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter no. of test cases");
        int t=Integer.parseInt (br.readLine());

        int cnt, temp;
        for (int i=0; i<t; i++)
        {
            System.out.println ("enter values of N and K");
            int n=Integer.parseInt (br.readLine());
            int k=Integer.parseInt (br.readLine());

            int a[]=new int [n];

            System.out.println ("Enter values in array A");
            for (int j=0; j<n; j++)
            {
                a[j]=Integer.parseInt (br.readLine());
            }

            cnt=0;

            for (int m=0; m<n; m++)
            {
               
                while (a[m]<k)
                {
                    for (int l=0; l<n; l++)
                    {
                        a[l]++;
                    }
                    cnt++;
                }
            }

            System.out.println (cnt +"times");
        }
    }
}
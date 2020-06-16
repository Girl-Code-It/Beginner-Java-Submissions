//Write aprogram to print all Prime numbers between 1 to n.

import java.io.*;
class prime100
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a no.");
        int n=Integer.parseInt (br.readLine());

        boolean flag=false;

        for (int i=2; i<=n; i++)
        {
            flag=false;

            for (int j=2; j<=Math.sqrt(i); j++)
            {
                if (i%j==0)
                {
                    flag=true;
                    break;
                }
            }
            if (flag==false)
                System.out.println (i);
        }

    }
}
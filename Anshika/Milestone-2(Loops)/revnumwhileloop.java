//Write aprogram to print all natural numbers in reverse (from n to 1). - using while loop

import java.io.*;
class revnumwhileloop
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter value of n");
        int n=Integer.parseInt (br.readLine());
        int i=n;
        while (i>=1)
        {
            System.out.println (i);
            i--;
        }
    }
}
//Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.io.*;
class rectangle
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter length");
        int l=Integer.parseInt (br.readLine());

        System.out.println ("Enter breadth");
        int b=Integer.parseInt (br.readLine());

        if (l==b)
            System.out.println ("it is a square");
        else
            System.out.println ("it is not a square");
    }
}
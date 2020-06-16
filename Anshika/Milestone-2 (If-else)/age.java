/*Take input of age of 3 people by user and determine oldest and youngest among them.
 */

import java.io.*;
class age
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int a, b, c;

        System.out.println ("Enter age of A");
        a=Integer.parseInt (br.readLine());
        System.out.println ("Enter age of B");
        b=Integer.parseInt (br.readLine());
        System.out.println ("Enter age of C");
        c=Integer.parseInt (br.readLine());

        if (a>b)
        {
            if (a>c)
                System.out.println ("A is oldest");
            else
                System.out.println ("C is oldest");
            System.out.println ("B is youngest");
        }

        else if (a>c)
        {
            if (a>b)
                System.out.println ("A is oldest");
            else
                System.out.println ("B is oldest");
            System.out.println ("C is youngest");
        }

        else if (b>a)
        {
            if (b>c)
                System.out.println ("B is oldest");
            else
                System.out.println ("C is oldest");
            System.out.println ("A is youngest");
        }
    }
}
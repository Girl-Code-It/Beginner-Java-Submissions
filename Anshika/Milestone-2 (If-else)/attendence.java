/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
 */

import java.io.*;
class attendence
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter no. of classes held");
        int n=Integer.parseInt (br.readLine());
        System.out.println ("Enter no. of classes attended");
        int b=Integer.parseInt (br.readLine());

        int a=b*100/n;

        System.out.println ("attendence is "+a+" %");

        if (a>=75)
            System.out.println ("student is allowed to sit in exam");
        else
            System.out.println ("student is not allowed to sit in exam");
    }
}
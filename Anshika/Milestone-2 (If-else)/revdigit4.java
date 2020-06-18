/*A 4 digit number is entered through keyboard. 
 * Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895
*/

import java.io.*;
class revdigit4
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter 4 digit no.");
        int n=Integer.parseInt (br.readLine());

        int temp=n, d, rev=0;

        while(temp!=0)
        {
            d=temp%10;
            temp=temp/10;
            rev=rev*10+d;
        }

        System.out.println ("reversed no. is "+rev);
    }
}
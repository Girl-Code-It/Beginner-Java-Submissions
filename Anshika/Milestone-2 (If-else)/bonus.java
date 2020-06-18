/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
 */

import java.io.*;
class bonus
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter emlpoyee's year of service and salary");
        int y=Integer.parseInt (br.readLine());
        int s=Integer.parseInt (br.readLine());

        int b=0, net;

        if (y>5)
            b=5*s/100;

        net=s+b;
        System.out.println ("net salary of emloyee is "+net);

    }
}
/*Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.
*/

import java.io.*;
class leapyear
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter year");
        int y =Integer.parseInt (br.readLine());

        if ((y%4==0 && y%100!=0) || y%400==0)
            System.out.println ("leap year");
        else
            System.out.println ("not a leap year");
    }
}
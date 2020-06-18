/*Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".

 * 
 */

import java.io.*;
class service
{
    public static void main (String agrs[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter age");
        int age=Integer.parseInt (br.readLine());
         System.out.println ("Enter sex - 'f' or 'm'");
        char s=(char)br.read();
        System.out.println ("marital status - 'y' or'n'");
        char m=(char)br.read();
      
        
        if (s=='f')
            System.out.println ("can work only in urban areas");
        else if (s=='m' && (age>20 && age<=40))
            System.out.println ("can work in any area");
        else if (s=='m' && (age>40 && age<=60))
            System.out.println ("can work only in urban areas");
        else
            System.out.println ("incorrect input");
    }
}
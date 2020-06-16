/*Modify the above question to allow student to sit if he/she has medical cause. 
 * Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
*/

import java.io.*;
class medicalcause
{
public static void main () throws IOException
{
InputStreamReader in=new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (in);

System.out.println ("Has student a medical cause ?");
char ans=(char)br.read();

if (ans=='y')
System.out.println ("student is not allowed to sit in exam");
else if (ans=='n')
System.out.println ("student is allowed to sit in exam");
else
System.out.println ("invalid input");
}
}
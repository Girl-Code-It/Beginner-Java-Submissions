/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
*/

import java.io.*;
class discount
{
public static void main () throws IOException
{
InputStreamReader in=new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (in);

System.out.println ("Enter quantity");
int q=Integer.parseInt (br.readLine());

int amt=q*100, d=0;

if (q>1000)
d=amt*10/100;

amt=amt-d;

System.out.println ("amount is "+amt);
}
}
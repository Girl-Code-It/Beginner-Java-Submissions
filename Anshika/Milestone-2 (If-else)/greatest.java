//Take two int values from user and print greatest among them.

import java.io.*;
class greatest
{
public static void main () throws IOException
{
InputStreamReader in= new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (in);

System.out.println ("Enter two no.");
int a=Integer.parseInt (br.readLine());
int b=Integer.parseInt (br.readLine());

if (a>b)
System.out.println (a+" is greater");
else
System.out.println (b+" is greater");
}
}
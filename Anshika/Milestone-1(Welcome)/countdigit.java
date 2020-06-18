import java.io.*;
class countdigit
{
public static void maine () throws IOException
{
InputStreamReader in =new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (in);

System.out.println ("Enter value of n"); 
int n=Integer.parseInt (br.readLine());

int cnt=0, temp=n;

while (temp!=0)
{
cnt++;
temp=temp/10;
}
System.out.println ("no. of digits is"+cnt);
}
}
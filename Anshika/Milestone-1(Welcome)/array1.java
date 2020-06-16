import java.io.*;
class array1
{
public static void main (String args[]) throws IOException
{
InputStreamReader in=new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (in);

System.out.println ("Enter no. of integers N to be shown to your team");
int n=Integer.parseInt (br.readLine());

System.out.println("Enter values in array");
int arr[]=new int [n];
for (int i=0; i<n; i++)
{
arr[i]=Integer.parseInt (br.readLine());
}

System.out.println ("Enter no. of queries");
int q=Integer.parseInt (br.readLine());

int x, cnt=0;
for (int i=1; i<=q; i++)
{
System.out.println ("Enter no. to be checked");
x=Integer.parseInt (br.readLine());

for (int j=0; j<n; j++)
{
if (arr[j]==x)
cnt++;
}

if (cnt==0)
System.out.println ("not present");
else
System.out.println (cnt+" times");
cnt=0;
}
}
}
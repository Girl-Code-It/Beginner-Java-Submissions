import java.io.*;
class array3
{
public static void main (String args[]) throws IOException
{
InputStreamReader in=new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (in);

System.out.println ("Enter size of array");
int n=Integer.parseInt (br.readLine());

int a[]=new int [n];
int b[]=new int [n];
int c[]=new int [n];

System.out.println ("Enter values in array A");
for (int i=0; i<n; i++)
{
a[i]=Integer.parseInt (br.readLine());
}

System.out.println ("Enter values in array B");
for (int i=0; i<n; i++)
{
b[i]=Integer.parseInt (br.readLine());
}

for (int i=0; i<n; i++)
{
c[i]=a[i]+b[i];
}

System.out.println ("array C - ");
for (int i=0; i<n; i++)
{
System.out.print (c[i]+" ");
}
}
}

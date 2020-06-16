import java.io.*;
class rarmstrong
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int temp, d, cnt;
        double sum;
        for (int i=1; i<=1000; i++)
        {
            sum=0;
            temp=i;
            cnt=0;

            while (temp!=0)
            {
                cnt++;
                temp=temp/10;
            }
            temp=i;
            while(temp!=0)
            {
                d=temp%10;
                temp=temp/10;
                sum=sum+Math.pow(d,cnt);
            }
            if (sum==i)
                System.out.println (i);
        }
    }
}
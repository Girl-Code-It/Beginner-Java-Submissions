// Write a program to convert a binary no. to an octal no.

import java.io.*;
class binoct
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a binary no.");
        String bi=br.readLine();

        int l=bi.length();
        if (l%3==1)
            bi="00"+bi;
        else if (l%3==2)
            bi="0"+bi;
        System.out.println (bi);    
        

        String oct[]={"000","001","010","011","100","101","110","111"};
        String store;
        int o=0;

        for (int i=0; i<=bi.length()-3; i+=3)
        {

            store=bi.substring(i, i+3);
            
            for (int j=0; j<8; j++)
            {
                if (store.equals(oct[j]))
                {
                    o=o*10+j;
                    break;
                }
            }
            
        }
        System.out.println ("Octal no. - "+o);
    }
}
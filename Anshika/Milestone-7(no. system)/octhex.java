// Write a program to convert an octal no. to hexadecimal no.

import java.io.*;
class octhex
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter an octal no.");
        String oc=br.readLine ();

        String b[]={"000","001","010","011","100","101","110","111"};

        char ch;
        int c;
        String bi="";

        for (int i=0; i<oc.length(); i++)
        {
            ch=oc.charAt(i);
            c=(int)ch;
            c=c-48;
            bi=bi+b[c];
        }

        int l=bi.length();
        if (l%4==1)
            bi="000"+bi;
        else if (l%4==2)
            bi= "00"+bi;
        else if (l%4==3)
            bi="0"+bi;

        String tab[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        char h[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String store, hex="";

        for (int i=0; i<=bi.length()-4; i+=4)
        {
            store=bi.substring (i, i+4);

            for (int j=0; j<16; j++)
            {
                if (store.equals(tab[j]))
                {
                    hex=hex+h[j];
                    break;

                }
            }
        }
        if (hex.charAt(0)=='0')
            System.out.println ("Hexadecimal no - "+hex.substring (1));
        else
            System.out.println ("Hexadecimal no. - "+hex);
    }
}
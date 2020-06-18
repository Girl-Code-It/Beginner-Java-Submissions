// Write a program to convert a binary no. to hexadecimal no. 

import java.io.*;
class binhex
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a binary no.");
        String bi=br.readLine();

        int l=bi.length();
        if (l%4==1)
            bi="000"+bi;
        else if (l%4==2)
            bi= "00"+bi;
        else if (l%4==3)
            bi="0"+bi;

        String tab[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String store, hex="";

        for (int i=0; i<=bi.length()-4; i+=4)
        {
            store=bi.substring (i, i+4);

            for (int j=0; j<16; j++)
            {
                if (store.equals(tab[j]))
                {
                    hex=hex+ch[j];
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
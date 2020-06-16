// Write a program to convert a hexadecimal no. to binary no.

import java.io.*;
class hexbin
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a hexadecimal no.");
        String hex=br.readLine();

        String tab[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char c;
        
        for (int i=0; i<hex.length(); i++)
        {
            c=hex.charAt(i);
            for (int j=0; j<16; j++)
            {
                if (c==ch[j])
                {
                    System.out.print (tab[j]);
                    break;
                
                }
            }
        }

    }
}
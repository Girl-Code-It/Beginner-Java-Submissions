// Write a program to convert hexadecimal no. to octal no.

import java.io.*;
class hexoct
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
        String bi="";
        
        for (int i=0; i<hex.length(); i++)
        {
            c=hex.charAt(i);
            for (int j=0; j<16; j++)
            {
                if (c==ch[j])
                {
                    bi=bi+tab[j];
                    break;
                
                }
            }
        }
        
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
/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/password-1/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Password{
    public static void main(String args[] ) throws Exception {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        int n=Integer.parseInt(br.readLine());

        String ar[]=new String[n];
        String s, t, store="";
        boolean  flag=false;


        for (int i=0; i<n; i++)
        {
            ar[i]=br.readLine();
        }

        for (int i=0; i<n-1; i++)
        {
            s=ar[i];
            for (int j=i+1; j<n; j++)
            {
                t=ar[j];
                flag=false;
                
                for (int k=0; k<s.length(); k++)
                {
                    if (s.charAt(k)!=t.charAt(t.length()-1-k))
                    {
                        flag=true;
                        break;
                    }
                }
                if (flag==false)
                {
                    store=s;
                    break;
                }

            }
            if (flag==false)
            break;
        }

        int l=store.length();
        char c=store.charAt(store.length()/2);

        System.out.println (l+" "+c);

         

    }
}

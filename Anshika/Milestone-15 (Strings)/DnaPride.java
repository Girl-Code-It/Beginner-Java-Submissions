/*
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/dna-pride/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class DnaPride {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   // Writing output to STDOUT

        //Scanner
int t=Integer.parseInt (br.readLine());

while (t>0)
{
    int l=Integer.parseInt (br.readLine());
    String s=br.readLine();
    
    char c[]=s.toCharArray();
    boolean flag=false;
    for (int i=0; i<l; i++)
    {
        if (c[i]!='A'&& c[i]!='T'&& c[i]!='G'&& c[i]!='C')
        {
            flag=true;
            break;
        }
        
        else if (c[i]=='A')
        c[i]='T';
        else if (c[i]=='T')
        c[i]='A';
        else if (c[i]=='C')
        c[i]='G';
        else if (c[i]=='G')
        c[i]='C';
        
       
    }
    if (flag==true)
    System.out.println ("Error RNA nucleobases found!");
    else
    System.out.println (c);

    t--;
}

        // Write your code here

    }
}

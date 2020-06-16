
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MarutAndStrings {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int t=Integer.parseInt (br.readLine());

            if (t>10 || t<1 )
        System.out.println ("Invalid Test");

        else
        {
            while (t>0)
            {
                String s=br.readLine ();

                if (s.length()>100 || s.length()<1)
                System.out.println ("Invalid Input");

                else
                {
                    boolean flag=false;
                    int cntl=0, cntu=0;
                    char ch;

                    for (int i=0; i<s.length(); i++)
                       {
                          ch=s.charAt(i);

                          if (ch==' ')
                          {
                              flag=true;
                              break;
                          }
                          else if (Character.isUpperCase(ch)==true)
                          cntu++;
                          else if (Character.isLowerCase(ch)==true)
                          cntl++;
                       }

                       if (flag==true)
                       System.out.println ("Invalid Input");

                       else
                       {
                           if (cntl<1 && cntu<1)
                           {
                               System.out.println ("Invalid Input");

                           }
                           else
                           {
                               int x=Math.min (cntl, cntu);
                               System.out.println (x);
                           }
                       }

                }
                t--;
            }
        }
        }
        catch (NumberFormatException e)
        {
            System.out.println ("Invalid Test");
        }
 
        
        // Write your code here

    }
}

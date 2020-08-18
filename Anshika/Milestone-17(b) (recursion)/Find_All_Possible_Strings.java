//https://practice.geeksforgeeks.org/problems/print-all-possible-strings/1

import java.util.*;


class Find_All_Possible_Strings
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			g.printSpace(str);
                        System.out.println();
			t--;
		}
	}
}// } Driver Code Ends


/*You have to complete this function*/
class GfG
{
    void printSpace(String str)
    {
        
        // Your code here
        print(str,1,str.length());
    }
    
    static void print (String s, int i, int l)
    {
        if (i==l)
        {
            System.out.print(s+"$");
            return;
        }
        else
        {
            print (s,i+1,l);
            print (s.substring(0,i)+" "+s.substring(i),i+2,l+1);
            
        }
    }
}

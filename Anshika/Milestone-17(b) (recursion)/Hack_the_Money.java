//https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/hack-the-money/


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Hack_the_Money {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0)
        {
            long n=sc.nextLong();

            boolean ans=check(n);
            if (ans==true)
            System.out.println ("Yes");
            else
            System.out.println ("No");

            t--;
        }

    }

    static boolean check (long n)
    {
        if (n==1)
        return true;
        else if (n<1)
        return false;
        else
        {
            if (n%20==0 && check(n/20))
            return true;

            if (n%10==0 && check(n/10))
            return true;

            return false;
        }
    }
}

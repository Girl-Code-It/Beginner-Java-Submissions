import java.io.*;
import java.util.*;
class AddOneToN {

    public static void main (String args[]) throws IOException {

        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a no.");
        int n=sc.nextInt();

        //-x=~x+1 two's complement
        //-~x=x+1 replacing x -> ~x
        
        n=-~n;
        System.out.println (n);
    }
}
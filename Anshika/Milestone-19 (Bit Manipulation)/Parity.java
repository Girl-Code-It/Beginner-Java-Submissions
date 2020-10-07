import java.io.*;
import java.util.*;
class Parity {

    public static void main (String args[]) throws IOException {

        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a no.");
        int n=sc.nextInt();
        
        int cnt=0;

        while (n!=0) {
            n=n&(n-1);
            cnt++;
        }
        
        if (cnt%2==0) {
            System.out.println ("Even Parity");
        } else {
            System.out.println ("Odd Parity");
        }
    }
}
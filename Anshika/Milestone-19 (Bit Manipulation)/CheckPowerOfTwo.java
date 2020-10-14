import java.io.*;
import java.util.*;
class CheckPowerOfTwo {

    public static void main (String args[]) throws IOException {

        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a no.");
        int n=sc.nextInt();

        if ((n&(n-1))==0) {
            System.out.println ("Power of Two");
        } else {
            System.out.println ("Not a power of two");
        }
    }
}
import java.io.*;
import java.util.*;
class PositionOfOnlySetBit {

    public static void main (String args[]) throws IOException {

        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a no.");
        int n=sc.nextInt();

        if ((n&(n-1))==0) {
            int x=(int)(Math.log(n)/Math.log(2));
            System.out.println (x);
        } else {
            System.out.println ("Many set bits");
        }
    }
}
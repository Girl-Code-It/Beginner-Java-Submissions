import java.io.*;
import java.util.*;
class EvenOrOdd {

    public static void main (String args[]) throws IOException {

        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a no.");
        int n=sc.nextInt();

        if ((n&1)==0) {
            System.out.println ("Even no.");
        } else {
            System.out.println ("Odd no.");
        }
    }
}
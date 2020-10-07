import java.io.*;
import java.util.*;
class Swapping {

    public static void main (String args[]) throws IOException {

        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a no.");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println ("a="+a+" , b="+b);
        
        a=a^b;
        b=a^b;
        a=a^b;
        
        System.out.println ("after Swapping");
        System.out.println ("a="+a+" , b="+b);
    }
}
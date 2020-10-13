import java.io.*;
import java.util.*;
class DetectionOfOppositeSign {

    public static void main (String args[]) throws IOException {

        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a no.");
        int a=sc.nextInt();
        int b=sc.nextInt();

        if ((a^b)<0) {
            System.out.println ("Opposite Signs");
        } else {
            System.out.println ("Similar Signs");
        }
    }
}
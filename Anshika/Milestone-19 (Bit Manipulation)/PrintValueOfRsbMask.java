import java.io.*;
import java.util.*;

public class PrintValueOfRsbMask {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    /*
    int a=~n;
    a=a+1;
    n=n&a;
    */
   
    int a=n&(n-1);
    n=n^a;
    System.out.println (Integer.toBinaryString(n));
  
    /*
    int i=0;
    while (n!=0) {
        if (n%2==1) {
            break;
        }
        n=n/2;
        i++;
    }
    
    */
    
    // int store=0;
    // boolean flag=true;
    // while (flag) {
    //     int a=1<<i;
    //     if ((n&a)!=0) {
    //         store=i;
    //         flag=false;
    //         break;
    //     }
    //     i++;
    // }
    
    //System.out.println ((long)Math.pow(10,i));

    //write your code here
  }

}
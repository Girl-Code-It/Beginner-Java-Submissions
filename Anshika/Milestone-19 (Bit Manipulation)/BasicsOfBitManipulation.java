import java.io.*;
import java.util.*;

public class BasicsOfBitManipulation {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    
    //write your code here
    int a=1<<i;
    System.out.println (n|a);
    
    a=1<<j;
    a=~a;
    System.out.println (n&a);
    
    a=1<<k;
    System.out.println (n^a);
    
    a=1<<m;
    if ((n&a)==0) {
        System.out.println ("false");
    } else {
        System.out.println ("true");
    }
  }

}
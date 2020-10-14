import java.io.*;
import java.util.*;

public class KernighansAlgorithm {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int cnt=0;
    while (n!=0) {
        n=n&(n-1);
        cnt++;
    }
    
    System.out.println (cnt);
    
    //write your code here
  }

}
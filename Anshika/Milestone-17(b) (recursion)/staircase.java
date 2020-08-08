//https://codezen.codingninjas.com/practice/468/54/staircase

import java.util.*;
class staircase
{

    public static int findWays(int n){
        if (n==0)
            return 1;
        else if (n<0)
            return 0;
        else
            return findWays(n-1)+findWays(n-2)+findWays(n-3);
    }

    public static void main (String args[]) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter no. of steps");
        int n=sc.nextInt();

        int w=findWays(n);
        System.out.println ("no. of ways : "+w);
    }
}
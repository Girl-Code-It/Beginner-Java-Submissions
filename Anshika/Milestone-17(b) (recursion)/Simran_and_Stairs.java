//https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/simran-and-stairs/

import java.util.*;
class Simran_and_Stairs
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
        int n=sc.nextInt();

        int w=findWays(n);
        System.out.println (w);
    }
}
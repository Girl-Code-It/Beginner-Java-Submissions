/*
 * https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/monks-encounter-with-polynomial/
 */



import java.util.*;


class MonksEncounterwithPolynomials
 {
    public static void main(String args[] ) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while (n>0)
        {
            n--;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            long k=sc.nextInt();

            long min=0, max=k-1, mid, m=k;
            long val;
            boolean flag=false;
            double d=Math.pow(2,30);
            while (min<max)
            {
                mid=(min+max)/2;
                if (mid*mid>d)
                {
                    max=mid-1;
                    continue;
                }
                val=a*mid*mid+b*mid+c;
                
                if (val>k)
                {
                    max=mid;
                }
                else if (val==k)
                {
                    m=mid;
                    flag=true;
                    break;
                }
                else if (val<k)
                {
                    min=mid+1;
                }
            }
            if (flag==false)
            m=min;
            System.out.println (m);
        }
        // Write your code here

    }
}

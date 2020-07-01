/*
 * https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/foo-and-exams-4/
 */


import java.util.*;


class FooAndExams
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
            int d=sc.nextInt();
            long k=sc.nextLong();

            long min=0, max=(long)Math.round(Math.cbrt(k)), mid=0, m=k;
            long val;
            
            boolean flag=false;
            
            while (min<=max)
            {
                mid=(min+max)/2;
                
                val=a*mid*mid*mid+b*mid*mid+c*mid+d;
                //System.out.println ("* "+val);
                if (val>Math.pow(10,18))
                {
                    max=mid-1; 
                    continue;
                }
                if (val>k)
                {
                    max=mid-1;
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
            m=max;
            if (m<0)
            m=0;
            System.out.println (m);
        }
        // Write your code here
    }
}

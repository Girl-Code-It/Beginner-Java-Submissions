/*
 * https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/monk-and-search-2/
 */

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.io.DataInputStream;
import java.io.FileInputStream; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.Arrays;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MonkAndSearch {

     static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
  
    public static void main(String args[] ) throws Exception {
        
        FastReader s=new FastReader ();
        int n=s.nextInt();
        long ar[]=new long[n];
        for (int i=0; i<n; i++)
        {
            ar[i]=s.nextLong();
        }
        Arrays.sort(ar);

        int q=s.nextInt();
        while(q>0)
        {
            int k=s.nextInt();
            long x=s.nextLong();
            int cnt=0;

            int store=lowerBound (ar,ar.length,x);

            if (k==0)
            cnt=ar.length-store;
        
            else
             {
                 cnt=ar.length-store;
                 while (store<ar.length && ar[store]==x)
                 {
                    cnt--;
                    store++;
                    
                 }
             }
            System.out.println (cnt);
            

            q--;
        }

    }

    static int lowerBound(long[] array, int length, long value) {
        int low = 0;
        int high = length;
        while (low < high) {
            final int mid = (low + high) / 2;
            //checks if the value is less than middle element of the array
            if (value <= array[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

/*
 * https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/bablu-ki-babli-51f74021/
 */

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.io.DataInputStream;
import java.io.FileInputStream; 
import java.util.Scanner; 
import java.util.StringTokenizer; 

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class BabluKiBabli
 {

     static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = 0;
            bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = 0;
            bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
    public static void main(String args[] ) throws Exception {
        
        Reader s=new Reader ();

        int n=s.nextInt();
        int qr=s.nextInt();
        long sum=0;
        long ar[]=new long[n];
        long a[]=new long[n];
        for (int i=0; i<n; i++)
        {
            ar[i]=s.nextInt();
            sum=sum+ar[i];
            a[i]=sum;
        }
        while (qr>0)
        {
            qr--;
            long q=s.nextLong();

            
            int store=upperBound (a,a.length,q,0);
            System.out.println (store);
           
        }

    }
static int upperBound(long[] array, int high, long value, int low) 
        {
        if (low >= high)
        return low+1;
        else
         {
            int mid = (low + high) / 2;
            if (array[mid]==value)
            return mid+1;
            else if (value >array[mid])
             {
                return upperBound (array, high, value, mid+1);
            } 
            else
             {
               return upperBound (array, mid, value, low) ;
            }
        }
    }
}
        

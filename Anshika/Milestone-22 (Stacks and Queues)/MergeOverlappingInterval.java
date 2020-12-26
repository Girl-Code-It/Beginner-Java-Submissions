//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/merge-overlapping-interval-official/ojquestion

import java.io.*;
import java.util.*;

public class MergeOverlappingInterval {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] ar) {
        // merge overlapping intervals and print in increasing order of start time
        
        sorting (ar);
        
        Stack<Integer> start=new Stack<Integer>();
        Stack<Integer> end=new Stack<Integer>();
        
        start.push(ar[0][0]);
        end.push(ar[0][1]);
        
        for (int i=1; i<ar.length; i++) {
            
            if (ar[i][0]<=end.peek()) {
                
                if (ar[i][1]>end.peek()) {
                    end.pop();
                    end.push(ar[i][1]);
                }
                
            } else {
                start.push(ar[i][0]);
                end.push(ar[i][1]);
            }
        }
        
        display(start,end);
    }
    
    static void display (Stack<Integer> start, Stack<Integer> end) {
        
        if (start.size()!=0) {
            int s=start.pop();
            int e=end.pop();
            
            display(start,end);
            
            System.out.println (s+" "+e);
        }
    }
    
    static void sorting (int[][] ar) {
        
        for (int i=0; i<ar.length; i++) {
            
            for (int j=0; j<ar.length-1-i; j++) {
                
                if (ar[j][0]>ar[j+1][0]) {
                    
                    int temp=ar[j][0];
                    ar[j][0]=ar[j+1][0];
                    ar[j+1][0]=temp;
                    
                    temp=ar[j][1];
                    ar[j][1]=ar[j+1][1];
                    ar[j+1][1]=temp;                    
                }
            }
        }
    }

}
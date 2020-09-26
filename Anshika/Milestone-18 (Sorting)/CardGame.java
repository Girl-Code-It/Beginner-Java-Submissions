//https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/practice-problems/algorithm/card-game-1-44e9f4e7/


import java.util.*;

class CardGame {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int br[]=new int[m];
        for (int i=0; i<m; i++)
        {
            br[i]=sc.nextInt();
        }

        Arrays.sort (br);
        int max=br[m-1];

        Arrays.sort (ar);
        int x=0;
        long cnt=0;
        while (x<n && ar[x]<=max)
        {
            cnt=cnt+1+(max-ar[x]);
            x++;
        }

        System.out.println (cnt);

    }
}

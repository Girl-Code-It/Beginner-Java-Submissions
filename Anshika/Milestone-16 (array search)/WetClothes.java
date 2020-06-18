/*
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/wet-clothes-625348cf/
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class WetClothes {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        int g=sc.nextInt();

        int an[]=new int[n];
        int am[]=new int[m];

        for (int i=0; i<n; i++)
        {
            an[i]=sc.nextInt();
        }

        for (int i=0; i<m; i++)
        {
            am[i]=sc.nextInt();
        }

        int dif=0, cnt=0, x=0;
        int ar[]=new int[m]; //this array is created to store the indices of the clothes we have picked up
        for (int i=0; i<m; i++)//we initialize this loop with 0 at first 
        {
            ar[i]=0;
        }

        
        
        
            for (int j=0; j<n-1; j++)
            {
                dif=an[j+1]-an[j];
                
                for (int k=0; k<m; k++)
                {
                    
                    if (am[k]<=dif)
                    {
                        //now we check if the cloth has aready been picked up or not
                        
                        if (ar[k]==0)    
                        {
                            //if cloth was outside it was 0 and now we have picked it up and so we make 0 to 1.
                            cnt++;
                            ar[k]=1;
                        }
                    }
                    
                }
            }
        

        System.out.println (cnt);

        

    }
}

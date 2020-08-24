//https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/save-patients/


import java.util.*;


class Save_Patients {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int br[]=new int[n];

        for (int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }
        for (int i=0; i<n; i++)
        {
            br[i]=sc.nextInt();
        }

        Arrays.sort(ar);
        Arrays.sort(br);

        boolean flag=true;
        for (int i=n-1; i>=0; i--)
        {
            if (ar[i]>br[i])
            continue;
            else
            {
                flag=false;
                break;
            }
        }

        if (flag==true)
        System.out.println ("Yes");
        else
        System.out.println ("No");

    }
}

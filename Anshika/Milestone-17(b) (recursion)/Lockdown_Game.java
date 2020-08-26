//https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/lockdown-game/?layout=old

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class Lockdown_Game
 {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        
        ArrayList<Integer> li=new ArrayList<Integer>();
        for (int i=0; i<n; i++)
        {
            li.add(i+1);
        }

   //     System.out.println (li);
        int x=game(s,0,0,li);
        System.out.println (x);
    }

    static int game (String s, int i, int j, ArrayList<Integer> li)
    {
        if (li.size()==1)
        return li.get(0);

        if (i==s.length())
        {
            return game(s,0,j,li);
        }

        if (j==li.size()-1)
        {
            if (s.charAt(i)=='x')
            {
                return game(s,i+1,0,li);
            }
            else
            {
                li.remove(j);
                return game (s,i+1,0,li);
            }
        }

        else
        {
            if (s.charAt(i)=='x')
            {
                return game(s,i+1,j+1,li);
            }
            else
            {
                li.remove(j);
                return game(s,i+1,j,li);
            }
        }
    }
}

import java.io.*;
class array28
{

    boolean check(int game[], int leap)
    {
        int cnt=0;
        for(int i=0; i<game.length; i++)
        {
            if (game[i]==0)
                cnt++;
        }
        if (cnt==game.length)
            return true;
        int i=0;
        while (game[i]!=1)
        {
            if (i+leap>=game.length || i+1>=game.length)
                return true;
            else if (game[i+leap]==0)
                i=i+leap;
            else if (game[i+1]==0)
                i=i+1;
            else if (i-1>=0 && game[i-1]==0)
                i=i-1;
            else
                i++;
        }
        return false;
    }

    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        array28 ar=new array28();

        int n=Integer.parseInt(br.readLine());
        int leap=Integer.parseInt (br.readLine());

        int game[]=new int[n];
        for (int i=0; i<n; i++)
        {
            game[i]=Integer.parseInt (br.readLine());
        }

        boolean flag=ar.check(game,leap);
        System.out.println(flag);
    }
}
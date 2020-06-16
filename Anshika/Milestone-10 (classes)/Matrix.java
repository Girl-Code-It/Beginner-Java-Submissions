import java.io.*;
class Matrix
{
    int m;
    int n;
    int a[][];

    Matrix ()
    {
        m=0;
        n=0;
    }

    Matrix (int i, int j)
    {
        m=i;
        n=j;
        a=new int [m][n];
    }

    void input () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter elements in matrix");
        for (int x=0; x<m; x++)
        {
            for (int y=0; y<n; y++)
            {
                a[x][y]=Integer.parseInt (br.readLine());
            }
        }
    }

    void display ()
    {
        System.out.println ("Matrix -");
        for (int x=0; x<m; x++)
        {
            for (int y=0; y<n; y++)
            {
                System.out.print (a[x][y]);
            }
            System.out.println ();
        }
    }

    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter no.of rows and columns");
        int i=Integer.parseInt (br.readLine());
        int j=Integer.parseInt (br.readLine());

        Matrix m=new Matrix (i,j);
        m.input ();
        m.display ();
    }

}
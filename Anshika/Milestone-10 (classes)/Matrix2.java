import java.io.*;
class Matrix2
{
    int row;
    int col;
    int arr[][];

    void getRows () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter rows");
        row=Integer.parseInt (br.readLine());
    }

    void getCol () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter columns");
        col=Integer.parseInt (br.readLine());
    }

    void input () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        arr=new int [row][col];

        System.out.println ("enter elements");
        for (int i=0; i<row; i++)
        {
            for (int j=0; j<col; j++)
            {
                arr[i][j]=Integer.parseInt (br.readLine());
            }
        }
    }

    void addMatrix (Matrix2 a, Matrix2 b)
    {
        if (a.row==b.row && a.col==b.col)
        {
            row=a.row;
            col=a.col;
            arr=new int [row][col];

            for (int i=0; i<row; i++)
            {
                for (int j=0; j<col; j++)
                {
                    arr[i][j]=a.arr[i][j]+b.arr[i][j];
                }
            }

            System.out.println ("addition of matrices");

        }
        else
        {
            System.out.println ("Matrices can not be added");
        }
    }

    void mutiply (Matrix2 a, Matrix2 b)
    {
        if (a.col!=b.row)
        {
            System.out.println ("Matrices can not be mutiplied ");
        }
        else
        {
            row=a.row;
            col=b.col;
            arr=new int [row][col];
            int sum=0;
            for (int i=0; i<row; i++)
            {
                for (int j=0; j<col; j++)
                {
                    sum=0;
                    for (int k=0; k<a.col; k++)
                    {
                        sum=sum+a.arr[i][k]*b.arr[k][j];
                    }
                    arr [i][j]=sum;
                }
            }

            System.out.println ("productof matrices");
        }
    }

    void display ()
    {
        for (int i=0; i<row; i++)
        {
            for (int j=0; j<col; j++)
            {
                System.out.print (arr[i][j]);
            }
            System.out.println ();
        }
    }

    public static void main () throws IOException
    {
        Matrix2 a=new Matrix2 ();
        a.getRows ();
        a.getCol ();
        a.input ();

        Matrix2 b=new Matrix2 ();
        b.getRows ();
        b.getCol ();
        b.input ();

        Matrix2 c=new Matrix2 ();
        c.addMatrix (a,b);
        c.display ();

        Matrix2  d=new Matrix2 ();
        d.mutiply (a,b);
        d.display ();
    }

}
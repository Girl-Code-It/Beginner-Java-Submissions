//Write a program to multiply two matrix using recursion

import java.io.*;
class recursion15
{

    static int multiply (int[][] a, int[][] b, int i, int k, int j)
    {
        if (k==b.length)
            return 0;
        else
        {
            return a[i][k]*b[k][j] + multiply (a,b,i,k+1,j);
        }
    }

    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Input no. of rows for first matrix : ");
        int m1=Integer.parseInt (br.readLine());

        System.out.println ("Input no. of columns for first matrix : ");
        int n1=Integer.parseInt (br.readLine());

        System.out.println ("Input no. of rows for second matrix : ");
        int m2=Integer.parseInt (br.readLine());

        System.out.println ("Input no. of columns for second matrix : ");
        int n2=Integer.parseInt (br.readLine());

        if (n1==m2)
        {

            int mat1[][]=new int[m1][n1];
            int mat2[][]=new int[m2][n2];

            System.out.println ("Enter elements of first matrix : ");
            for (int i=0; i<m1; i++)
            {
                for (int j=0; j<n1; j++)
                {
                    mat1[i][j]=Integer.parseInt (br.readLine());
                }
            }

            System.out.println ("Enter elements of second matrix : ");
            for (int i=0; i<m2; i++)
            {
                for (int j=0; j<n2; j++)
                {
                    mat2[i][j]=Integer.parseInt (br.readLine());
                }
            }

            System.out.println ("First Matrix : ");
            for (int i=0; i<m1; i++)
            {
                for (int j=0; j<n1; j++)
                {
                    System.out.print (mat1[i][j]+" ");
                }
                System.out.println ();
            }

            System.out.println ("Second Matrix : ");
            for (int i=0; i<m2; i++)
            {
                for (int j=0; j<n2; j++)
                {
                    System.out.print (mat2[i][j]+" ");
                }
                System.out.println ();
            }

            int mat3[][]=new int[m1][n2];

            for (int i=0; i<m1; i++)
            {
                for (int j=0; j<n2; j++)
                {
                    mat3[i][j]=multiply(mat1,mat2,i,0,j);
                }
            }
            
            System.out.println ("Matrix after Multiplication : ");
            for (int i=0; i<m1; i++)
            {
                for (int j=0; j<n2; j++)
                {
                    System.out.print (mat3[i][j]+" ");
                }
                System.out.println ();
            }

        }

        else
        {
            System.out.println ("Invalid inputs .");
        }
    }
}

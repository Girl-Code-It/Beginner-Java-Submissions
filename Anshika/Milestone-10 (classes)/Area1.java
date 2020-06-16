/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
 * First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. 
 * Length and breadth of rectangle are entered through keyboard. 
 */

import java.io.*;
class Area1
{
    int len;
    int br;

    Area1 (int l, int b)
    {
        len=l;
        br=b;
    }

    int returnArea ()
    {
        int ar=len*br;
        return ar;
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter length and breadth of the rectangle");
        int l=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());

        Area1 a=new Area1 (l,b);

        int area=a.returnArea();
        System.out.println ("Area is - "+area);
    }

}
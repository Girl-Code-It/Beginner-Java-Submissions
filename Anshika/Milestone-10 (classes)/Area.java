/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
 * First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. 
 * Length and breadth of rectangle are entered through keyboard.
*/
import java.io.*;
class Area
{
    int len;
    int br;

    void setDim (int i, int j)
    {
        len=i;
        br=j;
    }

    int getArea ()
    {
        int ar=len*br;
        return ar;
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);
        
        System.out.println ("enter length and breadth of reactangle");
        int l=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());

        Area a=new Area ();
        a.setDim (l,b);
        int area=a.getArea();
        System.out.println ("Area is - "+area);
    }
}
import java.io.*;
class Rectangle
{
    int l;
    int b;


    Rectangle (int x, int y)
    {
        l=x;
        b=y;
    }

    int Area ()
    {
        int area=l*b;
        return area;
    }

    void display ()
    {
        System.out.println ("Area - "+Area());
    }

    public static void main () throws IOException
    {
        Rectangle r1=new Rectangle (4,5);
        Rectangle r2=new Rectangle (5,8);

        r1.display ();
        r2.display ();
    }
}
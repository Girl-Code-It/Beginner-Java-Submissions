import java.io.*;
class Triangle
{
    int a, b, c;

    double perimeter ()
    {
        double peri=a+b+c;
        return peri;
    }

    double area ()
    {
        double p=(a+b+c)/2;
        double ar=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return ar;
    }

    public static void main () throws IOException
    {
        Triangle t=new Triangle ();
        t.a=3;
        t.b=4;
        t.c=5;

        double p=t.perimeter();
        double a=t.area();

        System.out.println ("perimeter of triangle is - "+p);
        System.out.println ("area of triangle is - "+a);
    }
}
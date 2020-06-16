import java.io.*;
class Triangle2
{
    int a, b, c;

    Triangle2 (int x, int y, int z)
    {
        a=x;
        b=y;
        c=z;
    }

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
        Triangle2 t=new Triangle2 (3,4,5);

        double p=t.perimeter();
        double a=t.area();

        System.out.println ("perimeter of triangle is - "+p);
        System.out.println ("area of triangle is - "+a);
    }
}
import java.io.*;
class Complex
{
    int real;
    int img;

    Complex ()
    {
        real=0;
        img=0;
    }

    void input () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter real and imaginary part of a complex no.");
        real=Integer.parseInt (br.readLine());
        img=Integer.parseInt (br.readLine());
    }

    void sum (Complex x, Complex y)
    {
        real=x.real+y.real;
        img=x.img+y.img;
        System.out.print ("sum is - ");
    }

    void difference (Complex x, Complex y)
    {
        real=x.real-y.real;
        img=x.img-y.img;
        System.out.print ("difference is - ");
    }

    void product (Complex x, Complex y)
    {
        real=x.real*y.real-x.img*y.img;
        img=x.real*y.img+x.img*y.real;
        System.out.print ("product is - ");
    }

    void display ()
    {
        System.out.println (real+" + "+img+" i");
    }

    public static void main () throws IOException
    {
        Complex a=new Complex ();
        Complex b=new Complex ();

        a.input ();
        b.input ();

        Complex c=new Complex ();
        c.sum (a,b);
        c.display ();

        Complex d=new Complex ();
        d.difference (a,b);
        d.display (); 

        Complex e=new Complex ();
        e.product (a,b);
        e.display ();
    }

}
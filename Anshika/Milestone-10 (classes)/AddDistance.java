import java.io.*;
class AddDistance
{
    int inch;
    int feet;

    AddDistance ()
    {
        inch=0;
        feet=0;
    }

    void input () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter distance in inches and feets");
        inch=Integer.parseInt (br.readLine());
        feet=Integer.parseInt (br.readLine());
    }

    void add (AddDistance a, AddDistance b)
    {
        inch=a.inch+b.inch;
        feet=a.feet+b.feet+inch/12;
        inch=inch%12;
    }

    void display ()
    {
        System.out.println ("distance - "+feet+" feets "+inch+" inches");
    }

    public static void main () throws IOException
    {
        AddDistance d1=new AddDistance ();
        AddDistance d2=new AddDistance ();
        AddDistance d3=new AddDistance ();

        d1.input();
        d2.input();

        d3.add (d1, d2);
        d3.display();
    }
}
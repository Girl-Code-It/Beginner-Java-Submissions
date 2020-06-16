import java.io.*;
class Average
{
    int a, b, c;
    double avg;

    void average ()
    {
        avg=(a+b+c)/3;
    }

    void display ()
    {
        System.out.println ("average is - "+avg);
    }

    void input () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter values");
        a=Integer.parseInt (br.readLine());
        b=Integer.parseInt (br.readLine());
        c=Integer.parseInt (br.readLine());
    }

    public static void main () throws IOException
    {
        Average av=new Average ();
        av.input();
        av.average();
        av.display();
    }
}
import java.io.*;
class Area2
{
    int l;
    int b;

    Area2 (int x, int y)
    {
        l=x;
        b=y;
    }

    int returnArea ()
    {
        int ar=l*b;
        return ar;
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter length and breadth of the rectangle");
        int i=Integer.parseInt (br.readLine());
        int j=Integer.parseInt (br.readLine());

        Area2 a=new Area2 (i,j);
        int area=a.returnArea ();
        System.out.println ("area is - "+area);
    }
}

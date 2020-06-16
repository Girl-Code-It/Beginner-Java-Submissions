import java.io.*;
class Student2
{
String name;
    String address;
    int roll_no;
    long ph_no;

    void info () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("add information of "+name);
        roll_no=Integer.parseInt (br.readLine());
        ph_no=Long.parseLong (br.readLine());
        address=br.readLine();
    }

    void display ()
    {
        System.out.println ("information of "+name+" is -");
        System.out.println (roll_no+"\n"+ph_no+"\n"+address);
    }

    public static void main (String args[]) throws IOException
    {
        Student2 st1=new Student2 ();
        Student2 st2=new Student2 ();

        st1.name="Sam";
        st2.name="John";
        
        st1.info();
        st2.info();

        st1.display();
        st2.display();
    }
}
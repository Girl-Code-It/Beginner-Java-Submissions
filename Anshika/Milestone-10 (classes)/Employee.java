import java.io.*;
class Employee
{
    String name;
    int year;
    double salary;
    String add;

    void display ()
    {
        System.out.println (name+"\t"+year+"\t \t"+add);
    }

    public static void main (String args[]) throws IOException
    {
        Employee e1=new Employee ();
        Employee e2=new Employee ();
        Employee e3=new Employee ();

        e1.name="Robert";
        e1.year=1994;
        e1.add="64C-WallsStreat";

        e2.name="Sam";
        e2.year=2000;
        e2.add="68D-WallsStreat";

        e3.name="John";
        e3.year=1999;
        e3.add="26B-WallsStreat";

        System.out.println ("name \t year of joining \t address");

        e1.display();
        e2.display();
        e3.display();
    }
}
import java.io.*;
class Employee1
{
    double salary;
    int hours;

    void getInfo () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter salary and no. of hours work per day");
        salary=Double.parseDouble(br.readLine());
        hours=Integer.parseInt (br.readLine());
    }

    void AddSal ()
    {
        if (salary<500)
            salary=salary+10;
    }

    void AddWork ()
    {
        if (hours>6)
            salary=salary+5;
    }

    void display ()
    {
        System.out.println ("salary is - "+salary);
    }
    
    public static void main () throws IOException
    {
        Employee1 em=new Employee1();
        em.getInfo();
        em.AddSal();
        em.AddWork();
        em.display();
    }
}
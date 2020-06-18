import java.io.*;
class Student
{
    String name;
    int roll_no;

    public static void main (String args[]) throws IOException
    {
        Student st=new Student ();
        st.name="John";
        st.roll_no=2;
        System.out.println ("name is - "+st.name+" and roll no. is - "+st.roll_no);
    }
}
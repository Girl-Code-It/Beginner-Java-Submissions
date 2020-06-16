//Write a program of “Welcome to Girl Code It”?

import java.io.*;
class welcome
{
public static void main (String args[]) throws IOException
{
InputStreamReader in=new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (in);

System.out.println ("WELCOME TO GIRLS CODE IT");

System.out.println ("Enter your name");
String name=br.readLine();

System.out.println ("Enter your branch");
String branch=br.readLine();

System.out.println ("Enter your year");
int year=Integer.parseInt (br.readLine());

System.out.println ("Enter your course");
String course=br.readLine();

System.out.println ("Enter your email id");
String mail=br.readLine();

System.out.println ();
System.out.println ();

System.out.println ("YOUR DETAILS - ");

System.out.println ("NAME \t BRANCH \t YEAR \t COURSE \t EMAIL ID");
System.out.println (name+"  \t   "+branch+"  \t  "+year+"  \t  "+course+"  \t  "+mail);


}
}
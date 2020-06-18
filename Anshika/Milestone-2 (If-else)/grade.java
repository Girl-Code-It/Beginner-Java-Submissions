/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */

import java.io.*;
class grade
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter marks");
        int m=Integer.parseInt (br.readLine());
        char c;

        if (m>80)
            c='A';
        else if (m<=80 && m>60)
            c='B';
        else if (m<=60 && m>50)
            c='C';
        else if (m<=50 && m>45)
            c='D';
        else if (m<=45 && m>25)
            c='E';
        else
            c='F';

        System.out.println ("Grade is "+c);
    }
}
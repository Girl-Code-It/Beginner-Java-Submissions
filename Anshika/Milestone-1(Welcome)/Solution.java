import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);

        long x=sc.nextLong();
        System.out.println(x+" can be fitted in:");
        if(x>=-128 && x<=127)
            System.out.println ("* byte \n* short \n* int \n* long");
        else if (x>=(-Math.pow(2,15)) && x<Math.pow(2,15))
            System.out.println ("* short \n* int \n* long");
        else if (x>=(-Math.pow(2,31)) && x<Math.pow(2,31))
            System.out.println ("* int \n* long");
        else if (x>=(-Math.pow(2,63)) && x<Math.pow(2,63))
        //Complete the code
            System.out.println ("* long");
        else
            System.out.println (" can't be fitted anywhere.");
    }
}
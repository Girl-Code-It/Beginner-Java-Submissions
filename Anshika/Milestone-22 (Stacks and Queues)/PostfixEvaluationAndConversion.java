//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/postfix-evaluation-conversions-official/ojquestion

import java.io.*;
import java.util.*;

public class PostfixEvaluationAndConversion{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> digit=new Stack<Integer>();
        Stack<String> infix=new Stack<String>();
        Stack<String> prefix=new Stack<String>();    

        int a,b,result;
        char symbol;

        for (int i=0; i<exp.length(); i++) {

            char ch=exp.charAt(i);
            String c=Character.toString(ch);

            if (Character.isDigit(ch)) {

                digit.push(ch-48);
                infix.push(c);
                prefix.push(c);

            } else {

                a=digit.pop();
                b=digit.pop();

                result=calculation(a,b,ch);
                digit.push(result);

                String x=infix.pop();
                String y=infix.pop();

                String s="("+y+ch+x+")";
                infix.push(s);

                x=prefix.pop();
                y=prefix.pop();

                s=ch+y+x;
                prefix.push(s);

            }
        }

        System.out.println (digit.pop()+"\n"+infix.pop()+"\n"+prefix.pop());

        // code
    }

    static int calculation (int a, int b, char ch) {
        if (ch=='+') {
            return a+b;
        } else if (ch=='-') {
            return b-a;
        } else if (ch=='*') {
            return a*b;
        } else {
            return b/a;
        }
    }
}
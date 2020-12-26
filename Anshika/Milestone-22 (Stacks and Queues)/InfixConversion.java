//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/infix-conversions-official/ojquestion

import java.io.*;
import java.util.*;

public class InfixConversion{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<String> postfix=new Stack<String>();
        Stack<String> prefix=new Stack<String>();
        Stack<Character> operator=new Stack<Character>();

        char symbol;
        String s1,s2,result;

        for (int i=0; i<exp.length(); i++) {
            char c=exp.charAt(i);
            String ch=Character.toString(c);

            if (c==' ') {
                continue;
            }

            if (c<=122 & c>=97) {

                postfix.push(ch);
                prefix.push(ch);

            } else if (c=='(') {

                operator.push(c);

            } else if (c==')') {

                while (operator.size()>0 && operator.peek()!='(') {
                    s1=postfix.pop();
                    s2=postfix.pop();

                    symbol=operator.pop();
                    result=s2+s1+symbol;

                    postfix.push(result);

                    s1=prefix.pop();
                    s2=prefix.pop();

                    result=symbol+s2+s1;

                    prefix.push(result);
                }
                operator.pop();

            } else {

                int pre=precedence(c);

                while (operator.size()>0 && postfix.size()>1 && operator.peek()!='(' && precedence(operator.peek())>=pre) {
                    s1=postfix.pop();
                    s2=postfix.pop();

                    symbol=operator.pop();
                    result=s2+s1+symbol;

                    postfix.push(result);

                    s1=prefix.pop();
                    s2=prefix.pop();

                    result=symbol+s2+s1;

                    prefix.push(result);
                }

                operator.push(c);
            }
        }

        while (postfix.size()!=1) {
            s1=postfix.pop();
            s2=postfix.pop();

            symbol=operator.pop();
            result=s2+s1+symbol;
            postfix.push(result);

            s1=prefix.pop();
            s2=prefix.pop();

            result=symbol+s2+s1;
            prefix.push(result);
        }

        System.out.println (postfix.pop()+"\n"+prefix.pop());

        // code
    }

    static int precedence (char ch) {
        if (ch=='+' || ch=='-') {
            return 1;
        } else {
            return 2;
        }
    }
}
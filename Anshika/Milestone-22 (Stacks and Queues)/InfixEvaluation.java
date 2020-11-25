//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/infix-evaluation-official/ojquestion

import java.io.*;
import java.util.*;

public class InfixEvaluation{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        int result=0;
        char symbol;
        int a, b;

        Stack<Integer> digit=new Stack<Integer>();
        Stack<Character> operand=new Stack<Character>();

        for (int i=0; i<exp.length(); i++) {
            char ch=exp.charAt(i);
            if (ch==' ') {
                continue;
            }

            if (Character.isDigit(ch)) {
                digit.push((int)ch-48);

            } else if (ch=='(') {
                operand.push(ch);
            } else if (ch==')') {

                while (operand.peek()!='(') {
                    symbol=operand.pop();
                    a=digit.pop();
                    b=digit.pop();
                    result=calculation(a,b,symbol);
                    digit.push(result);
                }

                operand.pop();
            } else {

                int pre=precedence(ch);
                while (operand.size()>0 && digit.size()>=2 && operand.peek()!='(' && precedence(operand.peek())>=pre) {
                    symbol=operand.pop();
                    a=digit.pop();
                    b=digit.pop();
                    result=calculation(a,b,symbol);
                    digit.push(result);
                }

                operand.push(ch);

            }
        }

        while (digit.size()!=1) {
            symbol=operand.pop();
            a=digit.pop();
            b=digit.pop();
            result=calculation(a,b,symbol);
            digit.push(result);
        }

        System.out.println (digit.pop());

        // code
    }

    static int precedence (char ch) {
        if (ch=='+' || ch=='-') {
            return 1;
        } else {
            return 2;
        }
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
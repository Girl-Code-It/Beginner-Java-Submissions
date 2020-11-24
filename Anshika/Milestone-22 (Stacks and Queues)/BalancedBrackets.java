//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/balanced-brackets-official/ojquestion

import java.io.*;
import java.util.*;

public class BalancedBrackets {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        
        char ch, ch1;
        boolean flag=true;
        
        Stack<Character> st=new Stack<Character>();
        
        for (int i=0; i<s.length(); i++) {
            ch=s.charAt(i);
            
            if (ch=='(' || ch=='{' || ch=='[') {
                st.push(ch);
            } else if (ch==')') {
                if (st.size()==0) {
                    flag=false;
                    break;
                }
                ch1=st.peek();
                st.pop();
                if (ch1!='(') {
                    flag=false;
                    break;
                }
            } else if (ch=='}') {
                if (st.size()==0) {
                    flag=false;
                    break;
                }
                ch1=st.peek();
                st.pop();
                if (ch1!='{') {
                    flag=false;
                    break;
                }
            } else if (ch==']') {
                if (st.size()==0) {
                    flag=false;
                    break;
                }
                ch1=st.peek();
                st.pop();
                if (ch1!='[') {
                    flag=false;
                    break;
                }
            }
            
        }
        
        if (st.size()!=0) {
            flag=false;
        }
        
        System.out.println (flag);

    }

}
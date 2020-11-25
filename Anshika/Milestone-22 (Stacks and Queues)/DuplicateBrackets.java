//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/duplicate-brackets-official/ojquestion

import java.io.*;
import java.util.*;

public class DuplicateBrackets {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        
        Stack<Character> st=new Stack<Character>();
        
        boolean flag=false;
        
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)!=')') {
                st.push(s.charAt(i));
            } else {
                flag=false;
                while (st.peek()!='(') {
                    st.pop();
                    flag=true;
                }
                
                st.pop();
                if (flag==false) {
                    break;
                }
            }
        }
        
        System.out.println (!flag);
 
    }

}
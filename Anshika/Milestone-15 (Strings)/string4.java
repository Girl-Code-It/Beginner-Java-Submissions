/**
 * Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"
 */

class string4 {
    public String reverseVowels(String s) {
        int store=s.length()-1;
            String n="";
        char ch, ch1;
        for (int i=0; i<s.length(); i++)
        {
            ch=s.charAt(i);
            
                if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='U'||ch=='u')
                {
                    for (int j=store; j>=0; j--)
                    {
                        ch1=s.charAt(j);
                        if (ch1=='a'||ch1=='A'||ch1=='E'||ch1=='e'||ch1=='I'||ch1=='O'||ch1=='U'||ch1=='i'||ch1=='o'||ch1=='u')
                        {
                            n=n+ch1;
                            store=j-1;
                            break;
                        }
                    }
                }
            else
            {
                n=n+ch;
            }
        }
        return n;
    }
}
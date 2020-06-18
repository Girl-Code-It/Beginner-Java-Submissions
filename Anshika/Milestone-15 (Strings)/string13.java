/**
 * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

 

Example 1:

Input: "ab-cd"
Output: "dc-ba"
Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 */

class string13 {
    public String reverseOnlyLetters(String s) {
        String n="";
        char ch1, ch2;
        int store=s.length()-1;
        
        for (int i=0; i<s.length(); i++)
        {
            ch1=s.charAt(i);
            if (Character.isLetter(ch1)==true)
            {
                for (int j=store; j>=0; j--)
                {
                    ch2=s.charAt(j);
                    if (Character.isLetter(ch2)==true)
                    {n=n+ch2;
                    store=j-1;
                    break;
                }}
            }
            else
            {
                n=n+ch1;
            }
            
        }
        
       return n; 
    }
}
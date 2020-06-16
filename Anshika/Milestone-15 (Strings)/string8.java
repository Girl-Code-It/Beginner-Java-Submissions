/**
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */

class string8 {
    public String reverseWords(String s) {
        s=s+" ";
        String n="", ss="", ne="";
        int k=0;
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i)==' ')
            {
                n=s.substring(k,i);
                k=i+1;
                
                for (int j=0; j<n.length(); j++)
                {
                    ne=n.charAt(j)+ne;
                }
                ss=ss+ne+" ";
                ne="";
            }
        }
        ss=ss.trim();
        return ss;
    }
}
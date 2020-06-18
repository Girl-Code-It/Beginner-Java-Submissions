/**
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
 */

class string1
 {
    public String longestCommonPrefix(String[] strs) {
        String s, s2="";
        if (strs.length==0)
            return "";
        String s1=strs[0];
        int min;
        char ch, c;
        for (int i=0; i<strs.length; i++)
        {
            s2="";
            s=strs[i];
            min=Math.min(s1.length(), s.length());
            for (int j=0; j<min; j++)
            {
                ch=s.charAt(j);
                c=s1.charAt(j);
                if (c!=ch)
                    break;
                else
                    s2=s2+c;
                    
                    
            }
            s1=s2;
            
        }
        return s2;
    }
}
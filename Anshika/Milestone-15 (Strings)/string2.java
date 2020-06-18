/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5
 */

class string2{
    public int lengthOfLastWord(String s) {
        String n="";
        s=s.trim();
        if (s.length()==0)
            return 0;
        else
        {
            int x=s.lastIndexOf(' ');
            n=s.substring(x+1);
        
        return n.length();
        }
    }
}
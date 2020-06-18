/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */

class string7 {
    public boolean isPalindrome(String s) {
       String n="";
        for (int i=0; i<s.length(); i++)
        {
            if (Character.isLetterOrDigit(s.charAt(i))==true)
                n=n+s.charAt(i);
        }
        n=n.toLowerCase();
        boolean flga=false;
        for (int i=0; i<n.length()/2; i++)
        {
            if (n.charAt(i)!=n.charAt(n.length()-1-i))
                return false;
        }
        return true;
    }
}
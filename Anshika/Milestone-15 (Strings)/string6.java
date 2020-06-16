/**
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 

Example 1:

Input: "USA"
Output: True
 

Example 2:

Input: "FlaG"
Output: False
 

Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */

class string6 {
    public boolean detectCapitalUse(String word) {
        int cnt=0;
        char ch;
        for (int i=0; i<word.length(); i++)
        {
            ch=word.charAt(i);
            if (Character.isUpperCase(ch)==true)
                cnt++;
        }
        if (cnt==word.length())
            return true;
        else if (cnt==0)
            return true;
        else if (cnt==1 && Character.isUpperCase(word.charAt(0)))
            return true;
        else
            return false;
        
    }
}
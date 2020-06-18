/**
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.
 
If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
 
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from S to Goat Latin. 

 

Example 1:

Input: "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Example 2:

Input: "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 

Notes:

S contains only uppercase, lowercase and spaces. Exactly one space between each word.
1 <= S.length <= 150.
 */

class string10{
    public String toGoatLatin(String s) {
        s=s+" ";
        String n="", ss="";
        int k=0, cnt=0;
        char ch;
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i)==' ')
            {
                cnt++;
                n=s.substring(k,i);
                k=i+1;
                
                ch=n.charAt(0);
                if (ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
                {
                    ss=ss+n+"ma";
                }
                else
                    ss=ss+n.substring(1)+ch+"ma";
                for (int x=1; x<=cnt; x++)
                {
                    ss=ss+"a";
                }
                ss=ss+" ";
            }
        }
        ss=ss.trim();
        return ss;
    }
}
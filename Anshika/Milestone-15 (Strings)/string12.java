/**
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.

Given a balanced string s split it in the maximum amount of balanced strings.

Return the maximum amount of splitted balanced strings.

 

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
Example 2:

Input: s = "RLLLLRRRLR"
Output: 3
Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
Example 3:

Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".
Example 4:

Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'
 

Constraints:

1 <= s.length <= 1000
s[i] = 'L' or 'R'
 */

class string12 {
    public int balancedStringSplit(String s) {
        int cnt=0, r=0, l=0;
        String n="";

        for (int i=0; i<s.length()-1; i++)
        {

            for (int j=i+1; j<s.length(); j++)
            {
                n=s.substring(i, j+1);
                
                r=0; l=0;
                for (int k=0; k<n.length(); k++)
                {
                    if (n.charAt(k)=='R')
                        r++;
                    else
                        l++;
                }
                if (r==l)
                { cnt++;
                i=j+1;
                }
            }
        }
        return cnt;
    }
}
/*You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].

Example:

Input: [5,2,6,1]
Output: [2,1,1,0] 
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.*/

class array17 {
    public List<Integer> countSmaller(int[] nums) {
        int cnt=0;
        List<Integer> ar=new ArrayList<Integer>();
        for (int i=0; i<nums.length; i++)
        {
            cnt=0;
            for (int j=i+1; j<nums.length; j++)
            {
                if (nums[i]>nums[j])
                    cnt++;
            }
            ar.add(cnt);
        }
        return ar;
    }
}
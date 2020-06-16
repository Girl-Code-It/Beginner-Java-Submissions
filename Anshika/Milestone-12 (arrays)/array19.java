/*Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]*/

class array19 {
    public int[] searchRange(int[] nums, int target) {
        int store0=-1, store1=-1;
        for (int i=0; i<nums.length; i++)
        {
            if(nums[i]==target)
            {
                store0=i;
                break;
            }
        }
        for (int j=nums.length-1; j>=0; j--)
        {
            if (nums[j]==target)
            {  
                store1=j;
                break;
            }
        }
        int ar[]={store0, store1};
        return ar;
        
    }
}
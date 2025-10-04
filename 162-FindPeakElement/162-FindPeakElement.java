// Last updated: 10/4/2025, 2:35:31 PM
class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
        {
            return 0;
        }
        if (nums[1] < nums[0])
        {
            return 0;
        }
        for (int i = 1; i < nums.length-1; i++)
        {
            if (nums[i-1]< nums[i] && nums[i]>nums[i+1])
            {
                return i;
            }
        }
        if (nums[nums.length-2] < nums[nums.length-1])
        {
            return nums.length-1;
        }
        return -1;
    }
}
// Last updated: 10/4/2025, 2:35:41 PM
class Solution {
    public boolean search(int[] nums, int target) {
        if (nums[0] == target)
        {
            return true;
        }
        if (nums[0] > target)
        {
            for (int i = nums.length-1; i > 0; i--)
            {
                if (nums[i] == target)
                {
                    return true;
                }
                if (nums[i] < nums[i-1])
                {
                    break;
                }
            }
        } else{
            for (int i = 1; i < nums.length; i++)
            {
                if (nums[i] == target)
                {
                    return true;
                }
                if (nums[i] < nums[i-1])
                {
                    break;
                }
            }
        }
        return false;
    }
}
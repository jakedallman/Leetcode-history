// Last updated: 10/4/2025, 2:35:51 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] >= target)
            {
                return i;
            }
        }
        return nums.length;
    }
}
// Last updated: 10/4/2025, 2:35:33 PM
class Solution {
    public int findMin(int[] nums) {
        for (int i = 0; i < nums.length-1;i++)
        {
            if (nums[i] > nums[i+1])
            {
                return nums[i+1];
            }
        }
        return nums[0];
    }
}
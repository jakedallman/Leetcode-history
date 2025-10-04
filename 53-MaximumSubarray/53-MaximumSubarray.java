// Last updated: 10/4/2025, 2:35:48 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int max = -99999;
        int current = 0;
        for (int i = 0; i < nums.length;i++)
        {
            current+=nums[i];
            if (current > max)
            {
                max = current;
            }
            if (current < 0)
            {
                current = 0;
            }
        }
        return max;
    }
}

// Last updated: 10/4/2025, 2:34:59 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int item : nums)
        {
            sum+=item;
        }
        int halfSum = 0;
        for (int i = 0; i < nums.length;i++)
        {
            if (halfSum == sum-halfSum-nums[i])
            {
                return i;
            }
            halfSum+=nums[i];
        }
        return -1;
    }
}
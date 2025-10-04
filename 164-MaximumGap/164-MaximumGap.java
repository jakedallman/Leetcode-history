// Last updated: 10/4/2025, 2:35:31 PM
class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2)
        {
            return 0;
        }
        Arrays.sort(nums);
        int max = -99;
        for (int i = 0; i < nums.length-1; i++)
        {
            if (Math.abs(nums[i+1] - nums[i]) > max)
            {
                max =Math.abs(nums[i+1] - nums[i]);
            }
        }
        return max;
    }
}
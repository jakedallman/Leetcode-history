// Last updated: 10/4/2025, 2:35:01 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = -9999999;
        for (int i = 0; i <= nums.length-k;i++)
        {
            int sum = 0;
            for (int p = i; p < i+k;p++)
            {
                sum+=nums[p];
            }
            if (sum > max)
            {
                max = sum;
            }
        }
        return max/ (double) k;
    }
}
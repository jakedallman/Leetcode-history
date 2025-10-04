// Last updated: 10/4/2025, 2:35:58 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = -100000000;
        int holder = Math.abs(sum-target);
        for (int i = 0; i < nums.length-2;i++)
        {
            for (int j = i+1; j < nums.length-1;j++)
            {
                for (int k = j+1; k< nums.length;k++)
                {
                    if (holder > Math.abs(nums[i]+nums[j]+nums[k]-target))
                    {
                        holder = Math.abs(nums[i]+nums[j]+nums[k]-target);
                        sum = nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return sum;
    }
}
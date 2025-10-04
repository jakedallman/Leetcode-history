// Last updated: 10/4/2025, 2:35:17 PM
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1;i++)
        {
            if (nums[i]==nums[i+1])
            {
                return nums[i];
            }
        }
        return -1;

    }
}
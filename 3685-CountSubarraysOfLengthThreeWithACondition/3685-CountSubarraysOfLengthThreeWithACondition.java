// Last updated: 10/4/2025, 2:34:51 PM
class Solution {
    public int countSubarrays(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length-2;i++)
        {
            if ((nums[i]+nums[i+2])*2 == nums[i+1])
            {
                counter++;
            }
        }
        return counter;
    }
}
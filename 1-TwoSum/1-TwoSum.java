// Last updated: 10/4/2025, 2:36:07 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i <nums.length;i++)
        {
            for (int j =i+1; j < nums.length; j++)
            {
                if (target-nums[i]==nums[j])
                {
                    int [] output = {i,j};
                    return output;
                }
            }
            
        }
        return null;
    }
}
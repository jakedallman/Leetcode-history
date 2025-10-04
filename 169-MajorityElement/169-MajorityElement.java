// Last updated: 10/4/2025, 2:35:29 PM
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == candidate)
            {
                count++;
            } else{
                count--;
            }
            if (count == 0)
            {
                candidate = nums[i];
                count++;
            }
        }
        return candidate;
    }
}
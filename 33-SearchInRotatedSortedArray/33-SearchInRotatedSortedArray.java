// Last updated: 10/4/2025, 2:35:52 PM
class Solution {
    public int search(int[] nums, int target) {
        Boolean higher = true;
        if (target >= nums[0])
        {
            for (int i = 0; i < nums.length; i++)
            {
                if (nums[i]==target)
                {
                    return i;
                }
            }
        } else{
            for (int i = nums.length-1; i > 0; i--)
            {
                if (nums[i]==target)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
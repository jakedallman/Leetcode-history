// Last updated: 10/4/2025, 2:35:42 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        boolean repeat = false;
        int counter = 0;
        for (int i = 2; i < nums.length; i++)
        {
            if (nums[i-2] == nums[i-1] && nums [i-1]==nums[i])
            {
                nums[i-2] = 99999;
                counter++;
            }
        }
        Arrays.sort(nums);
        return nums.length-counter;
    }
}
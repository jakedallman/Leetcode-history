// Last updated: 10/4/2025, 2:35:43 PM
class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++)
        {
            int temp = nums[i];
            for (int j = i; j < nums.length;j++)
            {
                if (nums[j] < temp)
                {
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i--;
                    break;
                }
            }
        }
    }
}
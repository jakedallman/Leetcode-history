// Last updated: 10/4/2025, 2:35:03 PM
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length-1;i++)
        {
            for (int j = i+1; j < nums.length-1;j++)
            {
                int max = nums[i]+nums[j];
                int index = j+1;
                while (nums[index] < max)
                {
                    sum++;
                    index++;
                    if (index == nums.length)
                    {
                        break;
                    }
                }
            }
        }
        return sum;
    }
}
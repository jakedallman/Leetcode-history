// Last updated: 10/4/2025, 2:35:47 PM
class Solution {
    public boolean canJump(int[] nums) {
        boolean impossible = false;
        for (int i = 0; i < nums.length-1;i++)
        {
            if (nums[i]==0)
            {
                for (int j = i; j >= 0; j--)
                {
                    if (nums[j]+j > i)
                    {
                        break;
                    }
                    if (j == 0)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
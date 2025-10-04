// Last updated: 10/4/2025, 2:35:52 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] output = new int[2];
        output[0] = -1;
        output[1] = -1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == target)
            {
                output[0] = i;
                break;
            }
        }
        if (output[0] == -1)
        {
            return output;
        }
        for (int i = output[0]; i < nums.length; i++)
        {
            if (i+1 < nums.length)
            {
                if (nums[i+1] != target)
                {
                    output[1]= i;
                    break;
                }
            } else{
                output[1] = i;
            }
        }
        return output;
    }
}
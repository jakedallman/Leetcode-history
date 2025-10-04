// Last updated: 10/4/2025, 2:35:18 PM
class Solution {
    public int missingNumber(int[] nums) {
        Set <Integer> stor = new HashSet<>();
        for (int item : nums)
        {
            stor.add(item);
        }
        for (int i = 0; i <= nums.length +1;i++)
        {
            if (stor.add(i))
            {
                return i;
            }
        }
        return -1;
    }
}
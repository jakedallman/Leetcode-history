// Last updated: 10/4/2025, 2:35:35 PM
class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int item : nums)
        {
            sum ^= item;
        }
        return sum;
    }
}
// Last updated: 10/4/2025, 2:35:04 PM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        for (int i = 0; i < nums.length;i+=2)
        {
            total+=nums[i];
        }
        return total;
    }
}
// Last updated: 10/4/2025, 2:35:02 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(Math.abs(nums[0])*Math.abs(nums[1])*nums[nums.length-1], nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1]);
    }
}
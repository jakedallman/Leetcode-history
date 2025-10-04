// Last updated: 10/4/2025, 2:35:26 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int [] temp = new int[nums.length];
        for (int i = 0; i < nums.length;i++)
        {
            temp[i] = nums[i];
        }
        for (int i = 0; i < nums.length;i++)
        {
            nums[i] = temp[(80*nums.length+i-k)%(nums.length)];
        }
    }
}
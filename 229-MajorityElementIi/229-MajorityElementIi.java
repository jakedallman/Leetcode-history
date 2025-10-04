// Last updated: 10/4/2025, 2:35:23 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < nums.length-nums.length/3; i++)
        {
            int number = nums[i];
            if (output.contains(number))
            {
                continue;
            }
            int count = 1;
            for (int j = i+1; j < nums.length; j++)
            {
                if (nums[j]==number)
                {
                    count++;
                }
            }
            if (count > nums.length/3)
            {
                output.add(number);
            }
        }
        return output;
    }
}
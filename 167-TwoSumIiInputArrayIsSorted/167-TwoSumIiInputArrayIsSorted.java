// Last updated: 10/4/2025, 2:35:30 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] temp= new int[2];
        for (int i = 0; i < numbers.length-1; i++)
        {
            for (int j = i+1; j < numbers.length;j++)
            {
                if (numbers[i]+ numbers[j] == target)
                {
                    temp[0] = 1+i;
                    temp[1] = j+1;
                    return temp;
                }
            }
        }
        return temp;
    }
}
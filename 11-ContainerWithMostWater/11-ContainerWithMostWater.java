// Last updated: 10/4/2025, 2:36:01 PM
class Solution {
    public int maxArea(int[] height) {
        int max =0;
        int highest = 0;
        int right = height[height.length-1];
        int left = height[0];
        for (int i =0; i <= height.length-1; i++)
        {
            if (height[i] >= left)
            {
                left = height[i];
                for (int j =height.length-1;j > i; j--)
                {
                    if (height[j] >= right)
                    {
                        if (height[j]>height[i])
                        {
                            max = height[i];
                        } else {
                            max = height[j];
                        }
                        if (max*(j-i) > highest)
                        {
                            highest = max*(j-i);
                        }
                        right = height[j];
                    }
                }
                right = height[height.length-1];
            }

        }
        return highest;
    }
}
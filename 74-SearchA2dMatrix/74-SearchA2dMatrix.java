// Last updated: 10/4/2025, 2:35:43 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] list : matrix)
        {
            if (list[0] <= target && list[list.length-1] >= target)
            {
                for (int i = 0; i < list.length; i++)
                {
                    if (list[i] == target)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
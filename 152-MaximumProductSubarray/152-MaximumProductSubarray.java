// Last updated: 10/4/2025, 2:35:34 PM
class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = -999;
        int currentProduct = 1;
        for (int j = 0; j < nums.length;j++)
        {
            for (int i = j; i < nums.length;i++)
            {
                currentProduct*=nums[i];
                if (currentProduct > maxProduct)
                {
                    maxProduct = currentProduct;
                }
                if (currentProduct == 0)
                {
                    currentProduct = 1;
                }
                
            }
            currentProduct = 1;
        }
        return maxProduct;
    }
}
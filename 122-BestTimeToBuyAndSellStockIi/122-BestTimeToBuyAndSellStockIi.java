// Last updated: 10/4/2025, 2:35:37 PM
class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 0; i < prices.length-1; i++)
        {
            for (int j = i+1; j < prices.length; j++)
            {
                if (prices[j]-prices[i] > 0)
                {
                    sum += prices[j]-prices[i];
                    break;
                }
                if (prices[i] >= prices[j])
                {
                    break;
                }

            }
        }
        return sum;
    }
}
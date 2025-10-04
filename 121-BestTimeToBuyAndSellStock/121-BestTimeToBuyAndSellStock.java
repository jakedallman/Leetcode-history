// Last updated: 10/4/2025, 2:35:37 PM
class Solution {
    public int findBiggestAfter(int a, int [] prices)
    {
        int max = a;
        for (int i = a+1; i < prices.length; i++)
        {
            if (prices[i] > prices[max])
            {
                max = i;
            }
        }
        return max;
    }
    public int maxProfit(int[] prices) {
        int lowest = 0;
        int biggest = findBiggestAfter(0, prices);
        int maxProfit = 0;
        if (prices.length > 1)
        {
            maxProfit = prices[1]-prices[0];
        }
        if (prices[biggest]-prices[lowest] > maxProfit)
        {
            maxProfit = prices[biggest]-prices[lowest];
        }
        
        for (int i = 0; i < prices.length-1; i++)
        {
            if (prices[i] >= prices[lowest])
            {
                continue;
            } else{
                lowest=i;
            }
            if (i >= biggest)
            {
                biggest = findBiggestAfter(i,prices);
            }
            if (prices[biggest]-prices[lowest] > maxProfit)
            {
                maxProfit = prices[biggest]-prices[lowest];
            }
        }
        if (maxProfit < 0)
        {
            return 0;
        } else{
            return maxProfit;
        }
    }
}